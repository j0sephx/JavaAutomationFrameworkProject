package application;

import org.openqa.selenium.By;

public class ElementInfo
{
	private String name;
	private By locator;
	private String type;

	public ElementInfo(String name, String locatorType, String locatorValue)
	{
		this.name = name;

		locator = buildLocator(locatorValue, locatorType);
	}
	
	
	public String getName()
	{
		return name;
	}

	public By getLocator()
	{
		return locator;
	}

	/**
	 * @return the type
	 */
	public String getType()
	{
		return type;
	}

	public By buildLocator(String locatorValue, String locatorType)
	{
		By locator = null;

		switch (locatorType)
		{
		case "id":
			locator = By.id(locatorValue);
			break;
		case "name":
			locator = By.name(locatorValue);
			break;
		case "cssSelector":
			locator = By.cssSelector(locatorValue);
			break;
		case "linkText":
			locator = By.linkText(locatorValue);
			break;
		case "partialLinkText":
			locator = By.partialLinkText(locatorValue);
			break;
		case "tagName":
			locator = By.tagName(locatorValue);
			break;
		case "xpath":
			locator = By.xpath(locatorValue);
			break;
		default:
			throw new RuntimeException("Invalid Locator Type");
		}

		return locator;
	}
}