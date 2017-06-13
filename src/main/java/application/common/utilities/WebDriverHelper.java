package application.common.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import application.ElementInfo;

public class WebDriverHelper 
{
	private static final String CHROME_PATH = System.getProperty("user.dir") + "//drivers//chromedriver.exe";
	private static final String FIREFOX_PATH = System.getProperty("user.dir") + "//drivers//geckodriver.exe";
	private static final String IE_PATH = System.getProperty("user.dir") + "//drivers//IEDriverServer.exe";
	
	private static WebDriver driver; 
	
	
	public static void assertElementIsDisplayed(ElementInfo elementInfo) throws Exception
	{
		driver.findElement(elementInfo.getLocator()).isDisplayed();
	}
	
	public static void assertElementTextContains(ElementInfo elementInfo, String expectedText)
	{
		String elementText = driver.findElement(elementInfo.getLocator()).getText();		
		AssertionHelper.contains(elementText,(expectedText));	
	}	
	
	public static void assertElementTextEquals(ElementInfo elementInfo, String expectedText)
	{
		String actualText = getElementText(elementInfo);
		AssertionHelper.areEqual(actualText, expectedText);
	}
	
	public static void assertElementTextDoesNotEqual(ElementInfo elementInfo, String expectedText)
	{
		String actualText = getElementText(elementInfo);
		AssertionHelper.isNotEqual(actualText, expectedText);
	}
	
	public static void clearText(ElementInfo elementInfo)
	{
		driver.findElement(elementInfo.getLocator()).clear();
	}
	
	public static void click(ElementInfo elementInfo)
	{
		driver.findElement(elementInfo.getLocator()).click();
	}
	
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
	
	public static void deselectAllDropdownOptions(ElementInfo elementInfo)
	{
		WebElement mySelectElement = driver.findElement(elementInfo.getLocator());
		Select dropdown = new Select(mySelectElement);
		dropdown.deselectAll();
	}	
	
	public static void destroyWebdriver()
	{
		driver.quit();
	}
	
	public static void doubleClick(ElementInfo elementInfo)
	{
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(elementInfo.getLocator());
		action.doubleClick(element);
		action.build();
		action.perform();
	}
	
	public static int getElementCount(ElementInfo elementInfo)
	{
		return driver.findElements(elementInfo.getLocator()).size();
	}
	
	
	public static String getElementText(ElementInfo elementInfo)
	{
		return driver.findElement(elementInfo.getLocator()).getText();
	}
	
	public static void getElementAttribute(ElementInfo elementInfo, String attribute)
	{
	   WebElement element = driver.findElement(elementInfo.getLocator());
	   element.getAttribute(attribute);
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
	
	public static void getURL(String url)
	{
		driver.navigate().to(url);
	}
	
	public static void hoverOver(ElementInfo elementInfo)
	{
		WebElement menu =  driver.findElement(elementInfo.getLocator());
		
		Actions action = new Actions(driver);
		action.moveToElement(menu);		
		action.build();
		action.perform();
	}
	
	public static void inputText(ElementInfo elementInfo, String text)
	{
		driver.findElement(elementInfo.getLocator()).sendKeys(text);
	}
	
	public static Boolean isCheckboxSelected(ElementInfo elementInfo)
	{
		return driver.findElement(elementInfo.getLocator()).isSelected();
	}
	
	public static void selectFromDropdownIndex(ElementInfo elementInfo, int index)
	{
		Select dropdown = new Select(driver.findElement(elementInfo.getLocator()));
		dropdown.selectByIndex(index);
	}
	
	public static void selectFromDropdownText(ElementInfo elementInfo, String text)
	{
		Select dropdown = new Select(driver.findElement(elementInfo.getLocator()));
		dropdown.selectByVisibleText(text);
	}
	
	public static void selectFromDropdownValue(ElementInfo elementInfo, String value)
	{
		Select dropdown = new Select(driver.findElement(elementInfo.getLocator()));
		dropdown.selectByValue(value);
	}
	
	public static void sendKeysKeyByKey(ElementInfo elementInfo, String value)
	{
		WebElement element = driver.findElement(elementInfo.getLocator());
		element.clear();

		for (int i = 0; i < value.length(); i++)
		{
		    char c = value.charAt(i);
		    String s = new StringBuilder().append(c).toString();
		    element.sendKeys(s);
		}  
	}
	
	public static void switchIframe()
	{
		driver.switchTo().defaultContent();
	}
	
	public static void waitForElementToBeClickable(ElementInfo elementInfo)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(elementInfo.getLocator()));
	}
	
	public static void waitForElementToBeVisible(ElementInfo elementInfo)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(elementInfo.getLocator()));	
	}
	
	public static void waitUntilElementIsNotVisible(ElementInfo elementInfo)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(elementInfo.getLocator()));	
	}
	
}