package testngSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class CrossBrowser {

	public WebDriver driver;
	@Parameters({ "browser" })
	@Test
	public void tc1(String s1) {
		if (s1.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\ELCOT\\eclipse-workspace\\testngSample\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			String title = driver.getTitle();
			Assert.assertTrue(title.contains("facebook"), "verify title");
			WebElement txtEmail = driver.findElement(By.id("email"));
			txtEmail.sendKeys("shanmu");
		}
		else if (s1.equals("ff")) {
			System.setProperty("webdriver.gecko.driver", 
					"C:\\Users\\ELCOT\\eclipse-workspace\\testngSample\\Driver\\geckodriver.exe");
			driver=new FirefoxDriver()	;
			driver.get("https://www.flipkart.com/");
		}
		else {
			System.setProperty("webdriver.ie.driver", 
					"C:\\Users\\ELCOT\\eclipse-workspace\\testngSample\\Driver\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			driver.get("https://www.amazon.in/");
		}
		
	}
}
