package testngSample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbPojo extends BaseClaseTest{
	public FbPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id= "email")
	private WebElement txtEmail;

	@FindBy(id= "pass")
	private WebElement txtPass;

	@FindBy(id="loginbutton")
	private WebElement lgbtn;
	
	public WebElement getLgbtn() {
		return lgbtn;
	}

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}
}
