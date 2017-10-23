package com.home.utws.foundation.selenium;


import com.home.utws.foundation.interfaces.Screen;
import com.home.utws.foundation.interfaces.ScreenFactory;
import com.home.utws.foundation.interfaces.SearchResultsScreen;
import com.home.utws.foundation.interfaces.SearchScreen;
import com.home.utws.foundation.selenium.drivers.SharedDriver;

public class SeleniumScreenFactory implements ScreenFactory {

    private final SharedDriver driver;

    public SeleniumScreenFactory(SharedDriver driver) {
        this.driver = driver;
    }

    @Override
    public <T extends Screen> T create(Class<T> clazz) {
        if (clazz.isAssignableFrom(SearchScreen.class)) {
            return (T) new SeleniumSearchScreen(this.driver);
        } else if (clazz.isAssignableFrom(SearchResultsScreen.class)) {
            return (T) new SeleniumSearchResultsScreen(this.driver);
        } else {
            throw new RuntimeException("screen is not supported yet");
        }
    }
}
