package com.amazoUtilities; 

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper {
	public static String getCurentUrl() {
		return SetupDriver.driver.getCurrentUrl();
	}

	public static boolean delay(WebElement element) {
		boolean bool;
		WebDriverWait wait = new WebDriverWait(SetupDriver.driver, 15);
		bool = wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();
		return bool;
	}

	public static String getPageTitle() {
		String pageTitle;
		pageTitle = SetupDriver.driver.getTitle();
		return pageTitle;
	}

	public static String getParentWindow() {
		String parentWindow;
		parentWindow = SetupDriver.driver.getWindowHandle();
		System.out.println(parentWindow);
		return parentWindow;
	}

}
