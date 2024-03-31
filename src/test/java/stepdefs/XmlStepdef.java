package stepdefs;

import factory.XmlFactory;
import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.XmlOperations_PF;

public class XmlStepdef   {

    XmlOperations_PF xmloperations;
     public XmlStepdef(){

         xmloperations=new XmlOperations_PF();
     }
    @And("user reads the data from xml file {string}")
    public void userReadsTheDataFromXmlFile(String file){
        System.out.println(file);
        xmloperations.readXmlFile(System.getProperty("user.dir") + "\\src\\test\\resources\\xmlfiles\\"+file+"");


    }


}
