package application.common;

import org.junit.After;
import org.junit.Before;

import application.WebApplication;
import application.common.utilities.PageDataManager;
import application.common.utilities.WebDriverHelper;

public class TestCase
{
	@Before
	public void testSetup()
	{
		final String pageDataLocation= System.getProperty("user.dir") + "\\src\\main\\resources\\pageData";
		PageDataManager.loadAllPagesForProject(pageDataLocation);
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