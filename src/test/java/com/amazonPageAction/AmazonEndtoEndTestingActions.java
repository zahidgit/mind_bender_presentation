package com.amazonPageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.amazoUtilities.SetupDriver;
import com.amazonPageElements.AmazonEndtoEndTestingElements;

public class AmazonEndtoEndTestingActions {
	
	

	AmazonEndtoEndTestingElements e2etestElement;           						 			//import  elements class, created instance variable
	
		public AmazonEndtoEndTestingActions() {													//create a constructor				  
			e2etestElement = new AmazonEndtoEndTestingElements();								//initialize instance variable
			PageFactory.initElements(SetupDriver.driver, e2etestElement);
			}
		
		
		
		public void getAmazonLoginPage() {					                					//method for driver to get log in page			
			SetupDriver.driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
			SetupDriver.driver.manage().window().maximize();
			SetupDriver.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
			}
	
		
		
		public void inputUserId(String userId) {
			System.out.println("Passing UserId");
			e2etestElement.userId.sendKeys(userId);
		}
		
		
		
		@FindBy(name = "email")
		public CharSequence[] EnterEmail;
		
		
		public void clearUserID() {
			e2etestElement.userId.clear();
		}
			
			public void clickContinue() {
				e2etestElement.ClickContinue.click();
				}	
			
			
				               
	
				@FindBy(xpath ="//*[@id=\"continue\"]")
				public WebElement ClickContinue;
				
			
				
				public void EnterPassword(String password) {
					System.out.println("User Enters Password");
					e2etestElement.password.sendKeys(password);
				}	
				
				
				
			public void UserSignin() {
				System.out.println("Click Sign In Button");
				e2etestElement.signinBtn.click();
				}		
			
			public void UserSignin1() {
				System.out.println("Click Sign In Button");
				e2etestElement.signinBtn.click();
				}
			
			@FindBy(id = "signInSubmit")
			public WebElement signinBtn;
			
			
			

	
		public void InputSearchBox(String InputSearchItem) {
			e2etestElement.EnterInputSearchBox.sendKeys(InputSearchItem);
			System.out.println("User enters Input Balloons in Search Box ");
			}
		
		
		public void PressEnter(){	
			e2etestElement.PressEnterOnSearchButton.click();
			System.out.println("Clicked on Yellow Search Button");
			}
			
		@FindBy(id = "nav-search-submit-button")
		public WebElement PressEnterOnSearchButton;
		
			
		public void SelectFirstItemSearchPageResults(){
				e2etestElement.LinkforBalloonItem.click();
				System.out.println("Click on First Searc Result for Balloon Item");
			}
		
			
		public void AddSearchItemtoCart(){
			e2etestElement.PressAddtoCartButton.click();
			System.out.println("Adding Search Result Balloon Item to Cart");
			}
		
		
		/*public void GotoCartlookforText() {
			String text = "Added To Cart";
			if (e2etestElement.PressCartButton.isDisplayed()) {
				text = e2etestElement.PressCartButton.getText();
			}

			if (text.contains("Added to Cart")) {
				System.out.println("Balloons is added to the cart");
			}
		}*/
		
		
		public void GotoCartButton(){
			e2etestElement.GotoCartButtonCartPage.click();
			System.out.println("Click on Cart Button to go to Cart Page");
			
		}
		

			public void IstotalAmount() {
				Boolean Yellow = e2etestElement.Checktotal.isDisplayed();
				if (Yellow) {
					System.out.println("Total Amount");
				} else {
					System.out.println("NO TOTAL AMOUNT");
	}
}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
