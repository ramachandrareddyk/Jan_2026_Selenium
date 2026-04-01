package selenium_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	
	private WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		this.driver=driver;
	}
	
	public void doSendKeys(By Locater, String Value) {
		getWebElement(Locater).sendKeys(Value);
	}
	
	public WebElement getWebElement(By Locater) {
		return driver.findElement(Locater);
	}

	public String getElementDomAttributeValue(By locater, String attName) {
		return getWebElement(locater).getDomAttribute(attName);
	}
	
	public String getElementDomPropertyValue(By locater, String propName) {
		return getWebElement(locater).getDomProperty(propName);
	}

	public boolean doIsElementDisplayed(By Locater) {
		return getWebElement(Locater).isDisplayed();
	}
	
	public String doGetText(By Locater) {
		return getWebElement(Locater).getText();
	}




}
