
package factory;

import org.openqa.selenium.WebDriver;

public class SingleTonSetup {
    WebDriver driver;
    public SingleTonSetup(String url){
        driver=DriverFactory.getInstance();
        driver.get(url);
        driver.manage().window().maximize();
        System.out.println("Browser is opened");
    }
}

