package com.amazon.scenarios;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.amazon.actions.BaseActionsClass;
import com.amazon.actions.UtilityClass;

public class A_LaunchAmazon {

//To LaunchBrowser	
		@Parameters({"Browser"})	
		@Test
		public static void LaunchBrowser(String Browser)
		{
			UtilityClass.LaunchBrowser(Browser);
		}
	
	
//To LaunchUrl	
		@Test(dependsOnMethods = "LaunchBrowser")
		public static void LaunchUrl()
		{
			BaseActionsClass.Properties();
			BaseActionsClass.LaunchUrl();
		}
	
	
//To Quit	
		@Test(dependsOnMethods = "LaunchUrl")
		public static void QuitBrowser() 
		{
			BaseActionsClass.quit();
		}
		
 }
