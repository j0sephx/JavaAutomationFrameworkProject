package application.domain.pages;


import application.ElementInfo;


public class SignIn 
{
	public ElementInfo createEmail;
	public ElementInfo createAnAccountButton;
	public ElementInfo loginEmail;
	public ElementInfo enterPassword; 
	public ElementInfo loginButton;	
	
	public SignIn()
	{
		buildPage();
	}
	
	private void buildPage()	
	{
		createEmail  = new ElementInfo("createEmail","id","email_create");
		createAnAccountButton  = new ElementInfo("createAnAccountButton","id","SubmitCreate");
		loginEmail  = new ElementInfo("loginEmail","id","email");
		enterPassword  = new ElementInfo("enterPassword","id","passwd");
		loginButton  = new ElementInfo("loginButton","id","SubmitLogin");
	}	
}