package application.domain.pages;

import application.Element;
import application.ElementInfo;
import application.common.utilities.PageDataManager;
import application.common.utilities.WebDriverHelper;

public class CreateAccount 
{
	private static final String PAGE_NAME = "CreateAccount";
	
	public Element addressAdditionalInformation;
	public Element addressFirstNameInput;
	public Element addressLineOneInput;
	public Element addressLineTwoInput;
	public Element addressSurnameInput;
	public Element addressCityInput;
	public Element addressCompanyInput;
	public Element addressCountryDropdown;
	public Element addressMobilePhoneInput;
	public Element addressPhoneInput;
	public Element addressNameInput;
	public Element addressPostcodeInput;
	public Element addressStateDropdown;
	public Element daysDropdown;
	public Element firstNameInput;
	public Element monthsDropdown;
	public Element mrRadioBtn; 
	public Element mrsRadioBtn;
	public Element passwordInput;
	public Element registerAccountBtn;
	public Element surnameInput;
	public Element yearsDropdown;

	public CreateAccount()
	{
		buildPage();
	}

	public void selectDayOfBirth(int dayOfBirth)
	{
		String dayAsString = String.format("%d  ", dayOfBirth);
		daysDropdown.inputText(dayAsString);
	}
	
	private void buildPage()
	{	
		addressAdditionalInformation = new Element("addressAdditionalInformation", PAGE_NAME);
		addressFirstNameInput = new Element("addressFirstNameInput", PAGE_NAME);
		addressLineOneInput = new Element("addressLineOneInput", PAGE_NAME);
		addressLineTwoInput = new Element("addressLineTwoInput", PAGE_NAME);
		addressSurnameInput = new Element("addressSurnameInput", PAGE_NAME);
		addressCityInput = new Element("addressCityInput", PAGE_NAME);
		addressCompanyInput = new Element("addressCompanyInput", PAGE_NAME);
		addressCountryDropdown = new Element("addressCountryDropdown", PAGE_NAME);
		addressMobilePhoneInput = new Element("addressMobilePhoneInput", PAGE_NAME);
		addressPhoneInput = new Element("addressPhoneInput", PAGE_NAME);
		addressNameInput = new Element("addressNameInput", PAGE_NAME);
		addressPostcodeInput = new Element("addressPostcodeInput", PAGE_NAME);
		addressStateDropdown = new Element("addressStateDropdown", PAGE_NAME);
		daysDropdown = new Element("daysDropdown", PAGE_NAME);
		firstNameInput = new Element("firstNameInput", PAGE_NAME);
		monthsDropdown = new Element("monthsDropdown", PAGE_NAME);
		mrRadioBtn = new Element("mrRadioBtn", PAGE_NAME);
		mrsRadioBtn = new Element("mrsRadioBtn", PAGE_NAME);
		passwordInput = new Element("passwordInput", PAGE_NAME);
		registerAccountBtn = new Element("registerAccountBtn", PAGE_NAME);
		surnameInput = new Element("surnameInput", PAGE_NAME);
		yearsDropdown = new Element("yearsDropdown", PAGE_NAME);
	}
}
