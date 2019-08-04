package com.test.steps;

import static org.junit.Assert.assertEquals;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.test.pages.MyStoreHomePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class MyStoreHomePageStepDef extends Common {
	Logger logger = LoggerFactory.getLogger(MyStoreHomePageStepDef.class);

	public MyStoreHomePage myStoreHomePage;

	public MyStoreHomePageStepDef() {
		myStoreHomePage = new MyStoreHomePage(driver);
	}

	@Given("^I navigate to automation practice website$")
	public void i_navigate_to_energy_comparethemarket_website() {
		myStoreHomePage.gotoHomePage();
		assertEquals("Invalid Page Title!!", "My Store", myStoreHomePage.getPageTitle());
	}

	@And("^I click on Sign in link$")
	public void i_click_on_Sign_in_link() {
		myStoreHomePage.clickOnSignIn();
	}

	@Given("^I enter my email address and click on .* button$")
	public void i_enter_my_email_address_and_click_on_button() {
		// generating random email using currentTimeMillis
		String email = "test" + System.currentTimeMillis() + "@gmail.com";
		logger.info("Unique Email ID :::: " + email);

		myStoreHomePage.enterEmailId(email);
		myStoreHomePage.clickOnCreateAccount();
	}

}
