package com.amazonPageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.amazonPageElements.RegistrationElements;
import com.amazonUtilities.SetupDriver;

public class RegistrationAction {
	RegistrationElements pageElements;
	
	public RegistrationAction() {
		pageElements = new RegistrationElements();
		PageFactory.initElements(SetupDriver.driver, pageElements);
	}
	public void getAmazonLoginPage() {
		SetupDriver.driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		SetupDriver.driver.manage().window().maximize();
		SetupDriver.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	}
	
	public void createAmazonAccount() {
		pageElements.createAmazonAcc.click();
	}
	public void customerName(String name) {
		pageElements.customerName.sendKeys(name);
		
	}
	public void inputEmail (String email) {
		pageElements.customerEmail.sendKeys(email);
	}
	public void inputPassword (String password) {
		pageElements.putPassowrd.sendKeys(password);
	}
	public void confirmPassword(String confirm_passowrd) {
		pageElements.confirmPassword.sendKeys(confirm_passowrd);
	}
	public void verifyEmail() {
		pageElements.verifyEmailLink.click();
	}
	public String getNameErrorText() {
		return pageElements.nameErrorMsg.getText();
		
	}
	public String getEmailErrorMsg() {
		return pageElements.missingEmailErrorMsg.getText();
	}
	public String getPasswordReqError() {
		return pageElements.minimumPassReqErrorMsg.getText();
	}
	public String getPassConformationError() {
		return pageElements.passwordNotMatchingErrorMsg.getText();
	}

}
