package com.amazonStepDefinition;
 
import com.amazonPageAction.AmazonPagetoCartActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartPageStepDefinitions {

	
	AmazonPagetoCartActions action1 = new AmazonPagetoCartActions();  //create action page object
	
				
				@Then("I am on Amazon home page")
				public void i_am_on_Amazon_home_page() {
				action1.getAmazonLoginPage();                           // call action page methods using objects
				}

				@Given("I navigate over to the cart button")
				public void i_navigate_over_to_the_cart_button() {
				action1.cartPageValidation();
				}
	
				@When("I click on the cart")
				public void i_click_on_the_cart() {
				action1.click();
				}

				@Then("I should be routed to cart page")
				public void i_should_be_routed_to_cart_page() {
				action1.cartpage();
				}

	
	
}













/*	@Then("Click on Qty button")
public void click_on_Qty_button() {
}

@Then("reduce Quantity to {int}")
public void reduce_Quantity_to(Integer int1) {
}

@Then("page should refresh")
public void page_should_refresh() {
}*/

