package com.home.utws.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BaseDriverTest {

    protected abstract WebDriver createWebDriver();

    @Test
    public void testGoogleSearch() throws InterruptedException {


        WebDriver driver = null;
        try {
            driver = createWebDriver();

            driver.get("http://www.google.com/xhtml");
            Thread.sleep(1000);  // Let the user actually see something!

            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("ChromeDriver");
            searchBox.submit();

            Thread.sleep(1000);  // Let the user actually see something!
        } finally {
            if (driver != null)
                driver.quit();
        }
    }
}
