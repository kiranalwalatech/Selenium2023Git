package seleniumtraning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstSeleniumProject {

	static WebDriver driver;
public static void main(String[] args) {
		
		//Laptop a=new Laptop(); "a" is the object of Laptop class/ interface
		
		//System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver.exe");
	    System.setProperty("webdriver.edge.driver","D:\\\\library\\\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize(cmd);
		driver.get("https://www.talteam.com");	
		driver.findElement(By.linkText("Careers")).click();
	
	
	}

}
