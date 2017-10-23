# Description

Sample project of integration of cucumber with selenium for UI testing.
The aim is to show an example of UI-framework-agnostic (selenium in this case) UI tests. Selenium in this case is used 
just as an implementation of a test model.

Instead of working with selenium directly in cucumber steps' implementation (being stuck with it till the end of your days), 
it is possible to work with abstractions that are implemented by selenium code behind and automatically wired by 
IoC Container (e.g., PicoContainer in this sample).

# Setup 

1. Download and install Gradle (https://gradle.org/)
2. Create directory **/drivers** in the project root and download and extract WebDrivers there
* Chrome Driver (https://sites.google.com/a/chromium.org/chromedriver/getting-started)
* Gecko Driver (https://github.com/mozilla/geckodriver/)

# Run

Execute from project root:

    gradle cucumber

Headless UI tests will be executed with Chrome Driver. 

In order to switch to Firefox (via Gecko) uncomment the following line in build.gradle

    def browser = 'firefox'

Execution of tests generates a report in the folder **/target-{browser}**

 