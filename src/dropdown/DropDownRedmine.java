package dropdown;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class DropDownRedmine {
	
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@Test
	void DropDownRedmine() throws Exception {
		driver.get("https://www.redmine.org/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"user_mail\"]")).sendKeys("kiran");
		Thread.sleep(3000);
		new Select(driver.findElement(By.xpath("//*[@id=\"user_language\"]"))).selectByValue("bg");
		
		
	}

}
