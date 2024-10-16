package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import page.LoginPage;

public class LoginTest extends Baselibrary {
	LoginPage obj;

	@BeforeTest
	@Parameters("browser")
	public void launchurl(String browser) { 
		geturl(browser);
		obj = new LoginPage();
	}

	@Test(priority=1)
	public void clickonclose() throws InterruptedException {
		Thread.sleep(5000);
		obj.clickonclose();
	} 

	@Test(priority=2)
	public void clickonpractice() {
		obj.clickonpratice();
	}

	@Test(priority=3)
	public void gettitleonpage() {
		obj.gettitle();
	}

	@Test (priority=4)
	public void geturlofthecurrentpage() {
		obj.geturl();
	}
}
