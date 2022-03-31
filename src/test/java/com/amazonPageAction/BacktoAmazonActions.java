package com.amazonPageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.amazoUtilities.SetupDriver;
import com.amazonPageElements.BacktoAmazonElements;

public class BacktoAmazonActions {

				
				
	BacktoAmazonElements NavigateBack;           						 							//import elements class, created instance variable
	
					public BacktoAmazonActions() {													        //create a constructor				  
							NavigateBack = new BacktoAmazonElements();										//initialize instance variable
							PageFactory.initElements(SetupDriver.driver, NavigateBack);
							}
	
	
	
					public void getAmazonLoginPage() {	
						SetupDriver.driver.get("https://www.amazon.com");   								//method for driver to get log in page			
						SetupDriver.driver.manage().window().maximize();
						SetupDriver.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
						}

					
					public void AmazonHomeMenu() throws InterruptedException{
						System.out.println("Click on Amazon Home Menu Button");	
						NavigateBack.AmazonHomeLink.click();
						Thread.sleep(3000);
						}
	
	
					public void AmazonStyle(){
						System.out.println("Click on Amazon Home Menu Button");	
						NavigateBack.ShopbyStyle.click();
						}
	
	
					public void Logo() throws InterruptedException{
						System.out.println("Click on Amazon Logo to return Home");	
						NavigateBack.AmazonLogo.click();
						Thread.sleep(3000);
						}
	
	

	
	
}
