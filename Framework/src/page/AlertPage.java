package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class AlertPage extends Baselibrary {
	public AlertPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='×']")
	private WebElement close;

	@FindBy(xpath = "//a[text()='Practice']")
	private WebElement practice;

	@FindBy(xpath = "//button[@data-target='#alerts']")
	private WebElement alfrwd;

	@FindBy(xpath = "//a[text()='alerts']")
	private WebElement alerts;

	@FindBy(xpath = "//button[@onclick=\"myalert()\"]")
	private WebElement clickme;

	@FindBy(xpath = "//button[@onclick=\"aftersec5()\"]")
	private WebElement clickafter5sec;
	
	@FindBy(xpath="//button[@onclick=\"myconfirm()\"]")
	private WebElement confirmbutton;
	
	@FindBy(xpath="//button[@onclick=\"myprompt()\"]")
	private WebElement promptbutton;
	
	public void close() {
		close.click();
	}

	public void practice() {
		practice.click();
	}

	public void alfrwd() {
		alfrwd.click();
	}

	public void alerts() {
		alerts.click();
	}

	public void clickmebutton() {
		clickme.click();
		driver.switchTo().alert().accept();
	}

	public void clickmebuttonafter5sec() {

		clickafter5sec.click();
		waitforalert();
		driver.switchTo().alert().accept();

	}
	public void clickonconfirmbutton() {
		confirmbutton.click();
		driver.switchTo().alert().dismiss();
	}
	
	public void clickonprompt()
	{
		promptbutton.click();
		driver.switchTo().alert().sendKeys("hello");
		driver.switchTo().alert().accept();
	
	}
	
}
