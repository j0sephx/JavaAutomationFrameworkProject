package application;

import org.openqa.selenium.By;

public class ElementInfo
{
	private String name;
	private String locatorType;
	private String locatorValue;
	private By locator;

	public ElementInfo(String name, String locatorType, String locatorValue)
	{
		this.name = name;
		this.locatorType = locatorType;
		this.locatorValue = locatorValue;
		
		buildLocator();
	}
	
	public String getLocatorType() 
	{
		return locatorType;
	}
	
	public String getName()
	{
		return name;
	}

	public By getLocator()
	{
		return locator;
	}
	
	public String getLocatorValue() 
	{
		return locatorValue;
	}
	
	public void setLocatorValue(String locatorValue) 
	{
		this.locatorValue = locatorValue;
	}
	
	public void setLocator(By locator) 
	{
		this.locator = locator;
	}

	/**
	 * @return the type
	 */
	public String getType()
	{
		return locatorType;
	}
	
	public By buildLocator(ElementInfo elementInfo)
	{
		By locator = null;
		String locatorType = elementInfo.getLocatorType().toLowerCase();
		
		switch (locatorType)
		{
		case "id":
			locator = By.id(elementInfo.getLocatorValue());
			break;
		case "name":
			locator = By.name(elementInfo.getLocatorValue());
			break;
		case "cssSelector":
			locator = By.cssSelector(elementInfo.getLocatorValue());
			break;
		case "linkText":
			locator = By.linkText(elementInfo.getLocatorValue());
			break;
		case "partialLinkText":
			locator = By.partialLinkText(elementInfo.getLocatorValue());
			break;
		case "tagName":
			locator = By.tagName(elementInfo.getLocatorValue());
			break;
		case "xpath":
			locator = By.xpath(elementInfo.getLocatorValue());
			break;
		default:
			throw new RuntimeException("Invalid Locator Type");
		}

		return locator;
	}
	
	public void buildLocator() 
	{
		locator = buildLocator(this);
	}
}