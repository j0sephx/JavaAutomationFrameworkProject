package application;

import pages.ContactUs;
import pages.CreateAccount;
import pages.Header;
import pages.Home;
import pages.SignIn;

public class WebApplication 
{
	//test
	public static void buildPages()
	{
		contactUsPage = new ContactUs();
		createAccountPage = new CreateAccount();
		header	=	new Header();
		homePage = new Home();
		signInPage = new SignIn();
	}

	public static ContactUs	contactUsPage;
	public static CreateAccount createAccountPage;
	public static Header header;
	public static Home homePage;
	public static SignIn signInPage;
}
