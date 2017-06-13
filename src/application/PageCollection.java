package application;

import java.util.List;

public class PageCollection 
{
	private List<ElementInfo> elements;
	private String name;
	
	public PageCollection(String name, List<ElementInfo> elements)
	{
		this.name = name;
		this.elements = elements;
	}
	
	public ElementInfo getElement(String elementName)
	{	
		for (ElementInfo elementInfo : elements)
		{
			if (elementInfo.getName().equals(elementName))
			{
				return elementInfo;
			}
		}

		return null;
	}
	
	public String getName()
	{
		return name;
	}
	
}
