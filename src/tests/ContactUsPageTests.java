package tests;

import java.io.IOException;

import org.junit.Test;
import org.xml.sax.SAXException;

import application.PageDataManager;
import application.WebApplication;
import tests.common.TestCase;



public class ContactUsPageTests extends TestCase
{	

	@Test
	public void navigateToContactUsAndSendRequest() throws IOException, SAXException
	{
		String subject = "Customer service";
		String email = "test@test.com";
		String orderRef = "TestOrder123";
		String message = "Test Message";
		
		WebApplication.homePage.clickContactUsButton();
		WebApplication.contactUsPage.selectSubjectHeading(subject);
		WebApplication.contactUsPage.inputEmail(email);
		WebApplication.contactUsPage.inputOrderReference(orderRef);
		WebApplication.contactUsPage.inputMessage(message);
		WebApplication.contactUsPage.clickSubmitButton();
	}
	
}
