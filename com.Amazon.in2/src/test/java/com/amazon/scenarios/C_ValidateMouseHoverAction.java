package com.amazon.scenarios;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.amazon.actions.BaseActionsClass;
import com.amazon.actions.MouseHoverAction;
import com.amazon.actions.UtilityClass;

public class C_ValidateMouseHoverAction {

	
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

//To MouseHover	
		@Test(priority = 1)
		public static void MouseHover()
		{
			MouseHoverAction.MouseHover();
		}
		
		
		
//To Quit
		@Test(dependsOnMethods = "MouseHover")
		public static void QuitBrowser() 
		{
			BaseActionsClass.quit();
		}
		
		
	
	






}
