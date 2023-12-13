package AssignmentThird2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAssignment2 {

	
	public static WebDriver driver;
	
	@BeforeTest	
	public static void Startmethod() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/login.html");
		Thread.sleep(1000);
		}

	@Test
	public static void usernamemethod()  {
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("mayuri");			
	}
	
	@Test
	public static void passwordmethod()  {
		WebElement password=driver.findElement(By.id("passwd"));
		password.sendKeys("mayuri123");			
	}
	
	@AfterSuite
	public static void CloseMethod()  {
		driver.close();		
	}
	
}
