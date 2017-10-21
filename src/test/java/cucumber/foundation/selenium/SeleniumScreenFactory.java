package cucumber.foundation.selenium;

import cucumber.drivers.SharedDriver;
import cucumber.foundation.interfaces.Screen;
import cucumber.foundation.interfaces.ScreenFactory;
import cucumber.foundation.interfaces.SearchResultsScreen;
import cucumber.foundation.interfaces.SearchScreen;

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
