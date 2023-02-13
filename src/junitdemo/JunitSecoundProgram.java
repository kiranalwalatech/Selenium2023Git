package junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class JunitSecoundProgram {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.close();
	}
    @Disabled
	@Test
	void Selenium() {
		driver.get("https://www.selenium.dev");
		
	}
	@Test
	void google() {
		driver.get("https://www.google.com");
		
	}
	@Test
	void twitter() {
		driver.get("https://www.twitter.com");
		
	}
	@Test
	void facebook() {
		driver.get("https://www.facebook.com");
		
	}
}
