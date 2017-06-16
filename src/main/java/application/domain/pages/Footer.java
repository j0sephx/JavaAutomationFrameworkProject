package application.domain.pages;

import org.openqa.selenium.By;

import application.ElementInfo;
import application.common.utilities.PageDataManager;
import application.common.utilities.WebDriverHelper;

public class Footer 
{
	private static final String PAGE_NAME = "Footer";
	
	public ElementInfo categoriesTitle;
	public ElementInfo informationSectionLinks;
	public ElementInfo myAccountSectionLinks;
	public ElementInfo women;
	
	
	
	public Footer()
	{
		buildPage();
	}
	
	public void clickInformationSectionLink(ElementInfo elementInfo, String title)
	{
		String locator = returnInformationSectionLinks(elementInfo.getLocatorValue(), title);
		elementInfo.setLocatorValue(locator);
		elementInfo.buildLocator();
		WebDriverHelper.click(elementInfo);
	}
	
	public String returnInformationSectionLinks(String locatorValue, String informationSectionLinks)
	{
		return String.format(locatorValue,informationSectionLinks);
	}
	
	private void buildPage()
	{
		categoriesTitle  = PageDataManager.findElement("categoriesTitle", PAGE_NAME);
		informationSectionLinks = PageDataManager.findElement("informationSectionLinks", PAGE_NAME);
		myAccountSectionLinks = PageDataManager.findElement("myAccountSectionLinks", PAGE_NAME);
		women  = PageDataManager.findElement("women", PAGE_NAME);
	}
}

