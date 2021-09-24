package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLogin {

	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		
	}
	
	@Test
	public void doLogin() {
		driver.get("https://portal-staging.vizidox.com");
		driver.findElement(By.id("username")).sendKeys("chautran@mailinator.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("kc-login")).click();
		
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}
