package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.locators.RelativeLocator;

public class TestRelativeLocators {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("email")).sendKeys("chautran@mailinator.com");
//		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		
//		driver.findElement(RelativeLocator.withTagName("input").toRightOf(By.linkText("Signin"))).click();
		driver.findElement(RelativeLocator.withTagName("input").toRightOf(By.xpath("(//input[@type='submit'])[2]"))).click();
		
	}
}
