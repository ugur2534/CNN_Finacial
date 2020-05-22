package com.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Highlighter1 {
	
	
	public static void highligt(WebDriver driver,WebElement element, String color) {
		
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		//jse.executeScript("arguments[0].style.border='3px solid red'",element );
		jse.executeScript("arguments[0].style.border='3px solid "+color+"'", element);
	}

}
