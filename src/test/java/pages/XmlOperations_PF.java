package pages;

import factory.XmlFactory;

public class XmlOperations_PF {
    XmlFactory factory;
    public XmlOperations_PF(){
        factory=new XmlFactory();
    }

    public void readXmlFile(String file) {
        System.out.println(file);
        factory.readFile(file);
    }
}
