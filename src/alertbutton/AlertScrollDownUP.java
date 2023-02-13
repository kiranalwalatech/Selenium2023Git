package alertbutton;

import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class AlertScrollDownUP {
	WebDriver driver;
  @Test
  public void ScrollDown() throws Exception {
	  driver.get("http://seleniumlearn.com/selenium-advanced");
	  Thread.sleep(3000);
	  JavascriptExecutor jsp = (JavascriptExecutor)driver;
	  jsp.executeScript("scroll(0,1000)");
	  
	  
	  
	  
  }
  
  @Test
  public void ScrollUp() throws Exception {
	  Thread.sleep(3000);
	  JavascriptExecutor jsp = (JavascriptExecutor)driver;
	  jsp.executeScript("scroll(1000,0)");
	  
	  
	  
	  
  }

}
@BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  
  }

}
