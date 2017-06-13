package application;

import com.gargoylesoftware.htmlunit.javascript.host.xml.XMLDocument;

public class XmlReader 
{
	public void returnByLocator(String name)
	{
		XMLDocument locatorDocument = new XMLDocument();
		locatorDocument.load(xmlSource);
		xmlNode Element = locatorDocument.getNode(String.format("//Element[@name='{}']", name));
	}
}
