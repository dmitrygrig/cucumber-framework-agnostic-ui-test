package cucumber.foundation.selenium;

import cucumber.drivers.SharedDriver;
import cucumber.foundation.interfaces.Screen;

public class SeleniumScreen implements Screen {

    private final SharedDriver driver;

    public SeleniumScreen(SharedDriver driver) {
        this.driver = driver;
    }

    protected SharedDriver getDriver() {
        return driver;
    }
}
