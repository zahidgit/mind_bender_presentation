package com.amazonStepDefinition;
 
import com.amazonPageAction.BacktoAmazonActions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BacktoAmazonStepDefinitions {

	BacktoAmazonActions Back = new BacktoAmazonActions();
	
			@Given("I am on Amazon Homepage")
			public void i_am_on_Amazon_Homepage() {
			Back.getAmazonLoginPage();
			}

			@Given("User clicks on Amazon Home")
			public void user_clicks_on_Amazon_Home() throws InterruptedException {
				Back.AmazonHomeMenu();
			}	

			@Given("User clicks on Shop by Style")
			public void user_clicks_on_Shop_by_Style() {
				Back.AmazonStyle();
			}

			@Given("I click on Amazon logo")
			public void i_click_on_Amazon_logo() throws InterruptedException {
				Back.Logo();
			}

			@Then("I am back on Amazon Homepage")
			public void i_am_back_on_Amazon_Homepage() {
				Back.getAmazonLoginPage();
			}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
