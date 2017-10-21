package com.example.tests.features;

import com.example.tests.foundation.interfaces.SearchResultsScreen;
import com.example.tests.foundation.interfaces.SearchScreen;
import com.example.tests.foundation.selenium.SeleniumPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class GoogleSearch {

    private final SeleniumPage page;

    public GoogleSearch(SeleniumPage page) {
        this.page = page;
    }

    @Given("^Google initial page is open$")
    public void google_initial_page_is_open() throws Exception {
        page.navigateTo("http://www.google.com/xhtml");
    }

    @When("^I search for 'ChromeDriver'$")
    public void i_search_for_ChromeDriver() throws Exception {
        SearchScreen searchScreen = page.asScreen(SearchScreen.class);
        searchScreen.setSearchText("ChromeDriver");
        searchScreen.search();
    }

    @Then("^Page with results is opened$")
    public void page_with_results_is_opened() throws Exception {
        SearchResultsScreen searchScreen = page.asScreen(SearchResultsScreen.class);
        Assert.assertTrue(searchScreen.hasResults());
    }


}
