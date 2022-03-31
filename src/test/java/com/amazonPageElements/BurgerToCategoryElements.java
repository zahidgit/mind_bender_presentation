package com.amazonPageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BurgerToCategoryElements {

	
		
		@FindBy(css = "#nav-hamburger-menu")
	    public WebElement BurgerMenu;

	    @FindBy(xpath= "//div[contains(text(),'Prime Video')]")
	    public WebElement PrimeVideoOpt;

	    @FindBy(xpath= "  //*[@id=\"hmenu-content\"]/ul[2]/li[5]/a")
	    public WebElement Primechannels;
		
		
		
		
			
	}


