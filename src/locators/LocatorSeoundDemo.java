package locators;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class LocatorSeoundDemo {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	@Test
	void locator() throws Exception {
		driver.get("http://www.hyderabadreport.com/user");
		Thread.sleep(3000);
		
		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
				System.out.println(totalLinks.size());
		
		
	/*	driver.findElement(By.id("edit-name")).sendKeys("Komal");
		driver.findElement(By.name("pass")).sendKeys("Kiran123");
	//	driver.findElement(By.className("form-submit")).click();
		driver.findElement(By.cssSelector("input.form-submit")).click();
		driver.findElement(By.id("edit-name")).clear();
		driver.findElement(By.id("edit-name")).sendKeys("Kiran");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Photos")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Us")).click(); */
		
		
	}

}
