package alertbutton;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class AlertTextOk {
	WebDriver driver;
  @Test
  public void alertOktext() throws Exception {
	  driver.get("http://seleniumlearn.com/prompt-dialog-box");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"node-103\"]/div/div[1]/div/div/button")).click();
	  Thread.sleep(5000);
/*      driver.switchTo().alert().sendKeys("kiran");
	  driver.switchTo().alert().accept();*/
	  
	  Alert alt = driver.switchTo().alert();
	  alt.sendKeys("kiran");
	  alt.accept();
			  
  }
  @BeforeTest
  public void beforeTest() {
        driver = new FirefoxDriver();
	  //driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  
  }

}
