package com.test.steps;

import org.openqa.selenium.WebDriverException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class CommonStepDef extends Common {
	Logger logger = LoggerFactory.getLogger(CommonStepDef.class);
	@Before
	public void deleteCookies() {
		try {
			driver.manage().deleteAllCookies();
		} catch (WebDriverException e) {
			logger.info(e.getMessage());
		}
	}

	@After
	public void testShutdown() {
		driver.close();
		driver = null;
	}
}
