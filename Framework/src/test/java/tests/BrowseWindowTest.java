package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import page.BrowseWindowPage;
import page.LinkPage;

public class BrowseWindowTest extends Baselibrary {
	BrowseWindowPage obj;

	@BeforeTest
	public void launchurl() {
		geturl("chrome");
		obj = new BrowseWindowPage();
	}

	@Test(priority = 1)
	public void close() throws InterruptedException {
		// Thread.sleep(5000);
		obj.close();
	}

	@Test(priority = 2)
	public void practice() {
		obj.practice();
	}

	@Test(priority = 3)
	public void clickonaltwind() {
		obj.altwind();
	}

	@Test(priority = 4)
	public void clickonbroswind() {
		obj.browind();
	}

	@Test(priority = 5)
	public void clickonnewtab() throws InterruptedException {
		obj.newtab();
	}

	@Test(priority = 6)
	public void clickonnewWindow() throws InterruptedException {
		obj.newWindow();
	}

	@Test(priority = 7) 
	  public void clickonnewWindowmessage() throws
	  InterruptedException {
	   obj.newWindowMessgae(); 
	   }

}
