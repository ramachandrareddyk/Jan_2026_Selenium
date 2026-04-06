package selenium_Concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TopMenuLinks {

	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver= new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(4000);
		
		List<WebElement>menuLinks= driver.findElements(By.xpath("//ul[@class='top-menu']/li/a"));
		
		System.out.println("Total menu links :"+menuLinks.size());
		
		for(WebElement e: menuLinks) {
			String text=e.getText();
			System.out.println(text);
			if(text.equals("ELECTRONICS")) {
				e.click();
			}
		}

	}

}
