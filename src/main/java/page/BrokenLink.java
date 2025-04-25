package page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrokenLink extends BasePage{

	public BrokenLink(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "(//span[contains(text(),'Broken Links - Images')])")
	WebElement brokenLinkImagePage;
	
	@FindBy(xpath = "(//a[contains(text(),'Click Here for Valid Link')])")
	WebElement validLink;
	
	@FindBy(xpath = "(//a[contains(text(),'Click Here for Broken Link')])")
	WebElement bl;
	
	@FindBy(xpath = "(//h3[contains(text(),'Status Codes')])")
	WebElement sc;
	
	public void brokenLinkPageM() {
		
		scrolldown();
		explicitWait(By.xpath("(//span[contains(text(),'Broken Links - Images')])"));
		brokenLinkImagePage.click();
		scrolldown();

		validLink.click();
		ArrayList<String> a = new ArrayList<String>(driver.getWindowHandles());
		explicitWait(By.xpath("(//h5[contains(text(),'Elements')])"));
		if (currenturl().equalsIgnoreCase("https://demoqa.com/")) {
			System.out.println("URL is working");
			
		}
		else {
			System.out.println("URL is not working");
		}
		
		backNavigation();
		bl.click();
		explicitWait(By.xpath("(//h3[contains(text(),'Status Codes')])"));
		if (currenturl().equalsIgnoreCase("https://demoqa.com/")) {
			System.out.println("url is working");
			
		}
		else {
			System.out.println("URL is not working");
		}
		
		backNavigation();
		explicitWait(By.xpath("(//span[contains(text(),'Broken Links - Images')])"));
		scrolldown();
		
		
		
	}
	

}
