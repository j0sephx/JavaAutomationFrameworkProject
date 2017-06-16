package application;

import org.junit.Test;

import application.common.TestCase;

public class FooterTests extends TestCase 
{

	@Test
	public void navigateToContactUsAndSendRequest()
	{
		WebApplication.footer.clickInformationSectionLink(WebApplication.footer.informationSectionLinks, "Specials");
	}
	
	
	
	
}
