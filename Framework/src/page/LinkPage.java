package page;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class LinkPage extends Baselibrary {
	public LinkPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='×']")
	private WebElement close;

	@FindBy(xpath = "//a[text()='Practice']")
	private WebElement practice;

	@FindBy(xpath = "//button[@data-target='#elements']")
	private WebElement elements;

	@FindBy(xpath = "//a[text()='links']")
	private WebElement link;

	@FindBy(xpath = "//a[text()='Demo Page']")
	private WebElement demopage;

	public void close() {
		close.click();
	}

	public void practice() {
		practice.click();
	}

	public void elements() {
		elements.click();
	}

	public void link() {
		link.click();
	}

	public void demopage() throws InterruptedException {
		demopage.click();
		Set<String> windowids = driver.getWindowHandles();
		ArrayList<String> list = new ArrayList<String>(windowids);
		driver.switchTo().window(list.get(1));
		//Thread.sleep(3000);
		waitforClick(close);
		close.click();
		//Thread.sleep(5000);
		driver.switchTo().window(list.get(0));
	}

}
