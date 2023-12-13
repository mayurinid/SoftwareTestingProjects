package AssignmentSecond3;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class ActionAssignment {
	 public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		driver = new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		WebElement dragid=driver.findElement(By.id("draggable"));
		WebElement dropid=driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(dragid, dropid).build().perform();
		 js.executeScript("arguments[0].style.border='2px solid red'", dropid); 
		TakesScreenshot screenshotFile = ((TakesScreenshot)driver);
	        		
	        File src=screenshotFile.getScreenshotAs(OutputType.FILE);
	       File dest=new File("C:\\Users\\mayuri\\Documents\\Screenshots\screenshot.png");
	       FileHandler.copy(src, dest);
	      

		
	}

}
