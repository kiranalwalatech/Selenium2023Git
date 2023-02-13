package locators;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class LocatorsDemo {
	static WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);
	}
	
	@Test
	void locatorstest() throws Exception {
		driver.get("http://www.hyderabadreport.com/user");
		Thread.sleep(4000);
		driver.findElement(By.linkText("Photos")).click();
	
	}
	
		
	/*	driver.findElement(By.id("edit-name")).sendKeys("Kiran");
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("Heloo123");
		Thread.sleep(3000);
	//	driver.findElement(By.className("form-submit")).click();
		Thread.sleep(3000);
	//	driver.findElement(By.cssSelector("input.form-submit")).click()
		driver.findElement(By.cssSelector(".form-submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("edit-name")).clear();
	    Thread.sleep(2000);
		driver.findElement(By.id("edit-name")).sendKeys("Surya");
		
		
	}

}
