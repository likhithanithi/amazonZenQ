package com.amazon.scenarios;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.amazon.actions.BaseActionsClass;
import com.amazon.actions.UtilityClass;

public class E_validateLogInwithValidCreds {

	
//To LaunchBrowser	
		@Parameters({"Browser"})	
		@Test(priority = 0)
		public static void LaunchBrowser(String Browser) 
		{
			UtilityClass.LaunchBrowser(Browser);
		}
	
	
//TO LaunchUrl		
		@Test(priority = 1)
		public static void LaunchUrl() 
		{
			BaseActionsClass.Properties();
			BaseActionsClass.LaunchUrl();
		}
		
		
//To Login		
		@Test(priority = 2)
		public static void LogIn() 
		{
			BaseActionsClass.Login();
		}
	
	
//TO Quit		
		@Test(priority = 3)
		public static void quit() 
		{
			BaseActionsClass.quit();
		}
	
	
	
	
	
	
}
