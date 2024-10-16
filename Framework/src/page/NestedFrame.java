package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class NestedFrame extends Baselibrary {
	public NestedFrame() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='×']")
	private WebElement close;

	@FindBy(xpath = "//a[text()='Practice']")
	private WebElement practice;

	@FindBy(xpath = "//button[@data-target='#alerts']")
	private WebElement altwind;

	@FindBy(xpath = "//a[text()='nested frames']")
	private WebElement nestedframe;

	@FindBy(xpath = "//iframe[@src=\"target1.html\"]")
	private WebElement frame1;

	@FindBy(xpath = "//iframe[@src=\"text.html\"]")
	private WebElement frame2;

	@FindBy(xpath = "//iframe[@src=\"example.html\"]")
	private WebElement frame3;

	@FindBy(xpath = "//a[text()='Click Here']")
	private WebElement clickhere;

	public void close() {
		close.click();
	}

	public void practice() {
		practice.click();
	}

	public void altwind() {
		altwind.click();
	}

	public void nestedframe() {
		nestedframe.click();
		driver.switchTo().frame(frame1);
		driver.switchTo().frame(frame2);
		driver.switchTo().frame(frame3);
		clickhere.click();
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		System.out.println("frmaeout");

	}
}
