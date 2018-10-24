package com.amazon.scenarios;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.amazon.actions.*;



public class D_ValidateDropDown {

	
//To LaunchBrowser	
		@Parameters({"Browser"})	
		@Test
		public static void LaunchBrowser(String Browser) 
		{
			UtilityClass.LaunchBrowser(Browser);
		}


//To LaunchUrl
		@Test(priority = 0)
		public static void LaunchUrl()
		{
			BaseActionsClass.Properties();
			BaseActionsClass.LaunchUrl();
		}


//To Select item by DropDown		
		@Test(priority = 1)
		public static void DropDown() 
		{
			DropDownAndSelect.DropDown();
		}


		
//To Quit
		@Test(dependsOnMethods = "DropDown")
		public static void QuitBrowser()
		{
			BaseActionsClass.quit();
		}
		
		


}
