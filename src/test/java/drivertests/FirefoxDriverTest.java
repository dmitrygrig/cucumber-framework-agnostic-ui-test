package drivertests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverTest extends BaseDriverTest {

    @Override
    protected WebDriver createWebDriver() {
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
        return new FirefoxDriver();
    }
}
