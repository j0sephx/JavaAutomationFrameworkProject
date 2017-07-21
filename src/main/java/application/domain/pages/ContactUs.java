package application.domain.pages;

import application.Element;


public class ContactUs 
{
	private static final String PAGE_NAME = "ContactUs";
	
	public Element inputEmail;
	public Element messageSentSuccess;
	public Element messageTextArea;
	public Element orderInput;
	public Element subjectHeadingDropdown;
	public Element submitButton;
	
	public ContactUs()
	{
		buildPage();
	}
	
	public void clickSubmitButton()
	{
		submitButton.click();
	}
	
	public void inputEmail(String email)
	{
		inputEmail.inputText(email);
	}
	
	public void inputMessage(String text)
	{
		messageTextArea.inputText(text);
	}
	
	public void inputOrderReference(String order)
	{
		orderInput.inputText(order);
	}
	
	public void selectSubjectHeading(String subject)
	{
		subjectHeadingDropdown.selectFromDropdownText(subject);
	}
		
	private void buildPage()
	{
		inputEmail  = new Element("inputEmail", PAGE_NAME);
		messageSentSuccess  = new Element("messageSentSuccess", PAGE_NAME);
		messageTextArea  = new Element("messageTextArea", PAGE_NAME);
		orderInput  = new Element("orderInput", PAGE_NAME);
		subjectHeadingDropdown  = new Element("subjectHeadingDropdown", PAGE_NAME);
		submitButton  = new Element("submitButton", PAGE_NAME);
	}
} 