package com.test.steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.test.pages.CreateAccountPage;
import com.test.pages.MyWishListPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyWishListPageStepDef extends Common {
	Logger logger = LoggerFactory.getLogger(MyWishListPageStepDef.class);

	public MyWishListPage myWishListPage;
	public String topSellersfirstItemName;

	public MyWishListPageStepDef() {
		myWishListPage = new MyWishListPage(driver);
	}

	@When("^I see \"([^\"]*)\" list and click on first item$")
	public void i_see_list_on_left_side_panel(String topSellersLinkName) {
		logger.info("Expected topSellersLinkName ::: " + topSellersLinkName);
		logger.info("Actual topSellersLinkName ::: " + myWishListPage.getTopSellersLinkName());

		// Validate that customer can see 'TOP SELLERS' list on left side panel
		assertEquals("TOP SELLERS link does not exist !!", topSellersLinkName, myWishListPage.getTopSellersLinkName());

		topSellersfirstItemName = myWishListPage.getTopSellersFirstItemName();
		logger.info("TopSellersFirstItem name ::: " + topSellersfirstItemName);

		// Click on first item in 'TOP SELLERS' list
		try {
			myWishListPage.clickOnTopSellersFirstItemLink();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@And("^I can see \"([^\"]*)\" button and add an item to my wishlist$")
	public void i_can_see_Add_to_wishlist_button_and_add_an_item_to_my_wishlist(String addToWishListButton) {
		logger.info("Expected addToWishListButton ::: " + addToWishListButton);
		logger.info("Actual addToWishListButton ::: " + myWishListPage.getAddToWishListButtonName());

		assertEquals("Add to wishlist button does not exist !!", addToWishListButton,
				myWishListPage.getAddToWishListButtonName());

		myWishListPage.clickOnAddToWishListButton();
	}

	@Then("^Application should display that item \"([^\"]*)\"$")
	public void application_should_confirm_that_item_added_to_wish_list(String addedItemToWishListAlert) {
		logger.info("Expected addedItemToWishListConfirmText ::: " + addedItemToWishListAlert);
		logger.info("Actual addedItemToWishListConfirmText ::: " + myWishListPage.getAddedToWishListAlert());

		assertEquals("No cofirmation alert that item 'Added to your wish list.' !!", addedItemToWishListAlert,
				myWishListPage.getAddedToWishListAlert());

		myWishListPage.clickOnAddedToWishListAlertClose();

	}

	@And("^I should see only \"([^\"]*)\" item in my wishlist$")
	public void i_should_also_see_that_item_added_in_my_wishlist(String noOfItemsInWishList) {
		// Navigating to My wish list page
		myWishListPage.clickOnMyAccountName();
		myWishListPage.clickOnMyWishLists();

		logger.info("ITEM TOTAL ON WEB :: " + myWishListPage.getWishListNumber());
		
		myWishListPage.clickOnMyWishList();
		
		// Verify that only "1" item in my wish list
		assertEquals("ITEM TOTAL WRONG !! ", noOfItemsInWishList, myWishListPage.getWishListNumber());

	}

	@And("^It should be same item as i added from TOP SELLERS list$")
	public void it_should_be_same_item_as_i_added_from_TOP_SELLERS_list() {
		logger.info("ITEM USER ADDED TO WISH LIST :: " + topSellersfirstItemName);
		logger.info("ITEM NAME ON WEB WISH LIST :: " + myWishListPage.getTitleOfItemInWishList());

		// Verify that item should be same as i added from TOP SELLERS list
		assertTrue("ITEMS ARE DIFFERENT !! ",
				myWishListPage.getTitleOfItemInWishList().contains(topSellersfirstItemName));
	}

}
