package com.amazonPageElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AmazonEndtoEndTestingElements {

		@FindBy(id = "ap_email")
		public WebElement userId;                      //creating constant to use in action class
		// Given User is on amazon login page
		
		
		@FindBy(xpath ="//*[@id=\"continue\"]")
		public WebElement ClickContinue;
		//When User enters correct email address "talentechpowerrangers@gmail.com"
		//And User clicks continue
		
		@FindBy(name = "password")
		public WebElement password;
		//And User enter passwords "March2022"

		@FindBy(className = "a-button-input")
		public WebElement signinBtn;
		//And User clicks sign-in button
		//And User should be Routed to Amazon Accounts Home Page
	
		
		@FindBy(id="twotabsearchtextbox")
		public WebElement EnterInputSearchBox;
		//When User enters input "balloons" in search box
		
	
		@FindBy(id = "nav-search-submit-button")
		public WebElement PressEnterOnSearchButton;
		//And Clicks search button
		  
		@FindBy(partialLinkText = "Dusico® Balloons Rainbow Set (100 Pack) 12 Inches, Assorted Bright Colors")
		public WebElement LinkforBalloonItem;   
		    
		
		@FindBy(xpath = "//input[@id='add-to-cart-button']") 
		public WebElement PressAddtoCartButton;	
		
		
		@FindBy (name = "//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")
		public WebElement PressCartButton;
		// And User verifies sub total on the shopping cart page
		
		@FindBy (xpath = "//a[@id='nav-cart']") 
		public WebElement GotoCartButtonCartPage;
		//Then User goes to cart page by clicking cart button

		@FindBy (id ="sc-subtotal-label-buybox")
		public WebElement Checktotal;
	
		/*@FindBy (xpath = "//a[@id='nav-cart']") 
		public WebElement GotoCartButtonforCartPage;
		//Then User goes to cart page by clicking cart button*/
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
