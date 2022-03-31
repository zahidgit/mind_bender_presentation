package com.amazonStepDefinition;

import org.testng.Assert;

import com.amazonPageAction.RegistrationAction;
import com.amazonUtilities.Helper;
import com.amazonUtilities.SetupDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationStepDef {
	
	RegistrationAction actions = new RegistrationAction();
	SetupDriver drive = new SetupDriver();
	
//	@Given("user is in amazon login page")
//	public void user_is_in_amazon_login_page() {
//		actions.getAmazonLoginPage();
//	}
	@When("user clicks on create account")
	public void user_clicks_on_create_account() {
		actions.getAmazonLoginPage();
		actions.createAmazonAccount();   
	}

	@When("user enters a valid email in email input field {string}")
	public void user_enters_a_valid_email_in_email_input_field(String email) {
		actions.inputEmail(email);  
	}

	@When("user enters acceptable password in password field {string}")
	public void user_enters_acceptable_password_in_password_field(String password) {
		actions.inputPassword(password);  
	}

	@When("user re-enters passwords in re-eneter password field {string}")
	public void user_re_enters_passwords_in_re_eneter_password_field(String password) {
		actions.confirmPassword(password);  
	}

	@When("user clicks verify email button")
	public void user_clicks_verify_email_button() {
		actions.verifyEmail();  
	}

	@Then("user verifies missing name error messages")
	public void user_verify_missing_name_error_message() {
		Assert.assertEquals(actions.getNameErrorText(), "Enter your name");
	}

@When("user enters user name in name input field {string}")
public void user_enters_user_name_in_name_input_field(String name) {
	actions.customerName(name);
    
}

@Then("missing email error masage appears")
public void missing_email_error_masage_appears() {
	actions.getEmailErrorMsg();
   
}

@Then("user verifies missing email test visible")
public void user_verifies_missing_email_test_visible() {
    Assert.assertEquals(actions.getEmailErrorMsg(), "Enter your email or mobile phone number");
}

@Then("minimum password requirement message appear")
public void minimum_password_requirement_message_appear() {
	actions.getPasswordReqError();
    
}

@Then("user verifies password requirement message")
public void user_verifies_password_requirement_message() {
	Assert.assertEquals(actions.getPasswordReqError(), "Minimum 6 characters required");
    
}

@Then("error masage appears for password not matching")
public void error_masage_appears_for_password_not_matching() {
   actions.getPassConformationError();
}

@Then("user verify password not matching message")
public void user_verify_password_not_matching_message() {
	Assert.assertEquals(actions.getPassConformationError(), "Passwords must match");
}
@Then("missing name error masage appears")
public void missing_name_error_masage_appears() {
	actions.getNameErrorText();
}

@Then("error masage appears")
public void error_masage_appears() {
	Assert.assertEquals(actions.getPassConformationError(), "Passwords must match");
	
}

@Then("user verify page title")
public void user_verify_page_title() {
    
}

}
