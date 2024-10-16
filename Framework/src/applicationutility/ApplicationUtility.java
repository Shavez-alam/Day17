package applicationutility;

import org.openqa.selenium.WebElement;

public interface ApplicationUtility {
	public void doubleclickme(WebElement ele);
	public void rightclickme(WebElement ele);
	public void clickme(WebElement ele);
	public void waitforClick(WebElement ele);
	public void waitforVisibile(WebElement ele);
	public void waitforalert();
	public void selectbyvisibleText(WebElement ele,String text);
	public void selectbyIndexing(WebElement ele,int index);
	public void selectbyValue(WebElement ele,String val);
	public void uploadfile(String path);
	
	
}
