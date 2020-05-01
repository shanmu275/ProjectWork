package testngSample;

import java.util.Date;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.internal.BaseClassFinder;

public class TestSample extends BaseClaseTest {

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
	@Test(priority=-1, enabled=false)
	private void maximise() {
		Maxi();
	}

	@Test
	private void face() {
		LoadUrl("https://www.facebook.com/");
	}

	@Parameters({"Email", "password"})
	@Test(priority=1)
	private void userName(@Optional("shanmugam")String s1, String s2) {
		FbPojo f=new FbPojo();
		fill(f.getTxtEmail(), s1);
		fill(f.getTxtPass(), s2);
		logIn(f.getLgbtn());
	}
}

