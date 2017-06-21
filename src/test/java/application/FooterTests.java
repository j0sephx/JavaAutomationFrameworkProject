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
	}
	
}
