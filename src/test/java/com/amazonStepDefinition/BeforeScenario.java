package com.amazonStepDefinition;

import com.amazoUtilities.SetupDriver;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BeforeScenario {
	@Before("@chrome")
	public void beforeChromeScenario(Scenario scen) {

		System.out.println(">> Started Chrome Driver Initialization <<");
		try {
			SetupDriver.setupChromeDriver();
			System.out.println(">> ChromeDriver Initialized!<<");
			System.out.println(scen.getName());

		} catch (Exception e) {
			System.out.println(">> ChromeDriver Initialization Failed!!<<");
		}

	}

	@Before("@firefox")
	public void beforeFirefoxScenario(Scenario scen) {

		System.out.println(">> Started Chrome Driver Initialization <<");
		try {
			SetupDriver.setupFirefoxDriver();
			System.out.println(">> FirefoxDriver Initialized!<<");
			System.out.println(scen.getName());

		} catch (Exception e) {
			System.out.println(">> FirefoxDriver Initialization Failed!!<<");
		}

	}


}
