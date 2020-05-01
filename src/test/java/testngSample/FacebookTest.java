package testngSample;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.common.collect.ObjectArrays;

public class FacebookTest extends BaseClaseTest {
	@BeforeClass
	private void launchBrowser() {
		openBrowser();
	}
	@AfterClass
	private void close() {
		System.out.println("Success");
	}
	@BeforeMethod
	private void startTime() {
		dateTime();
	}
	@AfterMethod
	private void endTime() {
		dateTime();
	}

	@DataProvider(name="testdata")
	public Object[][] data() {
		return new Object [][] {
			{"java", "selenium"},
			{"shanmu", "theni"},
			{"arun", "greens"}
		};
	}

	@Test(dataProvider="testdata")
	private void userPass(String s1, String s2) {
		LoadUrl("https://www.facebook.com/");
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys(s1);
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys(s2);
		WebElement btnLogin = driver.findElement(By.id("loginbutton"));
		btnLogin.click();
	}


}

