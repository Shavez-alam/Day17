package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import page.AlertPage;
import page.ModelDialoguePage;

public class ModelDialogueTest extends Baselibrary {
	ModelDialoguePage obj;
	
	@BeforeTest
	public void launchurl() {
		geturl("chrome");
		obj= new ModelDialoguePage();
	}
	@Test(priority=1)
	public void close() throws InterruptedException {
		Thread.sleep(5000);
		obj.close();
	} 

	@Test(priority=2)
	public void practice() {
		obj.practice();
	}
	
	@Test(priority=3)
	public void clickonalfrwd() {
		obj.alfrwd();
	}
		
		@Test(priority=4)
		public void clickonmodia() {
		obj.modeldialogue();}

		@Test(priority=4)
		public void largebuttonclic() {
		obj.clickonlargebutton();
}
}
