package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import page.AlertPage;

public class AlertPageTest extends Baselibrary {
	AlertPage obj;
	
	@BeforeTest
	public void launchurl  () {
		geturl("chrome");
		obj= new AlertPage();
	}
	@Test(priority=1)
	public void close() throws InterruptedException {
		Thread.sleep(5000);
		obj.close();
	} 

	@Test(priority=2)
	public void practice() {
		obj.practice();
	}
	
	@Test(priority=3)
	public void clickonalfrwd() {
		obj.alfrwd();
	}
	
	@Test(priority=4)
	public void clickonalets() {
		obj.alerts();
	}
	@Test(priority=5)
	public void clickonclickme() {
		obj.clickmebutton();
	}
	@Test(priority=6)
	public void clickonclickmeafter5sec() {
		obj.clickmebuttonafter5sec();
	}
	@Test(priority=7)
	public void confirmbutton() {
		obj.clickonconfirmbutton();
	}
	
	@Test(priority=8)
	public void promptbuttonsendvalue() {
		obj.clickonprompt();
	}
	
	
	
	

}
