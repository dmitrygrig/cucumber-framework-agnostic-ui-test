package cucumber.foundation.selenium;

import cucumber.drivers.SharedDriver;
import cucumber.foundation.interfaces.Page;
import cucumber.foundation.interfaces.Screen;

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
        return screenFactory.create(clazz);
    }
}