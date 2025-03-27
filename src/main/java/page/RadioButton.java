package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class RadioButton extends BasePage {
	
	@FindBy(xpath = "//div[@class='left-pannel']//li[@id='item-2']")
	WebElement radioButtonMobule;
	
	@FindBy(xpath = "(//label)[1]")
	WebElement yes;
	
	@FindBy(xpath = "(//div)[61]")
	WebElement impressive;

	public RadioButton(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		
		
		
	}
	
	public void radiobuttonPage() {
		//scrollUp();
		radioButtonMobule.click();
		explicitWait(By.xpath("(//h1[contains(text(),'Radio Button')])"));
		yes.click();
		
//		String impressivee = impressive.getText();
//		System.out.println(impressivee);
		Assert.assertEquals(yes.getText(), "Yes");
		impressive.click();
		Assert.assertEquals(impressive.getText(), "Impressive");
		
		
	}

}
