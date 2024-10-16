package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class ModelDialoguePage extends Baselibrary{
	public ModelDialoguePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='×']")
	private WebElement close;

	@FindBy(xpath = "//a[text()='Practice']")
	private WebElement practice;

	@FindBy(xpath = "//button[@data-target='#alerts']")
	private WebElement alfrwd;

	@FindBy(xpath="//a[text()='modal dialogs']")
	private WebElement modia;
	
	@FindBy(xpath="//div[@id=\"exampleModal1\"]//div//button[@type=\"button\" and @class=\"btn btn-primary\"]")
	private WebElement largebutton;
	
	
	public void close() {
		close.click();
	}

	public void practice() {
		practice.click();
	}

	public void alfrwd() {
		alfrwd.click();
	}
	
	public void modeldialogue() {
		waitforClick(modia);
		modia.click();
	}
	public void clickonlargebutton() {
		largebutton.click();
	}
	
}
