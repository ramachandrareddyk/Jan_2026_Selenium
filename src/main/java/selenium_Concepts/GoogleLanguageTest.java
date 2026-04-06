package selenium_Concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguageTest {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver= new ChromeDriver();
		
		driver.get("https://google.com");
		
		Thread.sleep(4000);
		
		List<WebElement>langLinks= driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		
		System.out.println("Total number of elements are: "+langLinks.size());
		
		for(WebElement e: langLinks) {
			String text=e.getText();
			
			System.out.println(text);
			if(text.equals("मराठी")) {
				e.click();
				break;
			}
		}
		
		

	}

}
