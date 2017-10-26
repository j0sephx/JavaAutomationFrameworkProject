package application.common;


import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import application.WebApplication;
import application.common.utilities.PageDataManager;
import application.common.utilities.WebDriverHelper;

public class TestCase
{
	@BeforeMethod
	public void testSetup()
	{
		final String pageDataLocation= System.getProperty("user.dir") + "\\src\\main\\resources\\pageData";
		PageDataManager.loadAllPagesForProject(pageDataLocation);
		WebApplication.buildPages();
		WebDriverHelper.createDriver("CHROME");
		WebDriverHelper.getURL("http://automationpractice.com/index.php");
	}
	
	@AfterMethod
	public void testTeardown(ITestResult result) throws IOException
	{
		try
		{
			if(result.getStatus() == ITestResult.SUCCESS)
			{
				WebDriverHelper.destroyWebdriver();
				System.out.println("***** PASSED *****");
			}
			
			else if(result.getStatus() == ITestResult.FAILURE)
			{
				WebDriverHelper.takeScreenshot();
				WebDriverHelper.destroyWebdriver();
				System.out.println("***** FAILED *****");
			}	
			
			else if(result.getStatus() == ITestResult.SKIP)
			{
				WebDriverHelper.destroyWebdriver();
				System.out.println("***** SKIPPED *****");
			}
		}	
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	
	}