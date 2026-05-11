package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.seleniumown.Selpractise.commonUtils.commonClass;

public class Login {
	private WebDriver driver;
	public Login(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(id = "userEmail")
	private WebElement emaillocator;
	
	@FindBy(id="userPassword")
	private WebElement passwordlocator;
	
	@FindBy(id="login")
	private WebElement login;
	
	public void loginPage(String email,String password) {
		commonClass.visiblityOfElement(emaillocator);
		emaillocator.sendKeys(email);
		commonClass.visiblityOfElement(passwordlocator);
		passwordlocator.sendKeys(password);
		commonClass.visiblityOfElement(login);
		login.click();
	}
	
	

}
