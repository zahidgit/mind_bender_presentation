package com.amazonStepDefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.amazonUtilities.SetupDriver;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class AfterScenario {
	@After
	public void afterChromeScenario(Scenario scen) {

		System.out.println(">> Test Eexecution Completed: " + scen.getName()+" <<");
		System.out.println(">> Shutting Down Browser! <<");

		try {
			if (scen.isFailed()) {
				TakesScreenshot ts = (TakesScreenshot) SetupDriver.driver;
				byte[] imageBytes = ts.getScreenshotAs(OutputType.BYTES);
				scen.attach(imageBytes, "image/png", "failed_image");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		SetupDriver.tearDownDriver();
		
		System.out.println(">> Driver Closed! <<");

	}

}
