package testngSample;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeconfTestng {
	@Test
	public void firsttest() {
		System.out.println("Test 1");
	}
	@Test
	public void secondTest() {
		Assert.assertTrue(false);
		System.out.println("Test 2");
	}
	@Test
	public void thirdTest() {
		System.out.println("Test 3");
	}
	@Test
	public void fourthTest() {
		Assert.assertTrue(false);
		System.out.println("Test 4");
	}
}
