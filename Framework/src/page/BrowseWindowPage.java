package page;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class BrowseWindowPage extends Baselibrary {
	public BrowseWindowPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='×']")
	private WebElement close;

	@FindBy(xpath = "//a[text()='Practice']")
	private WebElement practice;

	@FindBy(xpath = "//button[@data-target='#alerts']")
	private WebElement altwind;

	@FindBy(xpath = "//a[text()='browser windows']")
	private WebElement browind;

	@FindBy(xpath = "//a[@href='https://www.google.co.in/']")
	private WebElement newtab;

	@FindBy(xpath = "//a[text()='New Window']")
	private WebElement newWindow;

	@FindBy(xpath = "//a[text()='New Window Message']")
	private WebElement newWindowMessgae;

	public void close() {
		close.click();
	}

	public void practice() {
		practice.click();
	}

	public void altwind() {
		altwind.click();
	}

	public void browind() {
		waitforClick(browind);
		browind.click();
	}

	public void newtab() throws InterruptedException {
		waitforClick(newtab);
		newtab.click();
		Set<String> windids = driver.getWindowHandles();
		ArrayList<String> listed = new ArrayList<String>(windids);
		driver.switchTo().window(listed.get(1));
		Thread.sleep(2000);
		driver.switchTo().window(listed.get(0));

	}

	public void newWindow() throws InterruptedException {
		waitforClick(newWindow);
		newWindow.click();
		Set<String> windids = driver.getWindowHandles();
		ArrayList<String> listed = new ArrayList<String>(windids);
		driver.switchTo().window(listed.get(1));
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(listed.get(0));
	}

	public void newWindowMessgae() throws InterruptedException {
		waitforClick(newWindowMessgae);
		newWindowMessgae.click();
		driver.close();

	}

	///// new open window kaise close hogiz
}
