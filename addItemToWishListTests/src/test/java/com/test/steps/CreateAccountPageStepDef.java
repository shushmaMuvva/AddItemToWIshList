package com.test.steps;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.test.pages.CreateAccountPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;

public class CreateAccountPageStepDef extends Common {
	Logger logger = LoggerFactory.getLogger(CreateAccountPageStepDef.class);

	public CreateAccountPage createAccountPage;
	public static String firstName;
	public static String lastName;

	public CreateAccountPageStepDef() {
		createAccountPage = new CreateAccountPage(driver);
	}

	@And("^I create an account with details as$")
	public void i_create_an_account_with_details_as(DataTable userPersonalInfo) {
		Map<String, String> userInfoMap = userPersonalInfo.asMap(String.class, String.class);

		logger.info("Title is :: " + userInfoMap.get("title"));

		firstName = userInfoMap.get("firstName");
		lastName = userInfoMap.get("lastName");

		if (userInfoMap.get("title").equalsIgnoreCase("Mr")) {
			createAccountPage.selectMrTitle();
		} else {
			createAccountPage.selectMrsTitle();
		}

		createAccountPage.enterFirstName(userInfoMap.get("firstName"));
		createAccountPage.enterLastName(userInfoMap.get("lastName"));
		createAccountPage.enterPassword(userInfoMap.get("Password"));
		createAccountPage.enterAddressLine1(userInfoMap.get("AddressLine1"));
		createAccountPage.enterCity(userInfoMap.get("City"));
		createAccountPage.enterState(userInfoMap.get("State"));
		createAccountPage.enterzipPostalCode(userInfoMap.get("Zip/PostalCode"));
		createAccountPage.enterCountry(userInfoMap.get("Country"));
		createAccountPage.enterMobilePhone(userInfoMap.get("MobilePhone"));
		createAccountPage.enteraddressAlias(userInfoMap.get("addressAlias"));
	}

}
