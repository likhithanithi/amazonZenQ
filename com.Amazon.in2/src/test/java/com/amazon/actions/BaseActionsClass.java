package com.amazon.actions;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class BaseActionsClass extends UtilityClass {

  
//WebElements for login action	
	public static By SignIn = By.xpath("//*[@id=\"nav-link-yourAccount\"]");
    public static By UserName = By.xpath("//input[@type=\"email\"]");
	public static By ContinueButton = By.className("a-button-input");
    public static By PassWord = By.xpath("//input[@type=\"password\"]");
	public static By LogInButton = By.id("signInSubmit");
	
	
//To call property file name prop.properties	
	public static Properties prop;
	public static FileReader filereader;
	public static File file;
	
	
//try catch	block to handle exception
		@Test
		public static void Properties() 

		{
			try{
				prop = new Properties();
				file = new File("C:\\Users\\vardhan\\eclipse-workspace\\com.makemytrip\\prop.properties");
				filereader = new FileReader(file);
				prop.load(filereader);
				
			   }
		
		
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			
			}
		}

	
//Action to launch url	
		@Test
		public static void LaunchUrl()
		{
			driver.manage().deleteAllCookies();
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();	
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		
		}
	
	
//Action for login 	
		@Test
		public static void Login() 
		{
			driver.findElement(SignIn).click();	
			driver.findElement(UserName).sendKeys(prop.getProperty("UserName"));	
			driver.findElement(ContinueButton).click();
			driver.findElement(PassWord).sendKeys(prop.getProperty("PassWord"));	
			driver.findElement(LogInButton).click();
			//driver.findElement(SignIn).click();	
		}
	
	



//Action for login 	
		@Test
		public static void LoginforDD(String Uname, String Pwd) {
			driver.findElement(SignIn).click();	
			driver.findElement(UserName).sendKeys(Uname);
			driver.findElement(ContinueButton).click();
			driver.findElement(PassWord).sendKeys(Pwd);	
			driver.findElement(LogInButton).click();
			driver.findElement(SignIn).click();	
		}
	
	
}






