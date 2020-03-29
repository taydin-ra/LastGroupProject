package stepDefinition;

import Utilities.Driver;
import cucumber.api.java.After;

public class Hooks {
    @After
    public void afterMethod(){

        Driver.closeBrowser();


    }
}
