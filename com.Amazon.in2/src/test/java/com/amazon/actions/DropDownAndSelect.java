package com.amazon.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownAndSelect extends UtilityClass {

		
//WebElement for DropDown and select items	
		public static By AllDropDown = By.xpath("//select[@id=\"searchDropdownBox\"]");
	
		
			@Test
			public static void DropDown()
			{
				WebElement dropdown = driver.findElement(AllDropDown);
				Select sel = new Select (dropdown);
				sel.selectByIndex(2);
			}
						 		
}
		
