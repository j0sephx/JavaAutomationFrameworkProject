package application.domain.pages;

import application.Element;
import application.ElementInfo;
import application.common.utilities.PageDataManager;
import application.common.utilities.WebDriverHelper;

public class Footer 
{
	private static final String PAGE_NAME = "Footer";
	
	public Element categoriesTitle;
	public Element informationSectionLinks;
	public Element myAccountSectionLinks;
	public Element women;
	
	public Footer()
	{
		buildPage();
	}
	
	public void clickInformationSectionLink(String title)
	{
		String locator = returnInformationSectionLinks(elementInfo.getLocatorValue(), title);
		informationSectionLinks.click(elementInfo);
		
	}
	
	public String returnInformationSectionLinks(String locatorValue, String informationSectionLinks)
	{
		return String.format(locatorValue,informationSectionLinks);
	}
	
	private void buildPage()
	{
		categoriesTitle  = new Element("categoriesTitle", PAGE_NAME);
		informationSectionLinks = new Element("informationSectionLinks", PAGE_NAME);  
		myAccountSectionLinks  = new Element("myAccountSectionLinks", PAGE_NAME);   
		women   = new Element("women", PAGE_NAME); 
	}
	
	private void clickElement(String locator)
	{
		WebDriverHelper.getDriver().findElement(arg0)
		
		return getDriver().findElement(By.xpath(locator));
	}
}

