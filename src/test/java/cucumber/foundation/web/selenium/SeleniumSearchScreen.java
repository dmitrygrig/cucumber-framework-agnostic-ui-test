package cucumber.foundation.web.selenium;

import cucumber.drivers.SharedDriver;
import cucumber.foundation.web.SearchScreen;
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

        // wait for navigation
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    private WebElement getSeachBox() {
        return this.getDriver().findElement(By.name("q"));
    }

}
