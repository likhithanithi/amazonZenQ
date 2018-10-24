package com.amazon.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.testng.annotations.Test;

public class MouseHoverAction extends UtilityClass {

	
//Action for MouseHover 	
		@Test
		public static void MouseHover() 
		{
			Actions action  = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-link-wishlist\"]/span[2]/span"))).perform();
			action.sendKeys(Keys.ESCAPE).perform();
		
		}
	
}
