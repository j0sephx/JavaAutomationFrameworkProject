package application;

import org.junit.Test;

import application.common.TestCase;
import application.common.utilities.AssertionHelper;

public class ContactUsPageTests extends TestCase
{	
	@Test
	public void navigateToContactUsAndSendRequest()
	{
		String subject = "Customer service";
		String email = "test@test.com";
		String orderRef = "TestOrder123";
		String messageInput = "Test Message";
		String messageSuccess = "Your message has been successfully sent to our team.";
		
		WebApplication.homePage.clickContactUsButton();
		WebApplication.contactUsPage.selectSubjectHeading(subject);
		WebApplication.contactUsPage.inputEmail(email);
		WebApplication.contactUsPage.inputOrderReference(orderRef);
		WebApplication.contactUsPage.inputMessage(messageInput);
		WebApplication.contactUsPage.clickSubmitButton();
		
		
		AssertionHelper.contains(messageSuccess,messageSuccess);
	}
}