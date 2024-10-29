package Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginTest {
	WebDriver driver;
	@BeforeMethod
	public void setUP() {
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		 driver.get("https://www.trademe.co.nz/a/");
		
	}
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
	
	@Test
	public void LoginWithValidCredentials() {
		
	}

}
