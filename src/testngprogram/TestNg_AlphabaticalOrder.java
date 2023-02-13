package testngprogram;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNg_AlphabaticalOrder {
	WebDriver driver;
	
  @Test
  public void twitter() {
	  driver.get("https://www.twitter.com/"); 
	  System.out.println("twitter");
  }
  @Test
  public void facebook() {
	  driver.get("https://www.facebook.com/"); 
      System.out.println("FB");
  }
  @Test
  public void google() {
	  driver.get("https://www.google.com/");  
	  System.out.println("google");
	  
  }
  @Test
  public void selenium() {
	  driver.get("https://www.selenium.dev/");  
	  System.out.println("Selenium");
  }
  @Test
  public void gmail() {
	  driver.get("https://www.gmail.com/");  
	  System.out.println("gmail");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
