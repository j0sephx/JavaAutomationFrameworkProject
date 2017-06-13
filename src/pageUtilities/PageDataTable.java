package pageUtilities;

import java.util.List;


public class PageDataTable
{
	private List<ElementInfo> elements;
	private String name;
	
	public PageDataTable(String name, List<ElementInfo> elements)
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

		AutomationFrameworkException exception = new AutomationFrameworkException(String.format("Element '%1$s' could not be found in '%2$s.xml'", elementName, name));
		
		throw exception;
	}
	
	public String getName()
	{
		return name;
	}
}
