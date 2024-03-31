package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage_PF {
    @FindBy(name = "username")
    public WebElement userName;
    @FindBy(name = "password")
    public WebElement passWord;
    @FindBy(xpath= "//button[text()=' Login ']")
    public WebElement login;
    WebDriver driver;

    public void enterUserName(String username) {
        userName.sendKeys(username);
    }
    public void enterPassword(String password) {
        passWord.sendKeys(password);
    }
    public LoginPage_PF(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,30),this);
    }

    public void clickButton() {
        login.click();
    }
}
