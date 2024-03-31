package utilities;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class XMLREADERR {
    DocumentBuilder docBuilder;
    Document xmlDoc;

    public XMLREADERR(String xmlpath) {
        try {
            File xmlFile = new File(xmlpath);
            docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            xmlDoc = docBuilder.parse(xmlFile);
        } catch (Exception e) {
            System.out.println("message is" + e.getMessage());
        }
    }

    public List<Hashtable<String, String>> getDataasList(String testname) {
        Node testnode = getNode(testname);
        NodeList dataNodes = testnode.getChildNodes();
        List<Hashtable<String, String>> list = new ArrayList<Hashtable<String, String>>();
        Hashtable<String, String> table = null;
        for (int i = 0; i < dataNodes.getLength(); i++) {
            table = new Hashtable<String, String>();
            Node dataNode = dataNodes.item(i);
            if (dataNode.getNodeType() == Node.ELEMENT_NODE) {
                NodeList dataList = dataNode.getChildNodes();
                for (int j = 0; j < dataList.getLength(); j++) {
                    Node data = dataList.item(j);
                    if (data.getNodeType() == Node.ELEMENT_NODE) {
                        table.put(data.getNodeName(), data.getTextContent());
                    }

                }
                list.add(table);
            }

        }
        return list;
    }

    private Node getNode(String nodeName) {
        Element rootNode=xmlDoc.getDocumentElement();
        NodeList testCasesList=rootNode.getChildNodes();
        Node returnNode=null;
        for(int i=0;i<testCasesList.getLength();i++){
            Node tempNode=testCasesList.item(i);
            if(tempNode.getNodeType()==Node.ELEMENT_NODE){
                if(nodeName.equals(tempNode.getNodeName())){
                    returnNode=tempNode;
                }
            }
        }
        return returnNode;
    }
}




