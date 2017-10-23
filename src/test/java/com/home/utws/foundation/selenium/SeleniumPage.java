package com.home.utws.foundation.selenium;


import com.home.utws.foundation.interfaces.Page;
import com.home.utws.foundation.interfaces.Screen;
import com.home.utws.foundation.selenium.drivers.SharedDriver;

public class SeleniumPage implements Page {

    private final SharedDriver driver;
    private final SeleniumScreenFactory screenFactory;

    public SeleniumPage(SharedDriver driver) {
        this.driver = driver;
        this.screenFactory = new SeleniumScreenFactory(driver);
    }

    @Override
    public void navigateTo(String urlAddress) {
        driver.get(urlAddress);
    }

    @Override
    public <T extends Screen> T asScreen(Class<T> clazz) {
        return (T) screenFactory.create(clazz);
    }
}
