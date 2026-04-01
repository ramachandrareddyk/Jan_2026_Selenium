package selenium_Concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowser {
	
	static WebDriver driver;//null

	public static void main(String[] args) {
	
		String browser="edge";
		
		switch(browser.trim().toLowerCase()) {
		
		case "chrome":
			driver= new ChromeDriver();
			break;
		case "firefox":
			driver= new FirefoxDriver();
			break;
		case "safari":
			driver= new SafariDriver();
			break;
		case "edge":
			driver= new EdgeDriver();
			break;
			
		default:
			System.out.println("plz pass the coreect browser..."+browser);
			break;
		}
		
		driver.get("https://www.google.com");
		
		String title=driver.getTitle();
		System.out.println("Page title is : "+title);
		
		
		if(title.equals("Google")) {
			System.out.println("Title is correct : Pass");
		}else {
			System.out.println("Title is not correct : Fail");
		}
		
		driver.quit();
	}

}
