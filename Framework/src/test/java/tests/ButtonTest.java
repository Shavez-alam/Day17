package tests;

import java.awt.Button;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import page.Buttons;

public class ButtonTest extends Baselibrary {
	Buttons obj;

	@BeforeTest
	public void launchurl() {
		geturl("chrome");
		obj = new Buttons();
	}

	@Test(priority = 1)
	public void close() throws InterruptedException {
		Thread.sleep(5000);
		obj.clickonclose();
	}

	@Test(priority = 2)
	public void practice() {
		obj.clickonpractice();
	}

	@Test(priority = 3)
	public void elements() {
		obj.clickonelements();
	}

	@Test(priority = 4)
	public void clickonbutton() {
		obj.clickonbutton();
	}

	@Test(priority = 5)
	public void clickondouble() {
		obj.clickondouble();
	}

	@Test(priority = 6)
	public void clickonright() {
		obj.clickonright();
	}

	@Test(priority = 7)
	public void clickonme() {
		obj.clickonme();
	}

}
