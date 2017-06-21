package application.domain.pages;

import application.Element;

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
		String locator = String.format(informationSectionLinks.getLocator(), title);
		informationSectionLinks.click(locator);
	}
	
	
	private void buildPage()
	{
		categoriesTitle  = new Element("categoriesTitle", PAGE_NAME);
		informationSectionLinks = new Element("informationSectionLinks", PAGE_NAME);  
		myAccountSectionLinks  = new Element("myAccountSectionLinks", PAGE_NAME);   
		women   = new Element("women", PAGE_NAME); 
	}
	
}

