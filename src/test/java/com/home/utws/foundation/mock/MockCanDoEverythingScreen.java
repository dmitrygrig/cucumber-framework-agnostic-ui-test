package com.home.utws.foundation.mock;

import com.home.utws.foundation.interfaces.SearchResultsScreen;
import com.home.utws.foundation.interfaces.SearchScreen;

public class MockCanDoEverythingScreen implements SearchScreen, SearchResultsScreen {

    private String searchText;

    @Override
    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }

    @Override
    public void search() {
        // do search...
    }

    @Override
    public boolean hasResults() {
        return !"12938123ib12kj3n1kjnk312312".equals(searchText);
    }
}
