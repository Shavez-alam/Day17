package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import page.WebTable;

public class WebTableTest extends Baselibrary {
	WebTable obj;
	@BeforeTest
	public void launchurl() {
		geturl("chrome");
		obj= new WebTable();
	}
	
	@Test(priority=1)
	public void close() throws InterruptedException {
		Thread.sleep(5000);
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
	public void clickonwebtable() throws InterruptedException {
		Thread.sleep(5000);
		obj.clickonwebtable();
		}
 @Test(priority=5)
 public void fillsdetails() throws InterruptedException {
	 Thread.sleep(5000);
	 obj.fillsdetails();
 }
	@Test(priority=6)
	public void updatedetails()
	{
		obj.updatedetails();
	}
}
