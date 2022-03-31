package com.amazonPageAction;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.amazoUtilities.SetupDriver;
import com.amazonPageElements.BurgerToCategoryElements;

public class BurgerToCategoryActions {

	
		
	
			BurgerToCategoryElements Burgerelements = new BurgerToCategoryElements();
			
			
			
			public BurgerToCategoryActions() {													//create a constructor				  
				Burgerelements = new BurgerToCategoryElements();								//initialize instance variable
				PageFactory.initElements(SetupDriver.driver, Burgerelements);
				}
			
			
			
			public void getAmazonLoginPage() {
				SetupDriver.driver.get("https://www.amazon.com");
				SetupDriver.driver.manage().window().maximize();
				SetupDriver.driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
			}
			
			
	
			public void BurgerMenu() throws InterruptedException {
				System.out.println("Clicking on Burger Menu");					//action 
				Burgerelements.BurgerMenu.click();
				 Thread.sleep(4000);
				}
			
							@FindBy(xpath= "//div[contains(text(),'Prime Video')]")
							public WebElement PrimeVideoOpt;
			
			public void PrimeOpt() {
				System.out.println("Clicking on Prime Video Option");					//action 
				Burgerelements.PrimeVideoOpt.click();
				}
	
			public void Channels (WebDriver driver1) throws InterruptedException{
				Burgerelements.Primechannels.click();
				 Thread.sleep(3000);
			
				
			
			 WebDriver driver = driver1;
			 
			String BurgerCategory = driver.getTitle();
		        Assert.assertEquals("Amazon.com:  prime Video", BurgerCategory);
		        System.out.println("Title: "  + BurgerCategory);

		       
		        }	
	
			}
	
	
