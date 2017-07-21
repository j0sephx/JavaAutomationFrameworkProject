package application.domain.pages;


import application.Element;

public class Header 
{
	private static final String PAGE_NAME = "Header";
	
	public Element dressesHeader;
	public Element headerSubMenuTshirts;
	public Element womenHeader;
	public Element tshirtsHeader;

	
	public Header()
	{
		buildPage();
	}
	
	public void navigateToDressesPage()
	{
		dressesHeader.click();
	}
	
	private void buildPage()
	{
		dressesHeader = new Element("dressesHeader", PAGE_NAME);
		womenHeader = new Element("womenHeader", PAGE_NAME);
		headerSubMenuTshirts = new Element("headerSubMenuTshirts", PAGE_NAME);
		tshirtsHeader = new Element("tshirtsHeader", PAGE_NAME);
	}
}