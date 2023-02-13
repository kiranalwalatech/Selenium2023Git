package testngprogram;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNg_DecriptionFeature {
	WebDriver driver;
  
  @Test(priority=1,description="Register")
  public void testcase1() {
	  driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[2]/a")).click();
  }
  
  @Test(priority=1,enabled=false,description="SignIn")
  public void testcase2() {
	  driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[1]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("komal");
	  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("kiran");
  }
  
  @Test(priority=2,description="TopMenus")
  public void testcase3() {
	  driver.findElement(By.xpath("//*[@id=\"top-menu\"]/ul/li[1]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"top-menu\"]/ul/li[2]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"top-menu\"]/ul/li[3]/a")).click();
  }
  
  @Test(priority=3,description="Mainmenus")
  public void testcase4() {
	  driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/a")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.redmine.org/");
	  
  }

}
