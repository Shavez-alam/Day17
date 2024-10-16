package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import page.NestedFrame;

public class NestedFrameTest extends Baselibrary {
	NestedFrame obj;

	@BeforeTest
	public void launchurl() {
		geturl("chrome");
		obj = new NestedFrame();
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
	public void clickonalfrwd() {
		obj.altwind();
	}
	@Test(priority = 4)
	public void clickonnestedframe() {
		obj.nestedframe();
	}
}
