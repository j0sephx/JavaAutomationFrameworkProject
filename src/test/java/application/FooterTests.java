package application;

import org.junit.Test;

import application.common.TestCase;

public class FooterTests extends TestCase 
{

	@Test
	public void navigateToFooterAndClickInformationLinks()
	{
		WebApplication.footer.clickInformationSectionLink(WebApplication.footer.informationSectionLinks, "Specials");
		WebApplication.footer.clickInformationSectionLink(WebApplication.footer.informationSectionLinks, "New products");
		WebApplication.footer.clickInformationSectionLink(WebApplication.footer.informationSectionLinks, "Best sellers");
		WebApplication.footer.clickInformationSectionLink(WebApplication.footer.informationSectionLinks, "Our stores");
	}
	
	
	
	
}
