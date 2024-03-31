
package factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class DriverFactory {
     public static WebDriver driver=null;
    public static WebDriver getInstance(){
        if(driver == null){
            ChromeOptions options =new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\chromedriver.exe");
            driver =new ChromeDriver(options);
            driver.manage().window().maximize();
        }
        return driver;
    }
}

