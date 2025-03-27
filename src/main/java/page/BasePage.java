package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	protected WebDriver driver;
	protected JavascriptExecutor js,js1;
	protected WebDriverWait wait;
	
	
	public BasePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void navigateTo(String url) {
		driver.get(url);
	}
	
	public String currenturl() {
		return driver.getCurrentUrl();
		
	}
	
	public void maximize() {
		driver.manage().window().maximize();
	}
	
	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void explicitWait(By locator) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));		
	}
	
	public void scrolldown() {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");		
	}
	
	public void scrollUp() {
		js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,-500)");
	}
	
	public void backNavigation() {
		driver.navigate().back();
	}
	
	
	

}
