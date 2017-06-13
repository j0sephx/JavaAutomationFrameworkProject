package application.domain.pages;

import application.ElementInfo;
import application.common.utilities.WebDriverHelper;

public class ContactUs 
{
	public ElementInfo inputEmail;
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
		inputEmail = new ElementInfo("inputEmail", "id", "email");
		orderInput = new ElementInfo("orderInput","id","id_order");
		messageTextArea = new ElementInfo("messageTextArea","id","message");
		subjectHeadingDropdown = new ElementInfo("subjectHeadingDropdown","id","id_contact");
		submitButton = new ElementInfo ("submitButton","id","submitMessage");
	}
} 