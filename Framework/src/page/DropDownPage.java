package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class DropDownPage extends Baselibrary {
	public DropDownPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='×']")
	private WebElement close;

	@FindBy(xpath = "//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//button[@data-target=\"#widget\"]")
	private WebElement widget;
	
	@FindBy(xpath = "//a[text()='select menu']")
	private WebElement selectmenu;
	
	/*@FindBy(xpath = "//a[text()='Practice']")
	private WebElement practice;*/
	
	@FindBy(xpath="//label[text()='Select Value']/../select")
	private WebElement selectoption;
	
	public void close() {
		close.click();
	}

	public void practice() {
		practice.click();
	}
	
	public void clickonwidget() {
		widget.click();
	}
	
	public void clickonselectmenu() {
		waitforClick(selectmenu);
		selectmenu.click();
	}
	
	public void clickonselectoption() {
		selectbyvisibleText(selectoption, "Group 1, Option 2");
	}

}
