package application.domain.pages;

import application.ElementInfo;
import application.common.utilities.PageDataManager;
import application.common.utilities.WebDriverHelper;

public class ContactUs 
{
	private static final String PAGE_NAME = "ContactUs";
	
	public ElementInfo inputEmail;
	public ElementInfo messageSentSuccess;
	public ElementInfo messageTextArea;
	public ElementInfo orderInput;
	public ElementInfo subjectHeadingDropdown;
	public ElementInfo submitButton;
	
	public ContactUs()
	{
		buildPage();
	}
	
	public void clickSubmitButton()
	{
		WebDriverHelper.click(submitButton);
	}
	
	public void inputEmail(String email)
	{
		WebDriverHelper.inputText(inputEmail, email);
	}
	
	public void inputMessage(String text)
	{
		WebDriverHelper.inputText(messageTextArea, text);
	}
	
	public void inputOrderReference(String order)
	{
		WebDriverHelper.inputText(orderInput, order);
	}
	
	public void selectSubjectHeading(String subject)
	{
		WebDriverHelper.selectFromDropdownText(subjectHeadingDropdown, subject);
	}
		
	private void buildPage()
	{
		inputEmail  = PageDataManager.findElement("inputEmail", PAGE_NAME);
		messageSentSuccess  = PageDataManager.findElement("messageSentSuccess", PAGE_NAME);
		messageTextArea  = PageDataManager.findElement("messageTextArea", PAGE_NAME);
		orderInput  = PageDataManager.findElement("orderInput", PAGE_NAME);
		subjectHeadingDropdown  = PageDataManager.findElement("subjectHeadingDropdown", PAGE_NAME);
		submitButton  = PageDataManager.findElement("submitButton", PAGE_NAME);
	}
} 