package com.amazonPageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.amazonPageElements.AmazonLoginPageElements;
import com.amazoUtilities.SetupDriver;


public class AmazonLoginPageAction {
	
	AmazonLoginPageElements pageElement;
	
	public AmazonLoginPageAction() {
		pageElement = new AmazonLoginPageElements();
		PageFactory.initElements(SetupDriver.driver, pageElement);
	}
 
	public void getAmazonLoginPage() {
		SetupDriver.driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		SetupDriver.driver.manage().window().maximize();
		SetupDriver.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	}

	public void inputUserId(String userId) {
		System.out.println("Passing UserId");
		pageElement.userId.sendKeys(userId);
	}

	public void clearUserID() {
		pageElement.userId.clear();
	}
	public void clickContinue() {
		pageElement.clickContinue.click();
	}
	
	
	@FindBy(id = "ap_email")
	public WebElement userId;
	
	@FindBy(xpath ="//*[@id=\"continue\"]")
	public WebElement clickContinue;


	public void inputPassword(String password) {
		System.out.println("Passing Password");
		pageElement.password.sendKeys(password);
	}

	public void clearPassword() {
		pageElement.password.clear();
	}

	public void signin() {
		System.out.println("Clicking Submit Button");
		pageElement.signinBtn.click();
	}

	public boolean errorMessage() {
		boolean bool = false;
		String errorMsg = pageElement.errorMsg.getText();
		if (errorMsg.contains("unsuccessful") || errorMsg.contains("Something") || errorMsg.contains("added")) {
			bool = true;
		}

		return bool;
	}

	public String getErrorMessage() {
		String error;
		error = pageElement.errorMsg.getText();
		return error;
	}

	

}
