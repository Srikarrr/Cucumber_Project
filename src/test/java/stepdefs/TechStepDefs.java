package stepdefs;


import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LoginPage_PF;
import pages.TechPage_PF;

public class TechStepDefs {
    public WebDriver driver;
    TechPage_PF tech;
    public TechStepDefs(){
        driver= DriverFactory.getInstance();
        tech=new TechPage_PF(driver);
    }
    @When("user enters {string} firstname")
    public void userEntersFirstname(String name) {
        tech.enterFirstName(name);
    }
    @And("user enters {string} lastname")
    public void userEntersLastname(String lastname) {
       tech.enterLastName(lastname);
    }
    @And("user selects {string} gender")
    public void userSelectsgender(String genderType) {
       tech.selectGender(genderType);
    }
    @And("user selects {string} years")
    public void userSelectsyear(String exp) throws Exception {
       tech.selectExperience(exp);
    }

}
