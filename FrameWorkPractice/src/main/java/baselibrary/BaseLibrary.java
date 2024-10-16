package baselibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseLibrary {
public void geturl()
{
	public static void main(String[]args) {
	String path="E:\\java automation\\MyFirstJavaProgram\\seleniumproject\\src\\test\\java\\Day17\\FrameWorkPractice\\webdriver\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver", path);
WebDriver driver = new ChromeDriver();
driver.get("testingbaba.com/old/");
driver.manage().window().maximize();
}
}
}
