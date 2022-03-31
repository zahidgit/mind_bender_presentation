package com.amazonStepDefinition;

import com.amazonPageAction.AmazonLOginPageAction;
import com.amazonPageAction.BurgerToCategoryActions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BurgerToCategoryStepDefinitions {

	 
	
	
	BurgerToCategoryActions BurgerAct = new BurgerToCategoryActions();
	AmazonLOginPageAction Logobject = new AmazonLOginPageAction();
	
		@Given("User in Amazon Home page")
		public void user_in_Amazon_Home_page() {
		BurgerAct.getAmazonLoginPage();
	    
		}

		@When("User clicks Burger Menu")
		public void user_clicks_Burger_Menu() throws InterruptedException {
			BurgerAct.BurgerMenu();
	    
		}

		@When("User clicks on Prime Video")
		public void user_clicks_on_Prime_Video() {
			BurgerAct.PrimeOpt();
		}

		@When("User clicks on Prime Video again")
		public void user_clicks_on_Prime_Video_again() throws InterruptedException {
			BurgerAct.Channels(null);
		}

		@Then("User should able to land on Amazon Prime Video")
		public void user_should_able_to_land_on_Amazon_Prime_Video() throws InterruptedException {
			BurgerAct.Channels(null);
			
		}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
