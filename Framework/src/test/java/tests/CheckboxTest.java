package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import page.CheckboxPage;

public class CheckboxTest extends Baselibrary {
	CheckboxPage obj;
	
	@BeforeTest()
	public void openbrowser() {
		geturl("chrome");
		obj= new CheckboxPage();
	}
	
	
	@Test(priority=1)
	public void close() {
		obj.clickonclose();
	}
	@Test(priority=2)
	public void practice() {
		obj.clickonpractice();
	}
	@Test(priority=3)
	public void elements() {
		obj.clickonelements();
	}
	@Test(priority=4)
	public void checkbox() {
		obj.clickoncheckbox();
	}
	@Test(priority=5)
	public void mobile() {
		obj.clickonmobiecheckbox();
	}
	@Test(priority=6)
	public void validate()
	{
		obj.mobiletext();
	}
	@Test(priority=7)
	public void validated()
	{
		obj.clickonlaptopcheckbox();
	}
	@Test(priority=8)
	public void validatelaptoptext()
	{
	obj.laptoptext();
	}
	@Test(priority=9)
	public void clickondesktops() {
	obj.clickondesktop();
	}
	@Test(priority=10)
	public void desktoptextcall() {
		obj.desktoptext();
	}
	
}
