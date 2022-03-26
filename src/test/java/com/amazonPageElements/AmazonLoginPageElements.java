package com.amazonPageElements;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonLoginPageElements {
	@FindBy(id = "ap_email")
	public WebElement userId;
	
	@FindBy(xpath ="//*[@id=\"continue\"]")
	public WebElement clickContinue;

	@FindBy(name = "password")
	public WebElement password;

	@FindBy(id = "signInSubmit")
	public WebElement signinBtn;

	@FindBy(id = "auth-error-message-box")
	public WebElement errorMsg;

	

	


}
