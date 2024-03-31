package stepdefs;

import factory.DriverFactory;
import factory.SingleTonSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LoginPage_PF;

public class LoginStepDef {
    public WebDriver driver;
    LoginPage_PF login;
    public LoginStepDef(){
        driver=DriverFactory.getInstance();
        login=new LoginPage_PF(driver);
    }
    @Given("I have entered invalid {string} and {string}")
    public void iHaveEnteredInvalidAnd(String username, String password) {
        System.out.println("UserName is"+username);
        System.out.println("Password is"+password);
    }
    @Then("I should see the error message indicating {string}")
    public void iShouldSeeTheErrorMessageIndicating(String errormessage) {
        System.out.println("Error message is"+errormessage);
    }

    @Given("user opens the browser {string}")
    public void userOpensTheBrowser(String url) {
         SingleTonSetup setup=new SingleTonSetup(url);
    }

    @When("user enters {string} and {string}")
    public void userEntersUsernameAndPassword(String username,String password) {

        login.enterUserName(username);
        login.enterPassword(password);
    }

    @And("user clicks on login button")
    public void userClicksOnLoginButton() {
        login.clickButton();
    }
}
