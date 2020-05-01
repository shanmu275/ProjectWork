package testngSample;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClaseTest {

	public static WebDriver driver;
	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SampleMaven\\Driver80\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	public static void Maxi() {
		driver.manage().window().maximize();
	}
	public static void LoadUrl(String url) {
		driver.get(url);
	}
	public static void pageTitle() {
		driver.getTitle();
	}
	public static void pageUrl() {
		driver.getCurrentUrl();
	}

	public static void fill(WebElement e, String value) {
		e.sendKeys(value);
	}

	public static void logIn(WebElement e) {
		e.click();
	}
	public void dateTime() {
		Date d=new Date();
		System.out.println(d);
	}
	public void elementWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void mouseAction(WebElement e) {
		Actions a=new Actions(driver);
		a.moveToElement(e).perform();
	}

}
