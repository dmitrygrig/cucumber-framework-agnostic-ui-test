package cucumber.foundation.interfaces;

@SuppressWarnings("unused")
public interface ScreenFactory {

    <T extends Screen> T create(Class<T> clazz);

}
