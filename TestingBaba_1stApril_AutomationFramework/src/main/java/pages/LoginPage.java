package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class LoginPage extends Baselibrary {
	public LoginPage()
	{

		PageFactory.initElements(driver,this);
		
	}
@FindBy(xpath="//button[text()='×']")
private WebElement close;

public void clickonclose()
{
close.click();	
}
}
