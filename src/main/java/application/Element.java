package application;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import application.common.utilities.AssertionHelper;
import application.common.utilities.PageDataManager;
import application.common.utilities.WebDriverHelper;

public class Element 
{
	private ElementInfo elementInfo;
	
	//Constructor that builds the element info object 
	public Element(String elementName, String pageName)
	{
		this.elementInfo = PageDataManager.findElement(elementName, pageName);
	}

	public void assertElementIsDisplayed() throws Exception
	{
		WebDriverHelper.getDriver().findElement(elementInfo.getLocator()).isDisplayed();
	}
	
	public void assertElementTextContains(String expectedText)
	{
		String elementText = WebDriverHelper.getDriver().findElement(elementInfo.getLocator()).getText();		
		AssertionHelper.contains(elementText,(expectedText));	
	}	
	
	public void assertElementTextEquals(String expectedText)
	{
		String actualText = getElementText();
		AssertionHelper.areEqual(actualText, expectedText);
	}
	
	public void assertElementTextDoesNotEqual(String expectedText)
	{
		String actualText = getElementText();
		AssertionHelper.isNotEqual(actualText, expectedText);
	}
	
	public void clearText()
	{
		WebDriverHelper.getDriver().findElement(elementInfo.getLocator()).clear();
	}
	
	public void click()
	{
		WebDriverHelper.getDriver().findElement(elementInfo.getLocator()).click();
	}
	
	public void click(ElementInfo elementInfo)
	{
		WebDriverHelper.getDriver().findElement(elementInfo.getLocator()).click();
	}
	
	public void deselectAllDropdownOptions()
	{
		WebElement mySelectElement = WebDriverHelper.getDriver().findElement(elementInfo.getLocator());
		Select dropdown = new Select(mySelectElement);
		dropdown.deselectAll();
	}	
	
	public void doubleClick()
	{
		Actions action = new Actions(WebDriverHelper.getDriver());
		WebElement element = WebDriverHelper.getDriver().findElement(elementInfo.getLocator());
		action.doubleClick(element);
		action.build();
		action.perform();
	}
	
	public int getElementCount()
	{
		return WebDriverHelper.getDriver().findElements(elementInfo.getLocator()).size();
	}
	
	public String getElementText()
	{
		return WebDriverHelper.getDriver().findElement(elementInfo.getLocator()).getText();
	}
	
	public void getElementAttribute(String attribute)
	{
	   WebElement element = WebDriverHelper.getDriver().findElement(elementInfo.getLocator());
	   element.getAttribute(attribute);
	}
	
	public void hoverOver(ElementInfo elementInfo)
	{
		WebElement menu =  WebDriverHelper.getDriver().findElement(elementInfo.getLocator());
		
		Actions action = new Actions(WebDriverHelper.getDriver());
		action.moveToElement(menu);		
		action.build();
		action.perform();
	}
	
	public void inputText(String text)
	{
		WebDriverHelper.getDriver().findElement(elementInfo.getLocator()).sendKeys(text);
	}
	
	public Boolean isCheckboxSelected()
	{
		return WebDriverHelper.getDriver().findElement(elementInfo.getLocator()).isSelected();
	}
	
	public void selectFromDropdownIndex(int index)
	{
		Select dropdown = new Select(WebDriverHelper.getDriver().findElement(elementInfo.getLocator()));
		dropdown.selectByIndex(index);
	}
	
	public void selectFromDropdownText(String text)
	{
		Select dropdown = new Select(WebDriverHelper.getDriver().findElement(elementInfo.getLocator()));
		dropdown.selectByVisibleText(text);
	}
	
	public void selectFromDropdownValue(String value)
	{
		Select dropdown = new Select(WebDriverHelper.getDriver().findElement(elementInfo.getLocator()));
		dropdown.selectByValue(value);
	}
	
	public void sendKeysKeyByKey(String value)
	{
		WebElement element = WebDriverHelper.getDriver().findElement(elementInfo.getLocator());
		element.clear();

		for (int i = 0; i < value.length(); i++)
		{
		    char c = value.charAt(i);
		    String s = new StringBuilder().append(c).toString();
		    element.sendKeys(s);
		}  
	}
	
	public void waitForElementToBeClickable()
	{
		WebDriverWait wait = new WebDriverWait(WebDriverHelper.getDriver(), 10);
		wait.until(ExpectedConditions.elementToBeClickable(elementInfo.getLocator()));
	}
	
	public void waitForElementToBeVisible()
	{
		WebDriverWait wait = new WebDriverWait(WebDriverHelper.getDriver(), 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(elementInfo.getLocator()));	
	}
	
	public void waitUntilElementIsNotVisible()
	{
		WebDriverWait wait = new WebDriverWait(WebDriverHelper.getDriver(), 10);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(elementInfo.getLocator()));	
	}
	
}