package pageUtilities;

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

import application.ElementInfo;

public class PageDataManager 
{
	private static List<PageDataTable> pages;
	
	/**
	 * 
	 * @param elementName
	 * @param pageName
	 * @return
	 */
	public static ElementInfo findElement(String elementName, String pageName)
	{
		ElementInfo elementInfo = null;
		elementInfo = getPageTable(pageName).getElement(elementName);
		
		ElementInfo elementInfoCopy = new ElementInfo(elementInfo.getName(), elementInfo.getType(), elementInfo.getLocator().toString());
		
		return elementInfoCopy;	
	}
	
	/**
	 * 
	 * @param pageName
	 * @return
	 */
	public static PageDataTable getPageTable(String pageName) 
	{		
		for (PageDataTable page : pages)
		{
			if (page.getName().equals(pageName))
			{
				return page;
			}
		}
		
		return null;
	}
	
	/**
	 * 
	 * @param projectName
	 */
	public static void loadProject(String projectName)
	{
		if (pages == null)
		{
			pages = new ArrayList<PageDataTable>();			
	
			String projectFilepath = System.getProperty("user.dir") + "\\resources\\pageData";
			System.out.println("Loading project... :" + projectFilepath);
			
			loadPages(projectFilepath);
		}
	}
	
	/**
	 * 
	 * @param pageXml
	 * @return
	 */
	private static List<ElementInfo> buildElementsList(Document pageXml)
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
	
	/**
	 * 
	 * @return
	 */
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
	
	/**
	 * 
	 * @param folder
	 */
	private static void loadPages(String folder) 
	{		
		System.out.println("loadPages");
		File folderPath = new File(folder);
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

				PageDataTable page = new PageDataTable(pageName, elements);				
				pages.add(page);
			}
		}			
	}	
}
