package com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

public class MyAccountPage {
	@SuppressWarnings("unused")
	private WebDriver driver;

	@FindBy(css = "h1.page-heading")
	private WebElement myAcPageHeading;

	@FindBy(css = "a.account")
	private WebElement accountName;

	@FindBy(css = "li.lnk_wishlist span")
	private WebElement myWishlistsLink;

	public MyAccountPage(WebDriver driver) {
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 15);
		PageFactory.initElements(finder, this);
		this.driver = driver;
	}

	public String getPageHeading() {
		Utilityfunc.WaitForWebElementVisibility(15, myAcPageHeading);
		return myAcPageHeading.getText();
	}

	public String getAccountName() {
		return accountName.getText();
	}

	public String getWishListLinkName() {
		return myWishlistsLink.getText();
	}

	public void clickOnMyWishLists() {
		myWishlistsLink.click();
	}

}
