package testngSample;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class flipkartTest extends BaseClaseTest {

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
	@Test(priority=-1, enabled=true)
	private void maximise() {
		Maxi();
	}
	@Test(priority=0)
	private void flip() {
		LoadUrl("https://www.flipkart.com/");
		WebElement logClick = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		logIn(logClick);
	}		
	@Test(priority=1)
	private void searchBox() {
		WebElement srch = driver.findElement(By.xpath("//input[@name='q']"));
		fill(srch, "corona mask");
		WebElement srbtn = driver.findElement(By.xpath("//button[@class='vh79eN']"));
		logIn(srbtn);
	}

}
