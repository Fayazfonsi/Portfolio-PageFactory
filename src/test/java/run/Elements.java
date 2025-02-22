package run;
import org.testng.annotations.Test;

import page.Buttonn;
import page.CheckBox;
import page.RadioButton;
import page.TextBox;
import page.WebTable;
import org.testng.annotations.BeforeSuite;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import utilities.DriverManager;

public class Elements {

	private WebDriver driver;
	private TextBox textBox;
	private CheckBox checkBox;
	private RadioButton radioButton;
	private WebTable webTable;
	private Buttonn buttonn;
	

	@Test(priority = 0)
	public void textBoxM() {
		textBox.navigateTo("https://demoqa.com/elements");
		textBox.implicitWait();
		textBox.maximize();

	}
	
	
	@Test(priority = 1, dataProvider = "details")
	public void textBoxPagee(String fname, String femail, String cAdd, String pAdd)  {
		textBox.textBoxPag(fname, femail, cAdd, pAdd);
	}
	

	@Test(priority = 2)

	public void checkBoxM() {
		checkBox.checkBoxPage();

	}

	@Test(priority = 3)
	public void radioButtonM() {
		radioButton.radiobuttonPage();

	}

	@Test(priority = 4)
	public void webTableM() {
		webTable.webTablePage();

	}

	@Test(priority = 5)
	public void buttonM() {
		buttonn.buttonPage();

	}

	@BeforeSuite
	public void setUp() {
//		System.setProperty("webdriver.chrome.driver",
//				"D:\\chrome driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		driver = DriverManager.getDriver();
		
		textBox = new TextBox(driver);
		checkBox = new CheckBox(driver);
		radioButton = new RadioButton(driver);
		webTable = new WebTable(driver);
		buttonn = new Buttonn(driver);

	}

	@AfterSuite
	public void tearDown() {
		DriverManager.quitDriver();
		
		
		}

	

}
