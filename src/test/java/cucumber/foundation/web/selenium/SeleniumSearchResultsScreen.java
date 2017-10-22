package cucumber.foundation.web.selenium;

import cucumber.drivers.SharedDriver;
import cucumber.foundation.web.SearchResultsScreen;
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
