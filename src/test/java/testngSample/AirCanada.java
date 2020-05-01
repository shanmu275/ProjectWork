package testngSample;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AirCanada extends BaseClaseTest{

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
		Date d=new Date();
		System.out.println(d);
	}
	@AfterMethod
	private void endTime() {
		Date d=new Date();
		System.out.println(d);
	}
	@Test(priority=-1, enabled=false)
	private void maximise() {
		Maxi();
	}
	@Test(priority=0)
	private void air() {
		LoadUrl("https://www.aircanada.com/ca/en/aco/home.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement lang = driver.findElement(By.id("enUSEdition"));
		System.out.println(lang.isDisplayed());
		Actions a=new Actions(driver);
		a.moveToElement(lang).perform();
		lang.click();
//		WebElement org = driver.findElement(By.xpath("//span[@class='value']"));
//		org.sendKeys("chennai");
	}		

}
