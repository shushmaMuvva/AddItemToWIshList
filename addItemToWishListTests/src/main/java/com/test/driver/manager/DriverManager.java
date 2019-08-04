package com.test.driver.manager;

import java.io.File;
import java.net.MalformedURLException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.test.configutils.LoadProperties;

public class DriverManager {

	public static RemoteWebDriver getDriverDynamic() throws MalformedURLException {
		String defaultBrowser = LoadProperties.getASpecificProperty("browser");

		RemoteWebDriver driver = null;

		if (defaultBrowser.equals("firefox")) {
			// set driver path by giving absolute path and set properties
			String gico = new File("").getAbsolutePath() + File.separatorChar + "src" + File.separatorChar + "test"
					+ File.separatorChar + "resources" + File.separatorChar + "geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", gico);

			// Set firefox preference
			FirefoxProfile profile = new FirefoxProfile();
			profile.setPreference("javascript.enabled", true);
			driver = new FirefoxDriver();
			driver.manage().window().setSize(new Dimension(1375, 725));
		}

		if (defaultBrowser.equals("chrome")) {
			// set driver path by giving absolute path and set properties
			String chromeDriver = new File("").getAbsolutePath() + File.separatorChar + "src" + File.separatorChar
					+ "test" + File.separatorChar + "resources" + File.separatorChar + "chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", chromeDriver);

			// Set chrome options
			ChromeOptions options = new ChromeOptions();
			options.setCapability("javascript.enabled", true);
			driver = new ChromeDriver();
			driver.manage().window().setSize(new Dimension(1375, 725));
		}

		return driver;
	}

}