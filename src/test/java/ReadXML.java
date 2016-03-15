import org.junit.Test;
import org.omg.CORBA.NO_IMPLEMENT;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileOutputStream;

/**
 * Created by xie on 15/12/30.
 */
public class ReadXML {

    @Test
    public void read() throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse("src/test/java/xml/config.xml");

        NodeList list = document.getElementsByTagName("a");
        Node node = list.item(0);
        System.out.println(node.getTextContent());

        Element element = document.createElement("c");
        element.setTextContent("郭老师");
        Element root = (Element) document.getElementsByTagName("soft").item(0);
        root.appendChild(element);

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.transform(new DOMSource(document),new StreamResult(new FileOutputStream("src/test/java/xml/config.xml")));
    }
}

