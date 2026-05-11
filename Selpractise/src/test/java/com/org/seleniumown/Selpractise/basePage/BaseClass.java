package com.org.seleniumown.Selpractise.basePage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import pageObjects.Login;

public class BaseClass {
	
	public WebDriver driver;
	
	@BeforeMethod
	@Parameters("browser")
	public WebDriver browserInit(String browser) throws IOException {
		/*FileInputStream fis=new FileInputStream("C:\\Users\\savit\\eclipse-workspace\\Selpractise\\src\\test\\java\\com\\org\\seleniumown\\Selpractise\\data\\bdata.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String browser=prop.getProperty("browser");*/
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
	        driver = new FirefoxDriver();
	    } else if (browser.equalsIgnoreCase("edge")) {
	        driver = new EdgeDriver();
	    }
		return driver;
		
	}
	
	public Login gotoUrl() {
		driver.get("https://rahulshettyacademy.com/client/#/auth/login");
		Login login=new Login(driver);
		return login;
		
	}

}
