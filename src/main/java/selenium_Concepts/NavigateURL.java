package selenium_Concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateURL {

	static WebDriver driver;
	
	public static void main(String[] args) {
//		WebDriver driver= new ChromeDriver();
//		driver.get("https://www.flipkart.com");
//		
//		WebDriver driver1= new ChromeDriver();
//		driver1.get("https://www.amazon.com");
//		
//		WebDriver driver2= new FirefoxDriver();
//		driver2.get("https://www.myntra.com");
//		
//		driver2.quit();
		
		
		driver= new ChromeDriver();//session id
		driver.get("https://www.flipkart.com");
		
		driver= new ChromeDriver();//session id
		driver.get("https://www.amazon.com");
		
		driver= new FirefoxDriver();//session id 
		driver.get("https://www.myntra.com");
		
		driver.quit();
		
		

	}

}
