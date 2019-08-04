package com.test.steps;

import static org.junit.Assert.assertEquals;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.test.pages.CreateAccountPage;
import com.test.pages.MyAccountPage;

import cucumber.api.java.en.And;

public class MyAccountPageStepDef extends Common {
	Logger logger = LoggerFactory.getLogger(MyAccountPageStepDef.class);

	public CreateAccountPage createAccountPage;
	public MyAccountPage myAccountPage;

	public MyAccountPageStepDef() {
		createAccountPage = new CreateAccountPage(driver);
		myAccountPage = new MyAccountPage(driver);
	}

	@And("^I submit registration to login and view my account page$")
	public void i_submit_registration_to_login_and_view_my_account_page() {
		createAccountPage.clickOnRegister();

		assertEquals("Invalid Page Heading for My Account Page!!", "MY ACCOUNT", myAccountPage.getPageHeading());

	}

	@And("^I can see my name on top right corner$")
	public void i_can_see_my_name_on_top_right_corner() {

		String accountName = CreateAccountPageStepDef.firstName + " " + CreateAccountPageStepDef.lastName;

		logger.info("Expected AccountName ::: " + accountName);
		logger.info("Actual AccountName :::" + myAccountPage.getAccountName());

		assertEquals("Invalid Account Name!!", accountName, myAccountPage.getAccountName());
	}

	@And("^I can See \"([^\"]*)\" link and click on it$")
	public void i_can_See_My_wishlists_link(String wishListLinkName) {
		logger.info("Expected wishListLinkName ::: " + wishListLinkName);
		logger.info("Actual wishListLinkName ::: " + myAccountPage.getWishListLinkName());

		assertEquals("My wishlists link does not exist !!", wishListLinkName, myAccountPage.getWishListLinkName());

		myAccountPage.clickOnMyWishLists();
	}

}
