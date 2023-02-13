package testngprogram;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TimeoutFeature {
	WebDriver driver;
	
  @Test
  public void withouttimeout() {
	  driver.get("https://www.google.co.in/");
	  driver.findElement(By.name("q")).sendKeys("Hyberbad");
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
  }
  
	
  @Test(timeOut=2000)
  public void withtimeout() {
	  driver.get("https://www.google.co.in/");
	  driver.findElement(By.name("q")).sendKeys("Tirupathi");
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize(); 
	  }

}