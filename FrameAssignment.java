package AssignmentSecond2_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAssignment {
 public static WebDriver driver;	
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/guru99home/");
		Thread.sleep(1000);
		driver.switchTo().frame("a077aa5e");
		driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		
	}

}
