package com.amazonStepDefinition;

import com.amazonPageAction.AmazonEndtoEndTestingActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonEndtoEndTestingStepDefinitions {
 
			
			AmazonEndtoEndTestingActions EndtoEndActions = new AmazonEndtoEndTestingActions();
	

			@Given("User is on amazon login page")
			public void user_is_on_amazon_login_page() {
				EndtoEndActions.getAmazonLoginPage();
			}

			
			@When("User enters correct email address {string}")
			public void user_enters_correct_email_address(String userId) {
				EndtoEndActions.inputUserId(userId);
			}
			

			@When("User clicks continue")
			public void user_clicks_continue() {
				EndtoEndActions.clickContinue();
			}
			

			@When("User enter password {string}")
			public void user_enter_password(String password) {
				EndtoEndActions.EnterPassword(password);
			}
			

			@When("User clicks sign-in button")
			public void user_clicks_sign_in_button() {
				EndtoEndActions.UserSignin();
			}

			
			/*@When("User should be Routed to Amazon Accounts Home Page")
			public void user_should_be_Routed_to_Amazon_Accounts_Home_Page() {
				EndtoEndActions.AmazonHomeAccountsPage();
			}*/
			

			@When("User enters input {string} in search box")
			public void user_enters_input_in_search_box(String string) {
				EndtoEndActions.InputSearchBox(string);
			}
			

			@When("Clicks search button")
			public void clicks_search_button() {
				EndtoEndActions.PressEnter();
			}

			
			@When("User selects first link item on the search result page")
			public void user_selects_first_link_item_on_the_search_result_page() {
				EndtoEndActions.SelectFirstItemSearchPageResults();
			}
			

			@When("User adds item to cart")
			public void user_adds_item_to_cart() {
				EndtoEndActions.AddSearchItemtoCart();
			}
			

			@Then("User goes to cart page by clicking cart button")
			public void user_goes_to_cart_page_by_clicking_cart_button() {
				EndtoEndActions.GotoCartButton();
			}
			

			@Then("User verifies sub total on the shopping cart page")
			public void user_verifies_sub_total_on_the_shopping_cart_page() {
				EndtoEndActions.IstotalAmount();
			}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

