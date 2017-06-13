package pages;


import application.ElementInfo;
import pageUtilities.PageDataManager;
import utilities.WebDriverHelper;

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
	}	
}
