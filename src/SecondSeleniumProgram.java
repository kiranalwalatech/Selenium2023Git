import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondSeleniumProgram {

	static WebDriver driver;
	
	public static void main(String[] args) 
		
		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		
	

	}

}
