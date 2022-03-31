package com.amazonPageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationElements {
	
	@FindBy(id = "createAccountSubmit")
	public WebElement createAmazonAcc;
	
	@FindBy(id ="ap_customer_name")
	public WebElement customerName;

	@FindBy(id = "ap_email")
	public WebElement customerEmail;

	@FindBy(id = "ap_password")
	public WebElement putPassowrd;

	@FindBy(id = "ap_password_check")
	public WebElement confirmPassword;
	
	@FindBy (id ="continue")
	public WebElement verifyEmailLink;
	
	@FindBy (xpath= "//*[@id=\"auth-customerName-missing-alert\"]/div/div")
	public WebElement nameErrorMsg;
	
	@FindBy (xpath= "//*[@id=\"auth-email-missing-alert\"]/div/div")
	public WebElement missingEmailErrorMsg;
	
	@FindBy (xpath= "//*[@id=\"auth-password-missing-alert\"]/div/div")
	public WebElement minimumPassReqErrorMsg;
	
	@FindBy (xpath= "//*[@id=\"auth-password-mismatch-alert\"]/div/div")
	public WebElement passwordNotMatchingErrorMsg;

}
