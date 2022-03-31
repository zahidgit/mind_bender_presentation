package com.amazonStepDefinition;

import com.amazonPageAction.CategoriesActions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CategoriesStepDefinitions {

	
	CategoriesActions Act = new CategoriesActions()
			;
	
				@Given("User on  Amazon Home page")
				public void user_on_Amazon_Home_page() {
					Act.getAmazonLoginPage();
	   
				}

				@When("User clicks on Burger Menu")
				public void user_clicks_on_Burger_Menu() throws InterruptedException {
						Act.CategoryMenu();
	   
				}

				@When("User clicks on Clothing Shoes Jewelry & Watches")
				public void user_clicks_on_Clothing_Shoes_Jewelry_Watches() {
						Act.ClothingShoesJewelryWatches();
	   
				}

				@When("User clicks on Women")
				public void user_clicks_on_Women() throws InterruptedException {
						Act.WomenOpt(null);
	   
				}

				@Then("User should be routed to Amazon Fashion Home Page")
				public void user_should_be_routed_to_Amazon_Fashion_Home_Page() {
	    
	   
				}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
