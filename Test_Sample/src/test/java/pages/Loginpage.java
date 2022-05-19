package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	WebDriver Idriver;
	
	public Loginpage(WebDriver rdriver) {
		
		Idriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(name="Email")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="Password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//button[text()='Log in']")
	@CacheLookup
	WebElement btnLogin;
	
	
	@FindBy(xpath="//a[text()='Logout']")
	@CacheLookup
	WebElement lnkLogout;
	
public void username(String string) {
	
	txtUserName.clear();
	txtUserName.sendKeys(string);
	
}

public void password(String string2) {
	
	txtPassword.clear();
	txtPassword.sendKeys(string2);
	
}

public void login() {
	
	btnLogin.click();
	
}
public void logout() {
	
	lnkLogout.click();
	
}
	

}
