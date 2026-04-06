package selenium_Concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		driver= new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(5000);
		
		List<WebElement>linksList= driver.findElements(By.tagName("a"));
		
		System.out.println(linksList.size());
		
		//index loop
//		for (int i = 0; i < linksList.size(); i++) {
//			String text=linksList.get(i).getText();
//			if(text.length()!=0) {
//				System.out.println(text);
//			}
//		}
		
		for(WebElement e:linksList) {
			String text=e.getText();
			if(text.length()!=0) {
				System.out.println(text);
			}
		}

	}

}
