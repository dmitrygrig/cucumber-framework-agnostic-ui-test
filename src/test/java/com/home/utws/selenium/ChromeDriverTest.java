package com.home.utws.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This is just a sample test to verify chrome driver works correctly
 */
public class ChromeDriverTest extends BaseDriverTest {

    @Override
    protected WebDriver createWebDriver() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        // ChromeOptions options = new ChromeOptions();
        // options.setHeadless(true);
        return new ChromeDriver();
    }

}
