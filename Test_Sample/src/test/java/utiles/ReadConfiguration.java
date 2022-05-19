package utiles;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfiguration {
	
	Properties prop;
	
	public ReadConfiguration(){
		
		try {
		
		FileInputStream fis = new FileInputStream("./Configuration/config.properties");
		
		prop = new Properties();
		
		prop.load(fis);
		
		}
		
		catch(Exception e){
			
			System.out.println("The thrown execption trace is " + e.getCause());
			System.out.println("The thrown execption is " + e);
		}


			
		}
	
		public String Applicationurl() {
			
			String url = prop.getProperty("baseurl");
			
			return url;
		}
		
		public String getusername() {
			
			String uname = prop.getProperty("username");
			
			return uname;
		}
		
		public String getpassword() {
			
			String pwd = prop.getProperty("password");
			
			return pwd;
		}
		
	
	

}
