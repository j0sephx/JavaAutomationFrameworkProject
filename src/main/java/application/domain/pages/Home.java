package application.domain.pages;


import application.Element;

public class Home 
{
	private static final String PAGE_NAME = "Home";
	
	public Element contactUsButton;
	public Element searchBar;
	public Element searchBtn;
	public Element signInButton;
	
	public Home()
	{
		buildPage();
	}
	
	public void clickContactUsButton()
	{
		contactUsButton.click();
	}
	
	public void clickSearchButton()
	{
		searchBtn.click();
	}
	
	public void clickSignIn()
	{
		signInButton.click();
	}

	public void doSearch(String text)
	{
		searchBar.click();
		inputTextInSearchBar(text);
		clickSearchButton();
	}
	
	public void inputTextInSearchBar(String text)
	{
		signInButton.inputText(text);
	}
	
	private void buildPage()
	{
		contactUsButton = new Element("contactUsButton", PAGE_NAME);
		searchBar = new Element("searchBar", PAGE_NAME);
		searchBtn = new Element("searchBtn", PAGE_NAME);
		signInButton = new Element("signInButton", PAGE_NAME);
	}	

}