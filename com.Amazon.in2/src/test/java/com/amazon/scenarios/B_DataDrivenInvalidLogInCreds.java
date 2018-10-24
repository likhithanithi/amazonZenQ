package com.amazon.scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.amazon.actions.BaseActionsClass;
import com.amazon.actions.UtilityClass;

public class B_DataDrivenInvalidLogInCreds {
	
	
	public static By SignIn = By.xpath("//*[@id=\"nav-link-yourAccount\"]");
    public static By UserName = By.xpath("//input[@type=\"email\"]");
	public static By ContinueButton = By.className("a-button-input");
    public static By PassWord = By.xpath("//input[@type=\"password\"]");
	public static By LogInButton = By.id("signInSubmit");
		

	public static WebDriver driver;
	
	
	
	//Action to Validate Login with multiple data	
			@DataProvider
			public static Object[][] TestData(){	
						Object[][] data = new Object[3][2]; 
						
						data[0][0] = "test1@gmail.com";
						data[0][1] = "test1@gmail";
						
						data[1][0] = "test1@gmail.com";
						data[1][1] = "test1@gmail";
						
						data[2][0] = "test1@gmail.com";
						data[2][1] = "test1@gmail";
						
											
						
						
						return data;
			
			
			}
	
	
	
	//To LaunchBrowser	
			
			@Test(dataProvider = "TestData")
			public static void LaunchBrowser(String Uname, String Pwd) 
			{
				System.setProperty("webdriver.chrome.driver", "C://Users//vardhan//eclipse-workspace//com.ws.project//libs//chromedriver.exe");
				driver = new ChromeDriver();
			
		
		
	//TO LaunchUrl		
							
				driver.manage().deleteAllCookies();
				driver.get("https://www.amazon.in/");
				driver.manage().window().maximize();	
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
			
			
			
	//data-driven block	
				driver.findElement(SignIn).click();	
				driver.findElement(UserName).sendKeys(Uname);
				driver.findElement(ContinueButton).click();
				driver.findElement(PassWord).sendKeys(Pwd);	
				driver.findElement(LogInButton).click();
				driver.quit();
			
		
		
			}
	
	
}