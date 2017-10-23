package com.home.utws.foundation.selenium;

import com.home.utws.foundation.interfaces.SearchResultsScreen;
import com.home.utws.foundation.selenium.drivers.SharedDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class SeleniumSearchResultsScreen extends SeleniumScreen implements SearchResultsScreen {

    public SeleniumSearchResultsScreen(SharedDriver driver) {
        super(driver);
    }

    @Override
    public boolean hasResults() {
        try {
            WebElement resultsDiv = this.getDriver().findElement(By.id("resultStats"));
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }
}
