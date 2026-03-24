package selenium_Concepts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebdriverBasics {

	
	//1. Open the browser
	//2. launch URL
	//3. verify title of the page
	//4. verify current page URL
	//5. close the browser
	
	
	
	public static void main(String[] args) {
		
		//launch the browser
		//ChromeDriver driver= new ChromeDriver();
		
		//FirefoxDriver driver= new FirefoxDriver();
		
		//EdgeDriver driver= new EdgeDriver();
		
		SafariDriver driver= new SafariDriver();
		
		//eneter the url
		driver.get("https://demowebshop.tricentis.com/");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		//validation
		if(title.equals("Demo Web Shop")) {
			System.out.println("Title is correct : pass");
		}else {
			System.out.println("Incorrect title: fail");
		}
		
		String currentURL=driver.getCurrentUrl();
		System.out.println(currentURL);
		
		// to close the browser
		driver.quit();

	}

}
