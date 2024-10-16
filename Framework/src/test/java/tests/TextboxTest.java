package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;

import page.TextBoxPage;

public class TextboxTest extends Baselibrary {
	TextBoxPage obj;
	
	@BeforeTest(groups= {"sanity","smoke","regression"})
	public void launchurl() {
		geturl("chrome");
		obj= new TextBoxPage();
	}
	
	@Test(priority=1,groups= {"sanity","smoke","regression"})
	public void close() throws InterruptedException {
		Thread.sleep(5000);
		obj.close();
	} 

	@Test(priority=2,groups= {"sanity","smoke","regression"})
	public void practice() {
		obj.practice();
	}
	@Test(priority=3,groups= {"smoke","regression"})
	public void elements() {
		obj.elements();
	}
	@Test(priority=4,groups= {"sanity"})
	public void textbox()
	{
	obj.textbox();
	}
	@Test(priority=5,groups= {"regression"})
	public void detail()
	{
		obj.detail();
	}
	@Test(priority=6,groups= {"regression"})
	public void validate()
	{
		obj.validate();
	}
}


	