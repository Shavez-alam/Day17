package page;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class CheckboxPage extends Baselibrary {
	public CheckboxPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//button[text()='×']")
	private WebElement close;
	
	@FindBy(xpath="//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath="//button[@data-target='#elements']")
	private WebElement elements;
	
	@FindBy(xpath="//a[text()='check box']")
	private WebElement checkbox;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement mobile;
	@FindBy(xpath="//iframe[@src='Checkbox.html']")
	private WebElement frame;
 	@FindBy(xpath="//h6[text()='You are selected Mobile']")
	private WebElement mobiletext;
 	@FindBy(xpath="//label[text()='Laptop:']")
 	private WebElement laptop;
 	@FindBy(xpath="//h6[text()='You are Selected Laptop']")
 	private WebElement laptoptext;
 	@FindBy(xpath="//label[text()='Desktop:']")
 	private WebElement desktop;
 	@FindBy(xpath="//h6[@id='text2']")
 	private WebElement desktoptext;
	
	public void clickonclose() {
		close.click();
	}
	public void clickonpractice() {
		practice.click();
	}
	public void clickonelements() {
		elements.click();
	}
	public void clickoncheckbox() {
		checkbox.click();
	}
	public void clickonmobiecheckbox()
	{
		driver.switchTo().frame(frame);
		mobile.click();
		driver.switchTo().defaultContent();
	}
	public void mobiletext() {
		driver.switchTo().frame(frame);
		String expected=mobiletext.getText();
		String actual=getReadData("Mobile");
		Assert.assertEquals(expected, actual);
		driver.switchTo().defaultContent();
	}
	public void clickonlaptopcheckbox()
	{
		driver.switchTo().frame(frame);
		laptop.click();
		driver.switchTo().defaultContent();
	}
	public void laptoptext() {
		driver.switchTo().frame(frame);
		String expected=laptoptext.getText();
		String actual=getReadData("Laptop");
		Assert.assertEquals(expected, actual);
		driver.switchTo().defaultContent();
	}
	public void clickondesktop()
	{
		driver.switchTo().frame(frame);
		desktop.click();
		driver.switchTo().defaultContent();
	}
	public void desktoptext() {
		driver.switchTo().frame(frame);
		String expected=desktoptext.getAttribute("value");
		System.out.println(expected);
		String actual=getReadData("Desktop");
		Assert.assertEquals(expected, actual);
		driver.switchTo().defaultContent();
		
	
	}
	}
	

