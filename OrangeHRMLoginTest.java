package Day17;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
/*
1) Launch browser
2) open url
	https://opensource-demo.orangehrmlive.com/
3) Provide username  - Admin
4) Provide password  - admin123
5) Click on Login button 
6) Verify the title of dashboard page   
	Exp title : OrangeHRM
7) close browser

 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;	
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLoginTest {

	public static void main(String[] args) throws InterruptedException {

		//ChromeDriver driver=new ChromeDriver();
        WebDriver driver = new ChromeDriver();
        
        //open url on browser
        
        driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().window().maximize();
		Thread.sleep(5000);
 
        
 /*  WebElement txtUser= driver.findElement(By.className("username"));
    txtUser.sendKeys("Admin");
    
    
   WebElement pxtPass=driver.findElement(By.className("password"));
   pxtPass.sendKeys("admin123");*/
		
		//write username
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		//write password
		driver.findElement(By.name("password")).sendKeys("admin123");
		//driver.findElement(By.name("password")).sendKeys("admin123");
		
		//click on login button
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	
		//verify title of the of the desh board
		String act_title=driver.getTitle();
		String exp_title="OrangeHRM";
		
		if(act_title.equals(exp_title))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("failed");
		}
		
		
		
		//verify label on after successful login
		
		String act_label="";
		try {
		act_label =driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
		}
		catch(NoSuchElementException e) {
		
		}
		
	//act_label=driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
		
		String exp_label="Dashboard";
		
		if(act_label.equals(exp_label)) {
			System.out.println("test passed");
		}
		else {
			System.out.println("test failed");
		}
		
		
		
		
		
		
		
		
		
	}
}
