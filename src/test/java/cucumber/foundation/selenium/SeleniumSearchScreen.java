package cucumber.foundation.selenium;

import cucumber.drivers.SharedDriver;
import cucumber.foundation.interfaces.SearchScreen;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeleniumSearchScreen extends SeleniumScreen implements SearchScreen {

    public SeleniumSearchScreen(SharedDriver driver) {
        super(driver);
    }

    @Override
    public void setSearchText(String term) {
        getSeachBox().sendKeys(term);
    }

    @Override
    public void search() {
        getSeachBox().submit();
    }


    private WebElement getSeachBox() {
        return this.getDriver().findElement(By.name("q"));
    }

}
