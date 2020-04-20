import java.io.ByteArrayInputStream;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;

public class XMLProcessor {

    public static String findNodeByXPath(String input, String expression) {

        XPathFactory factory = XPathFactory.newInstance();
        try {
            XPath xPath = factory.newXPath();
            return xPath.compile(expression).evaluate(new InputSource(new ByteArrayInputStream(input.getBytes())));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
