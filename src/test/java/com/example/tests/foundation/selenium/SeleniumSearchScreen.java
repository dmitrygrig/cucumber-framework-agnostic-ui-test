package com.example.tests.foundation.selenium;

import com.example.tests.drivers.SharedDriver;
import com.example.tests.foundation.interfaces.SearchScreen;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeleniumSearchScreen extends SeleniumScreen implements SearchScreen {

    public SeleniumSearchScreen(SharedDriver driver) {
        super(driver);
    }

    @Override
    public void setSearchText(String chromeDriver) {
        getSeachBox().sendKeys("ChromeDriver");
    }

    @Override
    public void search() {
        getSeachBox().submit();
    }


    private WebElement getSeachBox() {
        return this.getDriver().findElement(By.name("q"));
    }

}
