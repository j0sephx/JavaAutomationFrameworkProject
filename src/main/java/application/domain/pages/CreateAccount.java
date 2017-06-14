package application.domain.pages;

import application.ElementInfo;
import application.common.utilities.PageDataManager;
import application.common.utilities.WebDriverHelper;

public class CreateAccount 
{
	private static final String PAGE_NAME = "CreateAccount";
	
	public ElementInfo addressAdditionalInformation;
	public ElementInfo addressFirstNameInput;
	public ElementInfo addressLineOneInput;
	public ElementInfo addressLineTwoInput;
	public ElementInfo addressSurnameInput;
	public ElementInfo addressCityInput;
	public ElementInfo addressCompanyInput;
	public ElementInfo addressCountryDropdown;
	public ElementInfo addressMobilePhoneInput;
	public ElementInfo addressPhoneInput;
	public ElementInfo addressNameInput;
	public ElementInfo addressPostcodeInput;
	public ElementInfo addressStateDropdown;
	public ElementInfo daysDropdown;
	public ElementInfo firstNameInput;
	public ElementInfo monthsDropdown;
	public ElementInfo mrRadioBtn; 
	public ElementInfo mrsRadioBtn;
	public ElementInfo passwordInput;
	public ElementInfo registerAccountBtn;
	public ElementInfo surnameInput;
	public ElementInfo yearsDropdown;

	public CreateAccount()
	{
		buildPage();
	}

	public void selectDayOfBirth(int dayOfBirth)
	{
		String dayAsString = String.format("%d  ", dayOfBirth);
		WebDriverHelper.inputText(daysDropdown, dayAsString);
	}
	
	private void buildPage()
	{	
		
		addressAdditionalInformation = PageDataManager.findElement("addressAdditionalInformation", PAGE_NAME);
		addressFirstNameInput = PageDataManager.findElement("addressFirstNameInput", PAGE_NAME);
		addressLineOneInput = PageDataManager.findElement("addressLineOneInput", PAGE_NAME);
		addressLineTwoInput = PageDataManager.findElement("addressLineTwoInput", PAGE_NAME);
		addressSurnameInput = PageDataManager.findElement("addressSurnameInput", PAGE_NAME);
		addressCityInput	= PageDataManager.findElement("addressCityInput", PAGE_NAME);
		addressCountryDropdown = PageDataManager.findElement("addressCountryDropdown", PAGE_NAME);
		addressCompanyInput = PageDataManager.findElement("addressCompanyInput", PAGE_NAME);
		addressMobilePhoneInput = PageDataManager.findElement("addressMobilePhoneInput", PAGE_NAME);
		addressNameInput = PageDataManager.findElement("addressNameInput", PAGE_NAME);
		addressPhoneInput = PageDataManager.findElement("addressPhoneInput", PAGE_NAME);
		addressPostcodeInput = PageDataManager.findElement("addressPostcodeInput", PAGE_NAME);
		addressStateDropdown = PageDataManager.findElement("addressStateDropdown", PAGE_NAME);
		daysDropdown = PageDataManager.findElement("daysDropdown", PAGE_NAME);
		firstNameInput = PageDataManager.findElement("firstNameInput", PAGE_NAME);
		monthsDropdown = PageDataManager.findElement("monthsDropdown", PAGE_NAME);
		mrRadioBtn = PageDataManager.findElement("mrRadioBtn", PAGE_NAME);
		mrsRadioBtn = PageDataManager.findElement("mrsRadioBtn", PAGE_NAME);
		passwordInput = PageDataManager.findElement("passwordInput", PAGE_NAME);
		registerAccountBtn = PageDataManager.findElement("registerAccountBtn", PAGE_NAME);
		surnameInput = PageDataManager.findElement("surnameInput", PAGE_NAME);
		yearsDropdown = PageDataManager.findElement("yearsDropdown", PAGE_NAME);
	}
}
