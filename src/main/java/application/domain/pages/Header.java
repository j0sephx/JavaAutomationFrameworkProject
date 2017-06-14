package application.domain.pages;


import application.ElementInfo;
import application.common.utilities.PageDataManager;

public class Header 
{
	private static final String PAGE_NAME = "Header";
	
	public ElementInfo womenHeader;
	public ElementInfo headerSubMenuTshirts;
	
	public Header()
	{
		buildPage();
	}
	
	private void buildPage()
	{
		womenHeader  = PageDataManager.findElement("contactUsButton", PAGE_NAME);
		headerSubMenuTshirts = PageDataManager.findElement("headerSubMenuTshirts", PAGE_NAME);
	}
}