package application;

import org.junit.Test;

import application.common.TestCase;
import application.common.utilities.WebDriverHelper;

public class CreateAccountTests extends TestCase
{		
	@Test
	public void navigateToSignInPageAndCreateAnAccount() throws InterruptedException	
	{
		// Arrange
		String emailAddress = "test@brad.co.uk";
		String firstName = "Joseph";
		String surname = "Lynch";
		String password = "Password";
		int dayOfBirth = 9;
		
		// Act
		
		
		// Assert
		

		WebApplication.homePage.clickSignIn();
		//WebDriverHelper.click(WebApplication.homePage.signInButton);
		
		WebDriverHelper.inputText(WebApplication.signInPage.createEmail, emailAddress);
		WebDriverHelper.click(WebApplication.signInPage.createAnAccountButton);
		WebDriverHelper.click(WebApplication.createAccountPage.mrRadioBtn);
		WebDriverHelper.inputText(WebApplication.createAccountPage.firstNameInput,firstName);
		WebDriverHelper.inputText(WebApplication.createAccountPage.surnameInput, surname);
		WebDriverHelper.inputText(WebApplication.createAccountPage.passwordInput, password);
		WebApplication.createAccountPage.selectDayOfBirth(dayOfBirth);
		WebDriverHelper.selectFromDropdownText(WebApplication.createAccountPage.daysDropdown,"9  ");
		WebDriverHelper.selectFromDropdownText(WebApplication.createAccountPage.monthsDropdown,"April ");
		WebDriverHelper.selectFromDropdownValue(WebApplication.createAccountPage.yearsDropdown,"1992");
		WebDriverHelper.sendKeysKeyByKey(WebApplication.createAccountPage.addressFirstNameInput,firstName);
		WebDriverHelper.sendKeysKeyByKey(WebApplication.createAccountPage.addressSurnameInput, surname);
		WebDriverHelper.inputText(WebApplication.createAccountPage.addressCompanyInput,"Testland");
		WebDriverHelper.inputText(WebApplication.createAccountPage.addressLineOneInput,"12 Test Lane");
		WebDriverHelper.inputText(WebApplication.createAccountPage.addressLineTwoInput,"Floor 12");
		WebDriverHelper.inputText(WebApplication.createAccountPage.addressCityInput,"Testity");
		WebDriverHelper.selectFromDropdownText(WebApplication.createAccountPage.addressStateDropdown,"Rhode Island");
		WebDriverHelper.inputText(WebApplication.createAccountPage.addressPostcodeInput,"90210");
		WebDriverHelper.selectFromDropdownText(WebApplication.createAccountPage.addressCountryDropdown,"United States");
		WebDriverHelper.inputText(WebApplication.createAccountPage.addressAdditionalInformation,"Test");
		WebDriverHelper.inputText(WebApplication.createAccountPage.addressPhoneInput,"00000001");
		WebDriverHelper.inputText(WebApplication.createAccountPage.addressMobilePhoneInput,"00000000");
		WebDriverHelper.inputText(WebApplication.createAccountPage.addressNameInput,"Home");
		WebDriverHelper.click(WebApplication.createAccountPage.registerAccountBtn);
		Thread.sleep(10000);
	}
	
//	@Test
//	public void thisWillSoonBeATest()	
//	{
//		//System.out.println("Navigated to test website");
//	}
}
