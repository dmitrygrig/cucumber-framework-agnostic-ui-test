package cucumber.foundation.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toList;

public class WebDriverFactory {

    private WebDriverFactory() {

    }

    static WebDriver create() {
        String webDriverProperty = System.getProperty("webdriver");

        if (webDriverProperty == null || webDriverProperty.isEmpty()) {
            throw new IllegalStateException("The webdriver system property must be set");
        }

        try {
            return Drivers.valueOf(webDriverProperty.toUpperCase()).newDriver();
        } catch (IllegalArgumentException e) {
            String msg = String.format("The webdriver system property '%s' did not match any " +
                            "existing browser or the browser was not supported on your operating system. " +
                            "Valid values are %s",
                    webDriverProperty, stream(Drivers
                            .values())
                            .map(Enum::name)
                            .map(String::toLowerCase)
                            .collect(toList()));

            throw new IllegalStateException(msg, e);
        }
    }

    private enum Drivers {
        FIREFOX {
            @Override
            public WebDriver newDriver() {
                return new FirefoxDriver();
            }
        }, CHROME {
            @Override
            public WebDriver newDriver() {
                final boolean isHeadless = Boolean.TRUE.toString().equals(System.getProperty("webdriver.chrome.driver.headless"));
                return new ChromeDriver(new ChromeOptions().setHeadless(isHeadless));
            }
        }, OPERA {
            @Override
            public WebDriver newDriver() {
                return new OperaDriver();
            }
        }, IE {
            @Override
            public WebDriver newDriver() {
                return new InternetExplorerDriver();
            }
        }, EDGE {
            @Override
            public WebDriver newDriver() {
                return new EdgeDriver();
            }
        };

        public abstract org.openqa.selenium.WebDriver newDriver();

    }

}
