package com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

public class MyWishListPage {

	@SuppressWarnings("unused")
	private WebDriver driver;

	@FindBy(css= "#best-sellers_block_right h4")
	private WebElement topSellersLink;

	@FindBy(xpath = "//ul[@class='block_content products-block']/li[1]/div//a")
	private WebElement topSellersFirstItemLink;

	@FindBy(id = "wishlist_button")
	private WebElement addToWishListButton;

	@FindBy(css = "p.fancybox-error")
	private WebElement addedToWishListAlert;

	@FindBy(css = "a.fancybox-close")
	private WebElement addedToWishListAlertClose;

	@FindBy(css = "a.account")
	private WebElement accountName;

	@FindBy(xpath = "//div[@id='block-history']//td[2]")
	private WebElement noOfItemInWishList;

	@FindBy(xpath = "//div[@id='block-history']//td[1]/a")
	private WebElement myWishList;

	@FindBy(id = "s_title")
	private WebElement wishListItemTitle;

	@FindBy(css = "li.lnk_wishlist span")
	private WebElement myWishlistsLink;

	public MyWishListPage(WebDriver driver) {
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 15);
		PageFactory.initElements(finder, this);
		this.driver = driver;
	}

	public String getTopSellersLinkName() {
		Utilityfunc.WaitForWebElementVisibility(15, topSellersLink);
		return topSellersLink.getText();
	}

	public String getTopSellersFirstItemName() {
		return topSellersFirstItemLink.getText();
	}

	public void clickOnTopSellersFirstItemLink() {
		topSellersFirstItemLink.click();
	}

	public String getAddToWishListButtonName() {
		Utilityfunc.WaitForWebElementVisibility(15, addToWishListButton);
		return addToWishListButton.getText();
	}

	public void clickOnAddToWishListButton() {
		addToWishListButton.click();
	}

	public String getAddedToWishListAlert() {
		Utilityfunc.WaitForWebElementVisibility(15, addedToWishListAlert);
		return addedToWishListAlert.getText();
	}

	public void clickOnAddedToWishListAlertClose() {
		Utilityfunc.WaitForWebElementVisibility(15, addedToWishListAlertClose);
		addedToWishListAlertClose.click();
	}

	public void clickOnMyAccountName() {
		Utilityfunc.WaitForWebElementVisibility(15, accountName);
		accountName.click();
	}

	public String getWishListNumber() {
		return noOfItemInWishList.getText();
	}

	public void clickOnMyWishList() {
		myWishList.click();
	}

	public String getTitleOfItemInWishList() {
		return wishListItemTitle.getText();
	}

	public void clickOnMyWishLists() {
		myWishlistsLink.click();
	}

}
