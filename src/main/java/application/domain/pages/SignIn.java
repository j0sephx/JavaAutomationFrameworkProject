package application.domain.pages;


import application.ElementInfo;
import application.common.utilities.PageDataManager;


public class SignIn 
{
	private static final String PAGE_NAME = "SignIn";
	
	public ElementInfo createEmail;
	public ElementInfo createAnAccountButton;
	public ElementInfo loginEmail;
	public ElementInfo enterPassword; 
	public ElementInfo loginButton;	
	
	public SignIn()
	{
		buildPage();
	}
	
	private void buildPage()	
	{
		createEmail  = PageDataManager.findElement("createEmail", PAGE_NAME);
		createAnAccountButton  = PageDataManager.findElement("createAnAccountButton", PAGE_NAME);
		loginEmail  = PageDataManager.findElement("loginEmail", PAGE_NAME);
		enterPassword  = PageDataManager.findElement("enterPassword", PAGE_NAME);
		loginButton  = PageDataManager.findElement("loginButton", PAGE_NAME);
	}	
}