package com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

import com.test.configutils.LoadProperties;

public class MyStoreHomePage {

	private WebDriver driver;

	@FindBy(partialLinkText = "Sign in")
	private WebElement signInLink;
	
	@FindBy(id = "email_create")
	private WebElement emailIdField;

	@FindBy(id = "SubmitCreate")
	private WebElement createAccountButton;
	
	public MyStoreHomePage(WebDriver driver) {
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 15);
		PageFactory.initElements(finder, this);
		this.driver = driver;
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public void gotoHomePage() {

		driver.get(LoadProperties.getWebEndPoint());
	}
	
	public void clickOnSignIn(){
		Utilityfunc.WaitForWebElementVisibility(15, signInLink);
		signInLink.click();
	}
	
	public void enterEmailId(String email) {
		emailIdField.sendKeys(email);
	}

	public void clickOnCreateAccount() {
		createAccountButton.click();
	}

}
