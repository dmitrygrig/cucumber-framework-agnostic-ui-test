package com.home.utws.foundation.mock;

import com.home.utws.foundation.interfaces.Page;
import com.home.utws.foundation.interfaces.Screen;

public class MockPage implements Page {

    private Screen screen;

    @Override
    public void navigateTo(String urlAddress) {
        // navigating...
    }

    @Override
    public <T extends Screen> T asScreen(Class<T> clazz) {
        return (T) getScreen();
    }

    public Screen getScreen() {
        if (screen == null) {
            screen = new MockCanDoEverythingScreen();
        }
        return screen;
    }
}
