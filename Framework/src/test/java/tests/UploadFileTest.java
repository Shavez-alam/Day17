package tests;

import org.apache.poi.sl.draw.geom.Path;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import page.UploadFilePage;


public class UploadFileTest extends Baselibrary {
	UploadFilePage obj;
	
	@BeforeTest
	public void launchurl() {
		geturl("chrome");
		obj= new UploadFilePage();
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
	public void elements() {
		obj.elements();
	}
	@Test(priority=4)
	public void uploadanddownload()
	{
		obj.clickonuplanddond();
	}
	
	@Test(priority=5)
	public void choosefileforupload()
	{
		obj.clickonchoosefile();
	}
	
	@Test(priority=6)
	public void uploadcopyfiles()
	{
		obj.uploadfiles();
	}
}
