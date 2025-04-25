package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UploadAndDownload extends BasePage {

	public UploadAndDownload(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "(//span[contains(text(),'Upload and Download')])")
	WebElement uPDL;
	
	@FindBy(css = "#downloadButton")
	WebElement download;
	
	@FindBy(css = "#uploadFile")
	WebElement selectFile;
	
	
	
	public void uploadAndDownload() {
		uPDL.click();
		download.click();
		
		String SelFile = "D:\\Selenium work files\\PortfolioPageFactory1\\upload file\\images (22).jpg";
		selectFile.sendKeys(SelFile);
		
		
	}

}
