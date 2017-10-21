package cucumber.foundation.selenium;

import cucumber.drivers.SharedDriver;
import cucumber.foundation.interfaces.SearchResultsScreen;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeleniumSearchResultsScreen extends SeleniumScreen implements SearchResultsScreen {

    public SeleniumSearchResultsScreen(SharedDriver driver) {
        super(driver);
    }

    @Override
    public boolean hasResults() {
        WebElement resultsDiv = this.getDriver().findElement(By.id("resultStats"));
        return resultsDiv != null;
    }
}
