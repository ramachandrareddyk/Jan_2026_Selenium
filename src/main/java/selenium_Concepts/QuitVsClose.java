package selenium_Concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {
	
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//driver.close();//close method will close only the browser, it's not going to close session id
		
		driver.quit();//quit method is going to close browser and session id as well
		
		System.out.println(driver.getTitle());//org.openqa.selenium.NoSuchSessionException
		

	}

}
