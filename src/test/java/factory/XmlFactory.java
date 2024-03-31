package factory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XmlFactory {
       public void readFile(String xmlfile){
        try {
            System.out.println(xmlfile);
            File f1 = new File(xmlfile);
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc=db.parse(f1);
            doc.getDocumentElement().normalize();
            System.out.println("Root Element"+doc.getDocumentElement().getNodeName());
            NodeList nodeList=doc.getElementsByTagName("student");
            for(int itr=0;itr< nodeList.getLength();itr++){
                Node node=nodeList.item(itr);
                if(node.getNodeType()==Node.ELEMENT_NODE){
                    Element eElements =(Element)node;
                    System.out.println("Student ID:"+eElements.getElementsByTagName("id").item(0).getTextContent());
                    System.out.println("First Name:"+eElements.getElementsByTagName("firstname").item(0).getTextContent());
                    System.out.println("Last Name:"+eElements.getElementsByTagName("lastname").item(0).getTextContent());
                    System.out.println("Subject:"+eElements.getElementsByTagName("subject").item(0).getTextContent());
                    System.out.println("Marks:"+eElements.getElementsByTagName("marks").item(0).getTextContent());

                }
            }
        }
        catch(Exception e){

        }
    }
}
