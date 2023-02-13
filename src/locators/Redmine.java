package locators;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Redmine {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	@Test
	void redmine() throws Exception {
		driver.get("https://www.redmine.org/");
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div/ul/li[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("kiran");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div[1]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("Heloo");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[1]/div[3]/div[2]/div[1]/form/table/tbody/tr[3]/td[2]/label/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/form/table/tbody/tr[4]/td[2]/input")).click();
		
		/*driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("Kiran");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("Komal");
		Thread.sleep(3000);
		driver.findElement(By.id("autologin")).click(); */
	
		
		
		
	}

}
