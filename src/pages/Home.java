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
		//ElementInfo contactUsButton = PageDataManager.loadFile(System.getProperty("user.dir") + "//resources//pageData//home.xml", "contactUsButton");
	}	
}
