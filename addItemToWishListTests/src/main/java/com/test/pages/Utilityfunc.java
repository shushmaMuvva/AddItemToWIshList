package com.test.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.steps.Common;

public class Utilityfunc extends Common {

	public void sleep(final int seconds) {
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}

	public static void WaitForWebElementVisibility(final int seconds, WebElement ele) {
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, seconds);

		@SuppressWarnings("unused")
		WebElement element;
		element = wait.until(ExpectedConditions.visibilityOf(ele));

	}

	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
	}

	public void testShutdown() {
		driver.quit();
		driver = null;
	}

}
