package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class Buttons extends Baselibrary {
	public Buttons() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='×']")
	private WebElement close;

	@FindBy(xpath = "//a[text()='Practice']")
	private WebElement practice;

	@FindBy(xpath = "//button[@data-target='#elements']")
	private WebElement elements;

	@FindBy(xpath = "//a[text()='buttons']")
	private WebElement button;

	@FindBy(xpath = "//button[@ondblclick='doubletext()']")
	private WebElement dobubleclickbutton;

	@FindBy(xpath = "//button[@id='noContextMenu']")
	private WebElement rightclickbutton;

	@FindBy(xpath = "//button[@onclick='clicktext()']")
	private WebElement clickonmebutton;

	public void clickonclose() {
		close.click();
	}

	public void clickonpractice() {
		practice.click();
	}

	public void clickonelements() {
		elements.click();
	}

	public void clickonbutton() {
		button.click();
	}

	public void clickondouble() {
		doubleclickme(dobubleclickbutton);
	}

	public void clickonright() {
		rightclickme(rightclickbutton);
	}

	public void clickonme() {
		clickme(clickonmebutton);
	}
}
