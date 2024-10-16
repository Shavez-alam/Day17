package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import page.LinkPage;

public class LinkPageTest extends Baselibrary {
	LinkPage obj;

	@BeforeTest
	public void launchurl() {
		geturl("chrome");
		obj = new LinkPage();
	}

	@Test(priority = 1)
	public void close() throws InterruptedException {
		//Thread.sleep(5000);
		obj.close();
	}

	@Test(priority = 2)
	public void practice() {
		obj.practice();
	}

	@Test(priority = 3)
	public void elements() {
		obj.elements();
	}
	
	@Test(priority = 4)
	public void clickonlink() throws InterruptedException {
		//Thread.sleep(3000);
		obj.link();
	}
	
	@Test(priority = 5)
	public void clickondemopage() throws InterruptedException {
		//Thread.sleep(5000);
		obj.demopage();
	}
	
}