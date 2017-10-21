package com.example.tests.foundation.selenium;

import com.example.tests.drivers.SharedDriver;
import com.example.tests.foundation.interfaces.Screen;

public class SeleniumScreen implements Screen {

    private final SharedDriver driver;

    public SeleniumScreen(SharedDriver driver) {
        this.driver = driver;
    }

    public SharedDriver getDriver() {
        return driver;
    }
}
