package application;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.io.FilenameUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class PageDataManager
{
	private static List<PageCollection> pages;
	
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
	
	public static List<ElementInfo> buildElementsList(Document pageXml) throws IOException, SAXException
	{
		NodeList elementNodes = pageXml.getElementsByTagName("Element");
		
		List<ElementInfo> elements = new ArrayList<ElementInfo>();
		
		for (int i = 0; i < elementNodes.getLength(); i++)
		{
			Element elementNode = (Element) elementNodes.item(i);		
			
			String name = elementNode.getAttribute("name");
			String locatorType = elementNode.getAttribute("locatorType");
			String locatorValue = elementNode.getAttribute("locatorValue");
								
			ElementInfo elementInfo = new ElementInfo(name, locatorValue, locatorType);
			elements.add(elementInfo);			
		}
		
		return elements;
	}
	
	public static void getFiles(String folderName) throws IOException, SAXException
	{
		File folderPath = new File(folderName);
		File[] files = folderPath.listFiles();
		
		for (File file : files)	
		{
			if (!FilenameUtils.isExtension(file.getName().toLowerCase(),"xml"))
			{
				System.out.println("Can't parse file name: " + file.getName().toLowerCase() + " : Not XML, File skipped.");
			}
			else
			{
				Document pageXml = null;
				try
				{
					pageXml = getDocumentBuilder().parse(file);
				}
				catch (SAXException | IOException e)
				{				
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				
				Element pageNode = (Element) pageXml.getDocumentElement();
				String pageName = pageNode.getAttribute("name");	
				
				List<ElementInfo> elements = buildElementsList(pageXml);				

				PageCollection page = new PageCollection(pageName, elements);				
				pages.add(page);
		}
	}
	}
	
}
