package utilities;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class AssertionHelper 
{
    public static void areEqual(String actual, String expected)
    {                              
    	assertThat(actual, is(equalTo(expected)));
    }     
    
    public static void isNotEqual(String actual, String expected)
    {                              
    	assertThat(actual, is(not(equalTo(expected))));
    }             
    
	public static void contains(String fullText, String expectedText)
    {                              
    	assertThat(fullText, containsString(expectedText));
    }
    
    public static void isFalse(Boolean value)
    {
    	assertThat(value, is(false));
    }
    
    public static void isTrue(Boolean value)
    {
    	assertThat(value, is(true));
    }
	
    public static void isLessThanOrEqualTo(Integer valueOne, Integer valueTwo)
    {
    	assertThat(valueOne, lessThanOrEqualTo(valueTwo));
    }
	
    public static void isGreaterThan(Integer valueOne, Integer valueTwo)
    {    	
    	assertThat(valueOne, greaterThan(valueTwo));
    }
    
    public static void isLessThan(Integer valueOne, Integer valueTwo)
    {    	
		assertThat(valueOne, lessThan(valueTwo));
    }
}
