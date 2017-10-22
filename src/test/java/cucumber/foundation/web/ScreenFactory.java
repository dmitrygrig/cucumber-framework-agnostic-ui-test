package cucumber.foundation.web;

@SuppressWarnings("unused")
public interface ScreenFactory {

    <T extends Screen> T create(Class<T> clazz);

}
