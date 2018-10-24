package com.amazon.actions;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class UtilityClass
{

	public static WebDriver driver;
	
//Action to select and launch browser
		@Test
		public static void LaunchBrowser(String Browser)
		{
			if (Browser.equalsIgnoreCase("Chrome"))
			{
			System.setProperty("webdriver.chrome.driver", "C://Users//vardhan//eclipse-workspace//com.ws.project//libs//chromedriver.exe");
			driver = new ChromeDriver();
			}

				else if (Browser.equalsIgnoreCase("FireFox"))
				{
					System.setProperty("webdriver.gecko.driver", "C://Users//vardhan//eclipse-workspace//com.makemytrip//libs//geckodriver.exe");
					driver = new FirefoxDriver();	
				}
		
		
		 }


//To Quit Browser
			@Test
			public static void quit()
				{
					driver.quit();	
				}
	
}
