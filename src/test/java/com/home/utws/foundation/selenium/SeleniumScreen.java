package com.home.utws.foundation.selenium;

import com.home.utws.foundation.interfaces.Screen;
import com.home.utws.foundation.selenium.drivers.SharedDriver;

public class SeleniumScreen implements Screen {

    private final SharedDriver driver;

    public SeleniumScreen(SharedDriver driver) {
        this.driver = driver;
    }

    protected SharedDriver getDriver() {
        return driver;
    }
}
