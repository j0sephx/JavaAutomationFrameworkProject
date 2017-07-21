package application;

import application.domain.pages.ContactUs;
import application.domain.pages.CreateAccount;
import application.domain.pages.Dresses;
import application.domain.pages.Footer;
import application.domain.pages.Header;
import application.domain.pages.Home;
import application.domain.pages.SignIn;

public class WebApplication 
{
	public static ContactUs	contactUsPage;
	public static CreateAccount createAccountPage;
	public static Footer footer;
	public static Header header;
	public static Home homePage;
	public static SignIn signInPage;
	public static Dresses dressesPage;
	
	public static void buildPages()
	{
		contactUsPage = new ContactUs();
		createAccountPage = new CreateAccount();
		footer = new Footer();
		header	=	new Header();
		homePage = new Home();
		signInPage = new SignIn();
		dressesPage = new Dresses();
	}
}