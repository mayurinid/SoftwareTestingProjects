package AssignmentSecond2_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowAssignment {
	 public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/popup.php");
		Thread.sleep(1000);
		WebElement Clickme=driver.findElement(By.xpath("//a[@target='_blank']"));
		Clickme.click();
		
		 for (String windowHandle : driver.getWindowHandles()) {
	            driver.switchTo().window(windowHandle);
	        }

		 
		WebElement Emailid=driver.findElement(By.xpath("//input[@name='emailid']"));
		Emailid.sendKeys("rnmayuri08@gmail.com");
		
		WebElement submitbtn=driver.findElement(By.xpath("//input[@name='btnLogin']"));
		submitbtn.click();
	}

}
