package testngSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ExampleOne extends BaseClaseTest {

	@Test
	public void browserConfig() {
		openBrowser();
	}

	@Test
	public void flipkart() throws InterruptedException {
		LoadUrl("https://www.flipkart.com/");
		Thread.sleep(5000);
		WebElement logClick = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		logIn(logClick);
		WebElement srch = driver.findElement(By.xpath("//input[@name='q']"));
		fill(srch, "corona mask");
		WebElement srbtn = driver.findElement(By.xpath("//button[@class='vh79eN']"));
		logIn(srbtn);
	}

}

