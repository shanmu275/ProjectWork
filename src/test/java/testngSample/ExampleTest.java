package testngSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ExampleTest extends BaseClaseTest{

	@Test
	public void browserOpen() {
		openBrowser();
	}

	@Test
	public void facebooktest() throws InterruptedException {
		LoadUrl("https://www.facebook.com/");
		Thread.sleep(5000);
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("shanmugam");
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("theni");
		WebElement btnLogin = driver.findElement(By.id("loginbutton"));
		btnLogin.click();
	}

}
