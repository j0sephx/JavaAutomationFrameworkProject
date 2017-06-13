package tests.common;

import org.junit.After;
import org.junit.Before;

import application.WebApplication;
import pageUtilities.PageDataManager;
import utilities.WebDriverHelper;

public class TestCase
{
	@Before
	public void testSetup()
	{
		PageDataManager.loadAllPagesForProject(System.getProperty("user.dir") + "\\resources\\pageData");
		WebApplication.buildPages();
		WebDriverHelper.createDriver("CHROME");
		WebDriverHelper.getURL("http://automationpractice.com/index.php");
	}
	
	@After
	public void testTeardown()
	{
		WebDriverHelper.destroyWebdriver();
	}
}
