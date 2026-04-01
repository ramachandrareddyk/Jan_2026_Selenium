package selenium_Concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMaximize {

	public static void main(String[] args) {
		

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
//		
//		driver.manage().window().minimize();
		
//		driver.manage().window().fullscreen();
		
		driver.get("https://www.google.com");
	}

}
