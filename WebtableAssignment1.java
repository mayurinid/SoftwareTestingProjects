package AssignmentSecond1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableAssignment1 {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		String url="https://demo.guru99.com/test/web-table-element.php";
		driver.get(url);
//		Retrieve the all company names from the table And display in console

		 WebElement table = driver.findElement(By.className("dataTable"));
		 List<WebElement> rows = table.findElements(By.tagName("tr"));
		 for (WebElement row : rows) {
			 List<WebElement> columns = row.findElements(By.tagName("td"));
		 
		  if (!columns.isEmpty()) {
              String companyName = columns.get(0).getText();
              System.out.println("Company Name: " + companyName);
          }
		 }
		 
		 String url1="https://demo.guru99.com/test/login.html";
		 driver.manage().window().maximize();
		 driver.get(url1);
		 WebElement username=driver.findElement(By.id("email"));
		 username.sendKeys("rnmayuri08@gmail.com");
		 WebElement password=driver.findElement(By.id("passwd"));
		 password.sendKeys("123456");
		 WebElement submitbtn=driver.findElement(By.id("SubmitLogin"));
		 submitbtn.click();
		 Thread.sleep(2000);
		 driver.quit();
	}
	

}
