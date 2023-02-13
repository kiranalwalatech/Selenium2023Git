package junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class JUnitDemo {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	@Test
	void test1() {
		driver.get("https://www.google.com/");
	}
		
		
		@Test
		void test2() {
			driver.get("https://www.facebook.com/");
		}
			
			@Test
			void test3() {
				driver.get("https://www.redmine.org/");
			}
			
				@Test
				void test4() {
					driver.get("https://www.selenium.dev/");
				}
}
			
		
	


