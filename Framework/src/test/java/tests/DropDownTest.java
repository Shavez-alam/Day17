package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import page.DropDownPage;

public class DropDownTest extends Baselibrary {
	DropDownPage obj;

	@BeforeTest
	public void launchurl() {
		geturl("chrome");
		obj = new DropDownPage();
	}

	@Test(priority = 1)
	public void close() throws InterruptedException {
		Thread.sleep(5000);
		obj.close();
	}

	@Test(priority = 2)
	public void practice() {
		obj.practice();
	}
	@Test(priority = 3)
	public void widget() {
		obj.clickonwidget();
	}
	@Test(priority = 4)
	public void selectmenu() {
		obj.clickonselectmenu();
	}
	
	@Test(priority = 5)
	public void slectoptionclick() {
		obj.clickonselectoption();
	}
}
