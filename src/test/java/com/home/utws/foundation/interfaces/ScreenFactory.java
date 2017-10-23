package com.home.utws.foundation.interfaces;

@FunctionalInterface
public interface ScreenFactory {

    <T extends Screen> T create(Class<T> clazz);

}
