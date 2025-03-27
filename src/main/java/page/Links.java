package page;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Links extends BasePage {

	@FindBy(xpath = "(//span[contains(text(),'Links')])[(1)]")
	WebElement linkFiedModule;
	// (//span[contains(text(),'Text Box')])

	@FindBy(css = "#simpleLink")
	WebElement home;

	@FindBy(css = "#created")
	WebElement created;

	@FindBy(css = "#linkResponse")
	WebElement linkReponse;

	@FindBy(xpath = "(//a[contains(text(),'No Content')])")
	WebElement noContent;

	@FindBy(css = "#moved")
	WebElement moved;

	@FindBy(css = "#bad-request")
	WebElement badRequest;

	@FindBy(css = "#unauthorized")
	WebElement unAuthorized;

	@FindBy(css = "#forbidden")
	WebElement forbidden;

	@FindBy(css = "#invalid-url")
	WebElement notFound;

	public Links(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void linksPage() {
		linkFiedModule.click();
		home.click();
		//ArrayList<String> a = new ArrayList<String>(driver.getWindowHandles());
		ArrayList<String> a = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(a.get(1));
		// System.out.println(currenturl());
		if (currenturl().equalsIgnoreCase("https://demoqa.com/")) {
			System.out.println("url is correct: " + currenturl());

		} else {
			System.out.println("url is incorrect: " + currenturl());
		}
		// Assert.assertEquals(sp, "https://demoqa.com/");
		driver.close();
		driver.switchTo().window(a.get(0));
		if (currenturl().equalsIgnoreCase("https://demoqa.com/links")) {
			System.out.println("url is correct: " + currenturl());

		} else {
			System.out.println("url is wrong: " + currenturl());
		}

		// System.out.println(currenturl());
		created.click();
		scrolldown();
		String lR = linkReponse.getText();
		//System.out.println(lR);
		Assert.assertEquals(lR, "Link has responded with staus 201 and status text Created");
		noContent.click();
		explicitWait(By.xpath("(//b[contains(text(),'No Content')])"));
		String lR1 = linkReponse.getText();
		//System.out.println(lR1);
		Assert.assertEquals(lR1, "Link has responded with staus 204 and status text No Content");
		moved.click();
		explicitWait(By.xpath("(//b[contains(text(),'Moved Permanently')])"));
		String lR2 = linkReponse.getText();
		Assert.assertEquals(lR2, "Link has responded with staus 301 and status text Moved Permanently");
		badRequest.click();
		explicitWait(By.xpath("(//b[contains(text(),'Bad Request')])"));
		String lR3 = linkReponse.getText();
		Assert.assertEquals(lR3, "Link has responded with staus 400 and status text Bad Request");
		unAuthorized.click();
		explicitWait(By.xpath("(//b[contains(text(),'Unauthorized')])"));
		String lR4 = linkReponse.getText();
		Assert.assertEquals(lR4, "Link has responded with staus 401 and status text Unauthorized");
		forbidden.click();
		explicitWait(By.xpath("(//b[contains(text(),'Forbidden')])"));
		String lR5 = linkReponse.getText();
		Assert.assertEquals(lR5, "Link has responded with staus 403 and status text Forbidden");
		notFound.click();
		explicitWait(By.xpath("(//b[contains(text(),'Not Found')])"));
		String lR6 = linkReponse.getText();
		Assert.assertEquals(lR6, "Link has responded with staus 404 and status text Not Found");

	}

}
