package selenium_Concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		driver= new ChromeDriver();
		
		driver.get("https://amazon.com/");
		
		Thread.sleep(5000);
		
		List<WebElement>imagesList= driver.findElements(By.tagName("img"));
		
		System.out.println(imagesList.size());
		
		for(WebElement e:imagesList) {
			String srcValue=e.getDomAttribute("src");
			
			System.out.println(srcValue);
		}

	}

}
