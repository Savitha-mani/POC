package test;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sound.sampled.TargetDataLine;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.org.seleniumown.Selpractise.basePage.BaseClass;

import pageObjects.Login;
import pageObjects.configReader;

public class LoginTest extends BaseClass {
	
	@Test(dataProvider = "getdata")
	
	public void validLogin(Map<String, String> input) {
	String email=input.get("email");
	String password=input.get("password");
	Login login=gotoUrl();
	login.loginPage(email,password);	
	}
	
	@DataProvider
	public Object[][] getdata() throws FileNotFoundException {
		 List<Map<String, String>> map = configReader.readJson();
		 Object[][] data = new Object[map.size()][1];
		    for (int i = 0; i < map.size(); i++) {
		        data[i][0] = map.get(i);
		    }
		    return data;
	}

}
