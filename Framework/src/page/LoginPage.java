 package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class LoginPage extends Baselibrary {
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
  @FindBy(xpath="//button[text()='×']")
private WebElement close;
 
  public void clickonclose()
  {
	  close.click();
  }
  @FindBy(xpath="//a[text()='Practice']")
 private WebElement pratice;
  
  public void clickonpratice()
  {
	  pratice.click();
  }
  public void gettitle()
  {
	String title= driver.getTitle();
	System.out.println("title of the page "+title);
  }
  public void geturl()
  {
	String url=  driver.getCurrentUrl();
	System.out.println("current url of the page "+url);
  }
}
