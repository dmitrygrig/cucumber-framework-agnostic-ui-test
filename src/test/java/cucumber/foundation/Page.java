package cucumber.foundation;

public interface Page {

    void navigateTo(String urlAddress);

    <T extends Screen> T asScreen(Class<T> clazz);
}
