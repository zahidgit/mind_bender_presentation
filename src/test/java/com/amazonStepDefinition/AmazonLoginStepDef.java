package com.amazonStepDefinition;

import org.openqa.selenium.remote.service.DriverService;
import org.testng.Assert;

import com.amazonPageAction.LoginPageAction;
import com.amazonUtilities.SetupDriver;
import com.github.dockerjava.api.model.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonLoginStepDef {
	
	LoginPageAction actions = new LoginPageAction();
	SetupDriver drive = new SetupDriver();
	
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

	@Then("user loged in succesfully")
	public void user_able_to_log_in() {
		Assert.assertEquals(actions.getWelcomeText(), "Hello, Zahid");
	   //System.out.println(actions.getWelcomeText());
	}

}
