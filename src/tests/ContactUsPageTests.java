package tests;

import org.junit.Test;
import application.WebApplication;
import tests.common.TestCase;



public class ContactUsPageTests extends TestCase
{	

	@Test
	public void navigateToContactUsAndSendRequest()
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
