package selenium_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementClick {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		
		By BooksLink=By.linkText("Books");
		By computerLink=By.linkText("Computers");
		
		doClick(BooksLink);
		
		doClick(computerLink);
	}
	
	
	public static void doClick(By Locater) {
		getWebElement(Locater).click();
	}
	
	public static WebElement getWebElement(By locater) {
		return driver.findElement(locater);
	}

}
