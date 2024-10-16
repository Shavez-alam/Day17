package page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import baselibrary.Baselibrary;
import junit.framework.Assert;

public class TextBoxPage extends Baselibrary {
	public TextBoxPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='×']")
	private WebElement close;

	@FindBy(xpath = "//a[text()='Practice']")
	private WebElement practice;

	@FindBy(xpath = "//button[@data-target='#elements']")
	private WebElement elements;

	@FindBy(xpath = "//a[text()='text box']")
	private WebElement textbox;

	@FindBy(xpath = "//input[@id='fullname1']")
	private WebElement name;

	@FindBy(xpath = "//input[@id='fullemail1']")
	private WebElement email;

	@FindBy(xpath = "//textarea[@id='fulladdresh1']")
	private WebElement cadd;

	@FindBy(xpath = "//textarea[@id='paddresh1']")
	private WebElement padd;

	@FindBy(xpath = "//input[@onclick='return validateform()']")
	private WebElement submit;
	@FindBy(xpath = "//div[@class=\"col-md-6 mt-5\"]/label")
	private List<WebElement> list;

	public void close() {
		close.click();
	}

	public void practice() {
		practice.click();
	}

	public void elements() {
		elements.click();
	}

	public void textbox() {
		textbox.click();
	}

	public void detail() {
		name.sendKeys(getReadData(0, 1, 0));
		email.sendKeys(getReadData(0, 1, 1));
		cadd.sendKeys(getReadData(0, 1, 2));
		padd.sendKeys(getReadData(0, 1, 3));
		submit.click();
	}

	/*
	 * public void email() { email.sendKeys("shavezalam1627@gamil.com"); } public
	 * void cadd() { cadd.sendKeys("noida sector 52"); } public void padd() {
	 * padd.sendKeys("muzaffarnager, Uttar Pradesh");; } public void submit() {
	 * submit.click(); } }
	 */
	
	public void validate() {
		SoftAssert softassert= new SoftAssert();
				ArrayList<String> expected = new ArrayList<String>();
		ArrayList<String> actual = new ArrayList<String>();
		for (int i = 0; i < 3; i++) {
			expected.add(getReadData(0, 1, i));
			// System.out.println(expected.add(getReadDate(0, 1, i)));
		}
		expected.add("hello");
		
		for (int i = 1; i < list.size(); i = i + 2) {
			actual.add(list.get(i).getText());
			// System.out.println(actual.add(list.get(i).getText()));
		}
		for (int i = 0; i < expected.size(); i++) {
			Assert.assertEquals(actual.get(i), expected.get(i));
			//softassert.assertEquals(actual.get(i), expected.get(i));
			
		}
		System.out.println("softassert successfully");
		softassert.assertAll();
		
	}
}