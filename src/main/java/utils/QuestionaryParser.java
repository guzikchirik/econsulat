package utils;

import com.sun.org.apache.xerces.internal.parsers.DOMParser;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.collections.transformation.SortedList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.apache.commons.collections.list.TreeList;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * Created by Anton_Chyrko on 3/5/2018.
 */
public class QuestionaryParser {

  private static final String PATH_TO_QUESTIONARY_XML = "src/main/resources/questionary.xml";
  private static final String PATH_TO_QUESTIONARY1_XML = "src/main/resources/questionary1.xml";
  private static final String PATH_TO_QUESTIONNAIRE_TXT = "src/main/resources/personal_data.txt";

  public static void main(String[] args) {

//    setXmlFromTxt();
//    parseXml();
    createXml();


  }

  public static void createXml() {
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    DocumentBuilder builder;

    try {
      builder = factory.newDocumentBuilder();

      Document doc = builder.newDocument();

      Element root = doc.createElementNS("econsulat/created_questionnaire", "questionnaire");
      doc.appendChild(root);

      List<Element> elements = getItems(doc, readTxt());
      for (Element el : elements) {
        root.appendChild(el);
      }

//создаем объект TransformerFactory для печати в консоль
      TransformerFactory transformerFactory = TransformerFactory.newInstance();
      Transformer transformer = transformerFactory.newTransformer();
      // для красивого вывода в консоль
      transformer.setOutputProperty(OutputKeys.INDENT, "yes");
      DOMSource source = new DOMSource(doc);

      //печатаем в консоль или файл
      StreamResult console = new StreamResult(System.out);
      StreamResult file = new StreamResult(new File(PATH_TO_QUESTIONARY1_XML));

      //записываем данные
      transformer.transform(source, console);
      transformer.transform(source, file);
      System.out.println("Создание XML файла закончено");

    } catch (ParserConfigurationException e) {
      e.printStackTrace();
    } catch (TransformerConfigurationException e) {
      e.printStackTrace();
    } catch (TransformerException e) {
      e.printStackTrace();
    }

  }

  private static List<Element> getItems(Document doc, Map<String, String> items) {
    List<Element> actualItems = new ArrayList<>();
    Iterator<Map.Entry<String, String>> iter = items.entrySet().iterator();
    while (iter.hasNext()) {
      Map.Entry<String, String> pair = iter.next();
      Element item = doc.createElement("item");
      item.setAttribute("name", pair.getKey());

      Element input = doc.createElement("input");
      input.appendChild(doc.createTextNode(pair.getValue()));
      item.appendChild(input);

//      item.appendChild(doc.createTextNode(pair.getValue()));
      actualItems.add(item);
    }
    return actualItems;
  }

  private static Map<String, String> readTxt() {
    String key;
    String value;
    String regexp = "([A-Za-z _-]*)([=])(.*)";

    Map<String, String> result = new HashMap<>();

    Pattern p = Pattern.compile(regexp);
    Matcher m;
    try {
      FileInputStream fstream = new FileInputStream(PATH_TO_QUESTIONNAIRE_TXT);
      BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
      String strLine;
      while ((strLine = br.readLine()) != null) {
        m = p.matcher(strLine);
        m.find();
        key = m.group(1);
        value = m.group(3);
        result.put(key, value);
      }
    } catch (IOException e) {
      System.out.println("Error " + e);
    }
    return result;
  }
}
