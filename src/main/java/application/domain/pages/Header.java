package application.domain.pages;


import application.Element;

public class Header 
{
	private static final String PAGE_NAME = "Header";
	
	public Element womenHeader;
	public Element headerSubMenuTshirts;
	
	public Header()
	{
		buildPage();
	}
	
	private void buildPage()
	{
		womenHeader = new Element("womanHeader", PAGE_NAME);
		headerSubMenuTshirts = new Element("headerSubMenuTshirts", PAGE_NAME);
	}
}