package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import utiles.ReadConfiguration;

public class BaseClass {
	
	ReadConfiguration config = new ReadConfiguration();
	
	String url = config.Applicationurl();
	
	String username = config.getusername();
	
	String Pwd = config.getpassword();
	
	WebDriver driver;
	
	
	@Parameters("browser")
	@BeforeClass()
	
	public void setup(String br) {
		
		if(br.equals("chrome")) {

			driver = WebDriverManager.chromedriver().create();
			
//			driver = new ChromeDriver();
			
			driver.get(url);
		}
		
		if(br.equals("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			
			driver = new FirefoxDriver();
			
			driver.get(url);
		}
		
		if(br.equals("IE")) {

			WebDriverManager.edgedriver().setup();
			
			driver = new EdgeDriver();
			
			driver.get(url);
		}
		
		
	}
	
	@AfterClass()
	
	public void teardown() {
		
		driver.quit();
	}
	
	

}
