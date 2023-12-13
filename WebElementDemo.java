package AssignmentFirst2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementDemo {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		String burl="https://demo.guru99.com/test/radio.html";
		driver.get(burl);
		driver.manage().window().maximize();
		
//		Find Option 1 and select
		
		WebElement Radiobtn=driver.findElement(By.id("vfb-7-1"));
		Radiobtn.click();
		Thread.sleep(1000);
//		Find Checkbox2 and Checkbox3 and select
		
		WebElement Checkbox1=driver.findElement(By.id("vfb-6-0"));
		Checkbox1.click();
		Thread.sleep(1000);
		WebElement Checkbox2=driver.findElement(By.id("vfb-6-1"));
		Checkbox2.click();
		Thread.sleep(1000);
		
//		Find Country Dropdown
		
		String burl2="https://demo.guru99.com/test/newtours/register.php";
		driver.get(burl2);
		Select dropdowncountry=new Select(driver.findElement(By.name("country")));
		
//		Select “KUWAIT”
		
		dropdowncountry.selectByVisibleText("KUWAIT");
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
