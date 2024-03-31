package hooks;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;


public class Hooks {

    public WebDriver driver;
    @Before
    public void before(){
        System.out.println("Hooks are defined");
        driver=DriverFactory.getInstance();
    }
    @After
    public void teardown(){


    }
}
