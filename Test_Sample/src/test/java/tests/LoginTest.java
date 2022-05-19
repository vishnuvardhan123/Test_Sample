package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.Loginpage;
import utiles.JavaScripExecutor;

public class LoginTest extends BaseClass{
	
	Loginpage lp;
	
	@Test
	public void login() throws InterruptedException {
		
		lp = new Loginpage(driver);
		
		lp.username(username);
		
		lp.password(Pwd);
		
		lp.login();
		
		WebElement element =driver.findElement(By.xpath("//*[@class='content-header']/h1"));
		
		JavaScripExecutor j = new JavaScripExecutor();
		
		j.javahighlitingelement(driver, element);
		
		Thread.sleep(1000);
		
		String title =  driver.getTitle();
		
		
		
		System.out.println(title);
		
		if(title.equalsIgnoreCase("Dashboard / nopCommerce administration")) {
			
			System.out.println("----Test Passed-------");
			
			
		}
		
		else {
			
			System.out.println("----Test Failed-------");
			
		}
		
	
		
		
	}

}
