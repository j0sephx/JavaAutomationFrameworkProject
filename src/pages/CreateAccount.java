package pages;

import application.ElementInfo;
import utilities.WebDriverHelper;

public class CreateAccount 
{
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
		addressAdditionalInformation = new ElementInfo("addressAdditionalInformation","id","other");
		addressFirstNameInput = new ElementInfo("addressFirstNameInput","id","firstname");
		addressLineOneInput = new ElementInfo("addressLineOneInput","id","address1");
		addressLineTwoInput = new ElementInfo("addressLineTwoInput","id","address2");
		addressSurnameInput = new ElementInfo("addressSurnameInput","id","lastname");
		addressCityInput	= new ElementInfo("addressCityInput","id","city");
		addressCountryDropdown = new ElementInfo("addressCountryDropdown","id","id_country");
		addressCompanyInput = new ElementInfo("addressCompanyInput","id","company");
		addressMobilePhoneInput = new ElementInfo("addressMobilePhoneInput","id","phone_mobile");
		addressNameInput = new ElementInfo("addressNameInput","id","alias");
		addressPhoneInput = new ElementInfo("addressPhoneInput","id","phone");
		addressPostcodeInput = new ElementInfo("addressPostcodeInput","id","postcode");
		addressStateDropdown = new ElementInfo("addressStateDropdown","id","id_state");
		daysDropdown = new ElementInfo("daysDropdown","id","days");
		firstNameInput = new ElementInfo("firstNameInput","id","customer_firstname");
		monthsDropdown = new ElementInfo("monthsDropdown","id","months");
		mrRadioBtn = new ElementInfo("mrRadioBtn","xpath","//input[@id='id_gender1']");
		mrsRadioBtn = new ElementInfo("mrsRadioBtn","xpath","//input[@id='id_gender2']");
		passwordInput = new ElementInfo("passwordInput","xpath","//input[@id='passwd']");
		registerAccountBtn = new ElementInfo("registerAccountBtn","id","submitAccount");
		surnameInput = new ElementInfo("surnameInput","id","customer_lastname");
		yearsDropdown = new ElementInfo("yearsDropdown","id","years");
	}
}
