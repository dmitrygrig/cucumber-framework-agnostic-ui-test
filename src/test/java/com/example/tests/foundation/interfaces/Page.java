package com.example.tests.foundation.interfaces;

public interface Page {

    void navigateTo(String urlAddress);

    <T extends Screen> T asScreen(Class<T> clazz);
}
