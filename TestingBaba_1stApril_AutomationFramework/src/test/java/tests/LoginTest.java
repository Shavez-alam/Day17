package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.LoginPage;

public class LoginTest extends Baselibrary {
	LoginPage obj;
	@BeforeTest
	public void launchurl()
	{
		getlaunch();
		obj=new LoginPage();
	}
	@Test
	public void clickonclose() throws InterruptedException
	{
		Thread.sleep(5000);
		obj.clickonclose();
	}
}
