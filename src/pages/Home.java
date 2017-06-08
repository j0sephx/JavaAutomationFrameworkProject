package pages;


import application.ElementInfo;
import utilities.WebDriverHelper;

public class Home 
{
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
		contactUsButton = new ElementInfo("contactUsButton","id","contact-link");
		searchBar = new ElementInfo("searchBar","id","search_query_top");
		searchBtn = new ElementInfo("searchBtn","xpath","//button[@name='submit_search']");
		signInButton = new ElementInfo("signInButton","xpath","//div[@class='header_user_info']");
	}	
}
