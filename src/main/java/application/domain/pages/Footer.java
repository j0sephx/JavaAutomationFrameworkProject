package application.domain.pages;

import application.ElementInfo;
import application.common.utilities.PageDataManager;
import application.common.utilities.WebDriverHelper;

public class Footer 
{
	private static final String PAGE_NAME = "Footer";
	
	public ElementInfo categoriesTitle;
	public ElementInfo informationSectionLinks;
	public ElementInfo women;
	
	
	
	public Footer()
	{
		buildPage();
	}
	
//	public void clickInformationSectionLink(String informationSectionLink)
//	{
//		WebDriverHelper.click(ElementInfo.returnInformationSectionLinks(informationSectionLink));
//	}
	
	public String returnInformationSectionLinks(String informationSectionLink)
	{
		return "//section[@id='block_various_links_footer']//a[@title='"+informationSectionLink+"']";
	}
	
	private void buildPage()
	{
		categoriesTitle  = PageDataManager.findElement("categoriesTitle", PAGE_NAME);
		women  = PageDataManager.findElement("women", PAGE_NAME);
	}
}

