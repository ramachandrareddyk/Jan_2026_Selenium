package selenium_Concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {
	
	private WebDriver driver;
	
	public WebDriver initDriver(String browserName) {
		
		System.out.println("The browser name is :"+browserName);
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver= new ChromeDriver();
			break;
		case "firefox":
			driver= new FirefoxDriver();
			break;
		case "edge":
			driver= new EdgeDriver();
			break;
		case "safari":
			driver= new SafariDriver();
			break;
		default:
			System.out.println("Please pass the right browser name..."+browserName);
			throw new BrowserExceptions("=====INVALID BROWSER=====");
			//break;
		}
		return driver;
	}
	
	public void launchURL(String URL) {
		driver.get(URL);
	}
	
	public void navigateTOURL(String URL) {
		driver.navigate().to(URL);
	}
	
	public String getpageTitle() {
		return driver.getTitle();
	}
	
	public String getCurrentPageURL() {
		return driver.getCurrentUrl();
	}
	
	public String getCurrentPageSource() {
		return driver.getPageSource();
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
	
	

}
