package application.domain.pages;


import application.ElementInfo;
import application.common.utilities.PageDataManager;
import application.common.utilities.WebDriverHelper;

public class Home 
{
	private static final String PAGE_NAME = "Home";
	
	public ElementInfo contactUsButton;
	public ElementInfo searchBar;
	public ElementInfo searchBtn;
	public ElementInfo signInButton;
	
	public Home()
	{
		buildPage();
	}
	
	public void clickContactUsButton()
	{
		WebDriverHelper.click(contactUsButton);
	}
	
	public void clickSearchButton()
	{
		WebDriverHelper.click(searchBtn);
	}
	
	public void clickSignIn()
	{
		WebDriverHelper.click(signInButton);
	}

	public void doSearch(String text)
	{
		WebDriverHelper.click(searchBar);
		inputTextInSearchBar(text);
		clickSearchButton();
	}
	
	public void inputTextInSearchBar(String text)
	{
		WebDriverHelper.inputText(signInButton, text);
	}
	
	private void buildPage()
	{
		contactUsButton = PageDataManager.findElement("contactUsButton", PAGE_NAME);
		searchBar = PageDataManager.findElement("searchBar", PAGE_NAME);
		searchBtn = PageDataManager.findElement("searchBtn", PAGE_NAME);
		signInButton = PageDataManager.findElement("signInButton", PAGE_NAME);
	}	
	
	
	
}
