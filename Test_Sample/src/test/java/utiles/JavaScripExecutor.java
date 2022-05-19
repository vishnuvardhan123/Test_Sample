package utiles;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScripExecutor {
	
	public void clickelement(WebDriver driver, WebElement element) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", element);
		
	}
	
	public void javahighlitingelement(WebDriver driver, WebElement element) {
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;  
		
		jsExecutor.executeScript("arguments[0].style.border='2px solid red'",element);
	}

}
