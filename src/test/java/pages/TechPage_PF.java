package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class TechPage_PF {
    @FindBy(name="firstname")
    public WebElement firstname;
    @FindBy(name="lastname")
    public WebElement lastname;
    @FindBy(id="sex-0")
    public WebElement male;
    @FindBy(id="sex-1")
    public WebElement female;
    @FindBy(id="exp-0")
    public WebElement exp0;
    @FindBy(id="exp-1")
    public WebElement exp1;
    @FindBy(id="exp-2")
    public WebElement exp2;
    @FindBy(id="exp-3")
    public WebElement exp3;
    @FindBy(id="exp-4")
    public WebElement exp4;
    @FindBy(id="exp-5")
    public WebElement exp5;
    @FindBy(id="exp-6")
    public WebElement exp6;

    WebDriver driver;
    public TechPage_PF(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,30),this);
    }
    public void enterFirstName(String name){
        firstname.sendKeys(name);
    }
    public void enterLastName(String name){
       lastname.sendKeys(name);
    }

    public void selectGender(String genderType) {
        if(genderType.equalsIgnoreCase("Male"))
            male.click();
        else
            female.click();
   }
   public void selectExperience(String exp) throws Exception {
        switch(exp){
            case "1":
                exp0.click();
                break;
            case "2":
                exp1.click();
                break;
            case "3":
                exp2.click();
                break;
            case "4":
                exp3.click();
                break;
            case "5":
                exp4.click();
                break;
            case "6":
                exp5.click();
                break;
            case "7":
                exp6.click();
                break;
            default:
               throw new Exception("Selected experience is wrong");
       }
   }
}
