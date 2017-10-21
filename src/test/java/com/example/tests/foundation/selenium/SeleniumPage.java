package com.example.tests.foundation.selenium;

import com.example.tests.drivers.SharedDriver;
import com.example.tests.foundation.interfaces.Page;
import com.example.tests.foundation.interfaces.Screen;

public class SeleniumPage implements Page {

    private final SharedDriver driver;
    private SeleniumScreenFactory screenFactory;

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
        return screenFactory.create(clazz);
    }
}
