package baselibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baselibrary {
public static	WebDriver driver=null;
	public void getlaunch()
	{
		String path= "E:\\java automation\\MyFirstJavaProgram\\seleniumproject\\src\\test\\java\\Day17\\TestingBaba_1stApril_AutomationFramework\\webdriver\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
		 driver= new ChromeDriver();
		driver.get("https://www.testingbaba.com/old/");
		driver.manage().window().maximize();		
	}
	
	

}
