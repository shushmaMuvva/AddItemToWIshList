package com.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage {

	@SuppressWarnings("unused")
	private WebDriver driver;

	@FindBy(id = "id_gender1")
	private WebElement mrTitle;

	@FindBy(id = "id_gender2")
	private WebElement mrsTitle;

	@FindBy(id = "customer_firstname")
	private WebElement firstNameField;

	@FindBy(id = "customer_lastname")
	private WebElement lastNameField;

	@FindBy(id = "passwd")
	private WebElement passwordField;

	@FindBy(id = "address1")
	private WebElement addressLine1Field;

	@FindBy(id = "city")
	private WebElement cityField;

	@FindBy(id = "id_state")
	private WebElement stateField;

	@FindBy(id = "postcode")
	private WebElement zipPostalCodeField;

	@FindBy(id = "id_country")
	private WebElement countryField;

	@FindBy(id = "phone_mobile")
	private WebElement mobilePhoneField;

	@FindBy(id = "alias")
	private WebElement addressAliasField;

	@FindBy(id = "submitAccount")
	private WebElement registerButton;

	@FindBy(css = "h1.page-heading")
	private WebElement myAcPageHeading;

	public CreateAccountPage(WebDriver driver) {
		ElementLocatorFactory finder = new AjaxElementLocatorFactory(driver, 15);
		PageFactory.initElements(finder, this);
		this.driver = driver;
	}

	public void selectMrTitle() {
		Utilityfunc.WaitForWebElementVisibility(15, mrTitle);
		mrTitle.click();
	}

	public void selectMrsTitle() {
		Utilityfunc.WaitForWebElementVisibility(15, mrsTitle);
		mrsTitle.click();
	}

	public void enterFirstName(String firstName) {
		firstNameField.sendKeys(firstName);
	}

	public void enterLastName(String lastName) {
		lastNameField.sendKeys(lastName);
	}

	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}

	public void enterAddressLine1(String addressLine1) {
		addressLine1Field.sendKeys(addressLine1);
	}

	public void enterCity(String city) {
		cityField.sendKeys(city);
	}

	public void enterState(String state) {
		Select optionStateField = new Select(stateField);
		optionStateField.selectByVisibleText(state);
	}

	public void enterzipPostalCode(String zipPostalCode) {
		zipPostalCodeField.sendKeys(zipPostalCode);
	}

	public void enterCountry(String country) {
		Select optionCountryField = new Select(countryField);
		optionCountryField.selectByVisibleText(country);
	}

	public void enterMobilePhone(String mobilePhone) {
		mobilePhoneField.sendKeys(mobilePhone);
	}

	public void enteraddressAlias(String addressAlias) {
		addressAliasField.clear();
		addressAliasField.sendKeys(addressAlias);
	}

	public void clickOnRegister() {
		registerButton.click();
	}

}
