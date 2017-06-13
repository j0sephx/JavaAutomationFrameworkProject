package application;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class PageDataManager
{
	private static DocumentBuilder getDocumentBuilder()
	{
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = null;
		try
		{
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
		}
		catch (ParserConfigurationException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();			
		}
		
		return documentBuilder;
	}
	
	public static List<ElementInfo> loadFile(String fileName) throws IOException, SAXException
	{
		List<ElementInfo> elementList = new ArrayList<ElementInfo>();
		NodeList list = getDocumentBuilder().parse(new File(fileName)).getElementsByTagName("WebElement");

		for(int i = 0; i < list.getLength(); i++)
		{
			Element elementNode = (Element) list.item(i);		
			
			String name = elementNode.getAttribute("name");
			String locatorType = elementNode.getAttribute("locatorType");
			String locatorValue = elementNode.getAttribute("locatorValue");
														
			ElementInfo elementInfo = new ElementInfo(name, locatorValue, locatorType);
			elementList.add(elementInfo);	
		}
		return elementList;
	}
	
	public static void getFiles(String folderName)
	{
		File folderPath = new File(folderName);
		File[] files = folderPath.listFiles();
		
		for (File file : files)	
		{
			
		}
	}
	
}
