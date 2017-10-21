package cucumber;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ServiceHooks {

    @Before
    public void initializeTest() {
        // Code to setup initial configurations
    }

    @After
    public void before(Scenario scenario) {
        if (scenario.isFailed()) {
            System.out.printf("Screenshot");
        }
    }

}