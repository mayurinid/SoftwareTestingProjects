package Assignmentsecond2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAssignment {
 public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
//		Enter customer Id
		
		WebElement CustemerId=driver.findElement(By.name("cusid"));
		CustemerId.sendKeys("mayuri123");
		
//		Click on Submit
		
		WebElement submitbtn=driver.findElement(By.name("submit"));
		submitbtn.click();
		Thread.sleep(3000);
		
		
//		One prompt will open click on ok
		 Alert firstAlert = driver.switchTo().alert();
		 
		 String firstAlertText = firstAlert.getText();
	     System.out.println("First Alert Text: " + firstAlertText);
	     firstAlert.accept();
	     Thread.sleep(3000);
//	     Again open one prompt click on ok
	     
	     Alert secondAlert = driver.switchTo().alert();
	     
	     String secondAlertText = secondAlert.getText();
	     System.out.println("Second Alert Text: " + secondAlertText);
	     secondAlert.accept();
	     Thread.sleep(3000);
	     driver.quit();

		
	}

}
