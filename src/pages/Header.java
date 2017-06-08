package pages;


import application.ElementInfo;

public class Header 
{
	public ElementInfo womenHeader;
	public ElementInfo headerSubMenuTshirts;
	
	public Header()
	{
		buildPage();
	}
	
	private void buildPage()
	{
		womenHeader  = new ElementInfo("womenHeader","xpath","//div[@id='block_top_menu']//a[@title='Women']");
		headerSubMenuTshirts = new ElementInfo("headerSubMenuTshirts","xpath","//ul[@class='submenu-container clearfix first-in-line-xs']//ul//li//a[@title='T-shirts']");
	}
}