package application.domain.pages;

import application.Element;

public class Dresses 
{
	private static final String PAGE_NAME = "Dresses";
	
	public Element dressSubcategorySelect;
	public Element heading;
	
	public Dresses()
	{
		buildPage();
	}
	
	public void clickDressSubcategory(String title)
	{
		String locator = String.format(dressSubcategorySelect.getLocator(), title);
		dressSubcategorySelect.click(locator);
	}
	
	
	private void buildPage()
	{
		dressSubcategorySelect = new Element("dressSubcategorySelect", PAGE_NAME);
		heading = new Element("heading", PAGE_NAME);
	}	
}
