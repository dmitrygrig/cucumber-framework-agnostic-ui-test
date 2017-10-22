package cucumber.foundation.selenium;

import cucumber.foundation.Screen;

public class SeleniumScreen implements Screen {

    private final SharedDriver driver;

    public SeleniumScreen(SharedDriver driver) {
        this.driver = driver;
    }

    protected SharedDriver getDriver() {
        return driver;
    }
}
