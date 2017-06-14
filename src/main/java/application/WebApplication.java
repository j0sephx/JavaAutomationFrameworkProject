package application;

import application.domain.pages.ContactUs;
import application.domain.pages.CreateAccount;
import application.domain.pages.Header;
import application.domain.pages.Home;
import application.domain.pages.SignIn;

public class WebApplication 
{
	public static ContactUs	contactUsPage;
	public static CreateAccount createAccountPage;
	public static Header header;
	public static Home homePage;
	public static SignIn signInPage;
	
	public static void buildPages()
	{
		contactUsPage = new ContactUs();
		createAccountPage = new CreateAccount();
		header	=	new Header();
		homePage = new Home();
		signInPage = new SignIn();
	}
}