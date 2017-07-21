package application;

import org.junit.Test;

import application.common.TestCase;

public class FooterTests extends TestCase 
{

	@Test
	public void navigateToFooterAndClickInformationLinks()
	{
		WebApplication.footer.clickInformationSectionLink("Specials");
		WebApplication.footer.clickInformationSectionLink("New products");
		WebApplication.footer.clickInformationSectionLink("Best sellers");
		WebApplication.footer.clickInformationSectionLink("Our stores");
		WebApplication.footer.clickInformationSectionLink("Contact us");
		WebApplication.footer.clickInformationSectionLink("Terms and conditions of use");
		WebApplication.footer.clickInformationSectionLink("About us");
		WebApplication.footer.clickInformationSectionLink("Sitemap");
	
	}
	
	@Test
	public void navigateToFooterClickMyAccountSectionLinks()
	{
		WebApplication.footer.clickMyAccountSectionLink("My orders");
		WebApplication.footer.clickMyAccountSectionLink("My credit slips");
		WebApplication.footer.clickMyAccountSectionLink("My addresses");
		WebApplication.footer.clickMyAccountSectionLink("Manage my personal information");
	}
	
}
