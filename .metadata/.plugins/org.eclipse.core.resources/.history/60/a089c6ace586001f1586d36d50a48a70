package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class UploadFilePage extends Baselibrary {
	public UploadFilePage() {
		PageFactory.initElements(driver, this);
	}
 String path="E:\\java automation\\MyFirstJavaProgram\\seleniumproject\\src\\test\\java\\Day17\\Framework\\DataTest\\config.properties";
	@FindBy(xpath = "//button[text()='×']")
	private WebElement close;

	@FindBy(xpath = "//a[text()='Practice']")
	private WebElement practice;

	@FindBy(xpath = "//button[@data-target='#elements']")
	private WebElement elements;
	
	@FindBy(xpath="//a[text()='upload and download']")
	private WebElement uplanddond;
	
	@FindBy(xpath="//label[@for=\"File1\"]")
	private WebElement chooseafile;
	
	public void close() {
		close.click();
	}

	public void practice() {
		practice.click();
	}

	public void elements() {
		elements.click();
	}
	
	public void clickonuplanddond()
	{
		waitforClick(uplanddond);
		uplanddond.click();
	}
	public void clickonchoosefile()
	{
		waitforClick(chooseafile);	
		chooseafile.click();
	}
	public void uploadfiles()
	{
		uploadfile(path);
	}
}
