package com.example.tests.foundation.interfaces;

public interface ScreenFactory {

    <T extends Screen> T create(Class<T> clazz);

}
