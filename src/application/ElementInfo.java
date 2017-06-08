package application;

import org.openqa.selenium.By;

public class ElementInfo 
{
       private String name;
       private By locator;

       public ElementInfo(String name, String locatorType, String locatorText)
       {
            this.name = name;
            
            locator = buildLocator(locatorText , locatorType);
       }
       
       public String getName()
       {
    	   return name;
       }
       
       public By getLocator()
       {
    	   return locator;
       }

       public By buildLocator(String locatorText, String locatorType)
       {
    	   By locator = null;
    	   
    	   switch (locatorType)
    	   {
    	   		case "id":
					locator = By.id(locatorText);
					break;
    	   		case "name":
					locator = By.name(locatorText);
				    break;
 				case "cssSelector":
					locator = By.cssSelector(locatorText);
					break;                          
 				case "linkText":
					locator = By.linkText(locatorText);
					break;
 				case "partialLinkText":
	 				locator = By.partialLinkText(locatorText);
     				break;  
 				case "tagName":
	 				locator = By.tagName(locatorText);
	 				break;
 				case "xpath":
 					locator = By.xpath(locatorText);
 					break;
 				default:
 					throw new RuntimeException("Invalid Locator Type");
    	   }
  
    	   return locator;
       }
}