package com.amazonPageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoriesElements {

	
		@FindBy(css = "#nav-hamburger-menu")
		public WebElement BurgerMenu;
	
	
	 	@FindBy(xpath= "//*[@id=\"hmenu-content\"]/ul[1]/li[19]/a")
	    public WebElement GirlyOptions;

	    @FindBy(xpath= " //*[@id=\"hmenu-content\"]/ul[11]/li[4]/a")
	    public WebElement Womens;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
