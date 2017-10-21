package com.example.tests.features;

import com.example.tests.drivers.SharedDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoogleSearch {

    private final SharedDriver driver;

    public GoogleSearch(SharedDriver webDriver) {
        this.driver = webDriver;
    }

    @Given("^Google initial page is open$")
    public void google_initial_page_is_open() throws Exception {
        driver.get("http://www.google.com/xhtml");
        Thread.sleep(5000);  // Let the user actually see something!
    }

    @When("^I search for 'ChromeDriver'$")
    public void i_search_for_ChromeDriver() throws Exception {
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("ChromeDriver");
        searchBox.submit();
    }

    @Then("^Page with results is opened$")
    public void page_with_results_is_opened() throws Exception {
        WebElement resultsDiv = driver.findElement(By.id("resultStats"));
        Assert.assertNotNull(resultsDiv);
    }


}
