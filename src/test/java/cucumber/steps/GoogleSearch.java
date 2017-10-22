package cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.foundation.web.SearchResultsScreen;
import cucumber.foundation.web.SearchScreen;
import cucumber.foundation.web.selenium.SeleniumPage;
import org.junit.Assert;

public class GoogleSearch {

    private final SeleniumPage page;

    public GoogleSearch(SeleniumPage page) {
        this.page = page;
    }

    @Given("^Google initial page is open$")
    public void initial_page_is_open() throws Exception {
        page.navigateTo("http://www.google.com/xhtml");
    }

    @When("^Search for '([\\w\\s]+)' performed$")
    public void search(String term) throws Exception {
        SearchScreen searchScreen = page.asScreen(SearchScreen.class);
        searchScreen.setSearchText(term);
        searchScreen.search();
    }

    @Then("^Search results exist$")
    public void page_with_results_is_opened() throws Exception {
        SearchResultsScreen searchScreen = page.asScreen(SearchResultsScreen.class);
        Assert.assertTrue(searchScreen.hasResults());
    }

    @Then("^No search results exist$")
    public void no_search_results_exist() throws Exception {
        SearchResultsScreen searchScreen = page.asScreen(SearchResultsScreen.class);
        Assert.assertFalse(searchScreen.hasResults());
    }

}