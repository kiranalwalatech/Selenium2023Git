import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecoundProgram {

	static WebDriver driver;
	public static void main(String[] args)
		System.setProperty("webdriver.chrome.driver", "D:\\library\\chrome.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		

	}

}
