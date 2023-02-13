package testngprogram;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNg_SkipDown {
	WebDriver driver;
	
  @Test (priority=0,enabled=false)
  public void register() {
	  driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[2]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("Kiran");
	  
  }
  
  @Test
  public void singnin() {
	  driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[1]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("komal");
	  driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys("Helo");
  }
  
  @Test 
  public void menus() {
	  driver.findElement(By.xpath("//*[@id=\"top-menu\"]/ul/li[1]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"top-menu\"]/ul/li[2]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"top-menu\"]/ul/li[3]/a")).click();
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.redmine.org/");
	  
  }

}
