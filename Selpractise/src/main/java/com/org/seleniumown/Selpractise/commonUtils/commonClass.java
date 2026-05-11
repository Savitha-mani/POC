package com.org.seleniumown.Selpractise.commonUtils;

import java.awt.print.PageFormat;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public  class commonClass {
	private static WebDriver driver;
	static WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	public commonClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public static void visiblityOfElement(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	

}
