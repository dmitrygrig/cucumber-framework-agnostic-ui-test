package cucumber.foundation.web.selenium;

import cucumber.drivers.SharedDriver;
import cucumber.foundation.web.Screen;

public class SeleniumScreen implements Screen {

    private final SharedDriver driver;

    public SeleniumScreen(SharedDriver driver) {
        this.driver = driver;
    }

    protected SharedDriver getDriver() {
        return driver;
    }
}
