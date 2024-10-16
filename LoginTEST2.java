package Day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTEST2 {
// open chrome driver
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		
		//update url in chrome driver
		
		driver.get(" https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
   driver.manage().window().maximize();
   Thread.sleep(5000);
   
   //add email in emailbox
   driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[2]/div[1]/input")).clear()
;
   driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[2]/div[1]/input")).sendKeys("admin@yourstore.com")
	
;
   //add password in passwordbox
   driver.findElement(By.id("Password")).clear();
   driver.findElement(By.id("Password")).sendKeys("admin");
   
   
   //click on login button
   driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
   Thread.sleep(7000);
   //verify the title on the dashbord
   String act_title=driver.getTitle();
   String exp_title="Dashboard";
   if(act_title.equals(exp_title))
   {
	   System.out.println("passed");}
	   else {
		   System.out.println("failed");
	   }
	   }
	
	
	//verify the labal
	String act_label="";
	String exp_label=
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
   
		   
   
   
   
   
   
   
;   
   
   
   
	}
