package testngprogram;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNgGroupTestCase {
	WebDriver driver;
	
  @Test(groups="Regression")
  public void google() {
	  driver.get("https://www.google.co.in/");
  }
  
  @Test(groups="Regression")
  public void selenium() {
	  driver.get("https://www.selenium.dev/");
  }
  
  @Test(groups="Social")
  public void facebook() {
	  driver.get("https://www.facebook.com/");
  }
  
  @Test(groups="Regression")
  public void gmail() {
	  driver.get("https://www.gmail.com/");
  }
  
  @Test(groups="Social")
  public void twitter() {
	  driver.get("https://www.twitter.com/");
  }
  
  @Test(groups="Social")
  public void whatapp() {
	  driver.get("https://web.whatsapp.com/m/");
  }
  
  @BeforeTest(groups="Social")
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
