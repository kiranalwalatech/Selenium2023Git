package alertbutton;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertButton {
	WebDriver driver;
	 @Test
	  public void alertbutton() throws Exception {
		  driver.get("http://www.seleniumlearn.com/how-handle-alert-box-using-selenium");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id=\"node-100\"]/div/div[1]/div/div/button")).click();
		  Thread.sleep(4000);
		  driver.switchTo().alert().dismiss();
		  
	  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
