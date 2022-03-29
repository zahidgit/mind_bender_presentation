package com.amazonPageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.amazoUtilities.SetupDriver;
import com.amazonPageElements.AmazonPagetoCartElements;


public class AmazonPagetoCartActions {

	AmazonPagetoCartElements cartElements;                               //instance variable
	
		public AmazonPagetoCartActions() {								  
		cartElements = new AmazonPagetoCartElements ();
		PageFactory.initElements(SetupDriver.driver, cartElements);
		}
		
		public void getAmazonLoginPage() {								
		SetupDriver.driver.get("https://www.amazon.com/");
		SetupDriver.driver.manage().window().maximize();
		SetupDriver.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		}
		
		@FindBy (xpath = "//a[@id='nav-cart']")               //find by
		public WebElement cartPagebttnValidation;

		public void cartPageValidation() {
			System.out.println("Clicking on cart Button");   //method to implement find by element
			cartElements.cartPagebttnValidation.click();
		}

		public void click() {
			System.out.println("Clicking Submit Button");
				cartElements.cartPagebttnValidation.click();
			}
		
		public void cartpage() {
			System.out.println("Verifying on Cart Page");
			SetupDriver.driver.get("https://www.amazon.com/gp/cart/view.html?ref_=nav_cart");	
			}		
}










































/*public void findElement() {
System.out.println("Navigate to Cart button");
cartElements.findElement(By.xpath("//a[@id='nav-cart']")).click();
}


public void findElementQty() {
	System.out.println("Navigate to Cart button");
	cartElements.driver.findElement(By.xpath("//span[@id='a-autoid-4-announce']")).click();
	*/
