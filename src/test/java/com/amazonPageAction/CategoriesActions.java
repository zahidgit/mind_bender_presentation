package com.amazonPageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.amazoUtilities.SetupDriver;
import com.amazonPageElements.CategoriesElements;

public class CategoriesActions {
 
	

	CategoriesElements CatElements = new CategoriesElements();
	
	
	
	public CategoriesActions() {																  
		CatElements = new CategoriesElements();								
		PageFactory.initElements(SetupDriver.driver, CatElements);
		}
	
	
	
	public void getAmazonLoginPage() {
		SetupDriver.driver.get("https://www.amazon.com");
		SetupDriver.driver.manage().window().maximize();
		SetupDriver.driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
	}
	
	

	public void CategoryMenu() throws InterruptedException {
		System.out.println("Clicking on Burger Menu");				
		CatElements.BurgerMenu.click();
		 Thread.sleep(4000);
		}
		
	
		public void scrolldown(WebDriver driver1){
		WebDriver driver = driver1;
		JavascriptExecutor down = (JavascriptExecutor)driver;
		down.executeScript("window.scrollBy(0,8000)");
		
	}
	
	public void ClothingShoesJewelryWatches() {
		System.out.println("Clicking on Clothing Shoes Jewelry & Watches");				
		CatElements.GirlyOptions.click();
		}

	public void WomenOpt (WebDriver driver1) throws InterruptedException{
		CatElements.Womens.click();
		 Thread.sleep(3000);
		 WebDriver driver = driver1;
		 String BurgerCategory = driver.getTitle();
        Assert.assertEquals("Amazon.com:  prime Video", BurgerCategory);
        System.out.println("Title: "  + BurgerCategory);
		}	

	}
	
	
	
	
