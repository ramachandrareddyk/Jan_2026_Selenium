package selenium_Concepts;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

	public static void main(String[] args) {
	
		//1. CD=CD only chrome
		//valid but not recommended
		//ChromeDriver driver= new ChromeDriver();
		
		//2. WD d= new CD;
		//valid and recommend
		//only local execution
		//WebDriver driver= new ChromeDriver();
		
		//3. SC d= new CD
		//valid but not recommended 
		//SearchContext driver= new ChromeDriver();
		
		//4. WD d= new RWD();
		//valid and recommended for remote execution
		//execution with remote machine,AWS, cloud, grid
		//WebDriver driver= new RemoteWebDriver(remoteAddress, capabilities);//os/browser
		
		//5. SC d= new RMD();
		//valid not recommended
		//SearchContext driver= new RemoteWebDriver(remoteAddress, capabilities);//os/browser
		
		//6. RWD d= new CD;
		//local execution
		//valid and recommended
		//RemoteWebDriver driver= new ChromeDriver();
		
		//7. Chromium d= new CD();
		//local
		//works only for chrome and edge
		//ChromiumDriver driver= new ChromeDriver();
				//driver= new EdgeDriver();
				
				//driver= new FirefoxDriver();
		
		
			
		

	}

}
