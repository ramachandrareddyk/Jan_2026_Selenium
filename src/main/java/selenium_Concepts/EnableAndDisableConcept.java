package selenium_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableAndDisableConcept {


	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		WebElement fname= driver.findElement(By.id("fname"));
		WebElement pass= driver.findElement(By.id("pass"));
		
		boolean a= fname.isEnabled();
		System.out.println(a);
		
		boolean b= pass.isEnabled();
		System.out.println(b);
		
		fname.sendKeys("Testing");
		
		//pass.sendKeys("Test@123");//ElementNotInteractableException: element not interactable
		
		pass.click();//click on disable elements :it won't give any exception

	}

}
