package application.common.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class WebDriverHelper 
{
	private static final String CHROME_PATH = System.getProperty("user.dir") + "//drivers//chromedriver.exe";
	private static final String FIREFOX_PATH = System.getProperty("user.dir") + "//drivers//geckodriver.exe";
	private static final String IE_PATH = System.getProperty("user.dir") + "//drivers//IEDriverServer.exe";
	
	private static WebDriver driver; 
	
	public static void createDriver(String browserName)
	{
		if (browserName.equals("CHROME"))
		{		
			System.setProperty("webdriver.chrome.driver", CHROME_PATH);
			driver = new ChromeDriver();
		}
		else if (browserName.equals("FIREFOX"))
		{
			System.setProperty("webdriver.gecko.driver", FIREFOX_PATH);
			driver = new FirefoxDriver();
		}
		else if (browserName.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", IE_PATH);
			driver = new InternetExplorerDriver();		
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	public static void destroyWebdriver()
	{
		driver.quit();
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
	
	public static void getURL(String url)
	{
		driver.navigate().to(url);
	}
	
	public static void switchIframe()
	{
		driver.switchTo().defaultContent();
	}
	
	public static void takeScreenshot() throws IOException
	{
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		FileUtils.copyFile(scrFile, new File("C:\\NewWorkSpace\\Screenshots\\" + timeStamp +".png")); 
	}

}