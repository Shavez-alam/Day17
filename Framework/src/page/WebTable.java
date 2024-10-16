package page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class WebTable extends Baselibrary {
	public WebTable() {
		PageFactory.initElements(driver, this);
	} 

	@FindBy(xpath="//button[text()='×']")
	private WebElement close;
	
	@FindBy(xpath="//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath="//button[@data-target='#elements']")
	private WebElement elements;
	
	@FindBy(xpath="//a[text()='web tables']")
	private WebElement webtable;
	@FindBy(xpath="//input[@name='name']")
	private WebElement name;
	@FindBy(xpath="//input[@name='email']")
	private WebElement email;
	@FindBy(xpath="//button[text()='Save']")
	private WebElement save;
	@FindBy(xpath="//iframe[@src='Webtable.html']")
	private WebElement frame;
	@FindBy(xpath="//button[text()='Edit']")
	private List<WebElement> edit;
	@FindBy(xpath="//input[@name='edit_name']")
	private WebElement edit_name;
	@FindBy(xpath="//input[@name='edit_email']")
	private WebElement edit_email;
	@FindBy(xpath="//button[text()='Update']")
	private WebElement update;
	
	public void clickonclose() {
		close.click();
	}
	public void clickonpractice() {
		practice.click();
	}
	public void clickonelements() {
		elements.click();
	}
	public void clickonwebtable() {
		webtable.click();
	}
	public void fillsdetails()
	{
		driver.switchTo().frame(frame);
		for(int i=1;i<5;i++) {
		name.sendKeys(getReadData(1	, i, 0));
		email.sendKeys(getReadData(1, i, 1));
		save.click();
		}
		
		/*name.sendKeys(getReadData(1	, 2, 0));
		email.sendKeys(getReadData(1, 2, 1));
		save.click();
		name.sendKeys(getReadData(1	, 3, 0));
		email.sendKeys(getReadData(1, 3, 1));
		save.click();
		name.sendKeys(getReadData(1	, 4, 0));
		email.sendKeys(getReadData(1, 4, 1));
		save.click();*/
		
		
	}
	public void updatedetails()
	{
		int j=1;
		for(int i=0;i<edit.size();i++)
		{
			edit.get(i).click();
			edit_name.clear();
			edit_name.sendKeys(getReadData(2, j, 0));
			edit_email.click();
			edit_email.clear();
			edit_email.sendKeys(getReadData(2, j, 1));
			update.click();
			j++;
		}
		driver.switchTo().defaultContent();
	}
	
}
