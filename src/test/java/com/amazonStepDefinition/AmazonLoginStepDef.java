package com.amazonStepDefinition;

import com.amazonPageAction.AmazonLOginPageAction;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonLoginStepDef {
	
	AmazonLOginPageAction actions = new AmazonLOginPageAction();
	
	@Given("user is in amazon login page")
	public void user_is_in_amazon_login_page() {
		actions.getAmazonLoginPage();
	   
	}

	@When("when user enters correct email address {string}")
	public void when_user_enters_correct_email_address(String userId) {
		actions.inputUserId(userId);
	    
	}

	@When("user clicks continue")
	public void user_clicks_continue() {
		actions.clickContinue();
	   
	}

	@When("user enters correct password {string}")
	public void user_enters_correct_password(String password) {
	   actions.inputPassword(password);
	}


	@When("user clicks sign-in")
	public void user_clicks_sign_in() {
		actions.signin();
	    
	}

	@Then("user able to log-in")
	public void user_able_to_log_in() {
		
	   
	}

}
