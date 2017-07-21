package application;

import org.junit.Test;

import application.common.TestCase;

public class DressesPageTests extends TestCase
{
	@Test
	public void navigateToDressesAndSelectSubcategory()
	{
		WebApplication.header.navigateToDressesPage();
	}
}
