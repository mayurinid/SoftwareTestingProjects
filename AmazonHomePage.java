package AssignmentFirst1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class AmazonHomePage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
//		First Selenium Test: Verify amazon HomaPage
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
//		verify the FaceBook HomePage 
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
//		Verify the Page Title. 
//		i). Verify the Page Title of amazon HomaPage.
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String ExpectedResult="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String ActualResult=driver.getTitle();
		if(ActualResult.equals(ExpectedResult)) {
			System.out.println("Verified the Page Tittle of amazon HomaPage");
		}
		else
		{
			System.out.println("Verification of the Page Tittle of amazon HomaPage is failed");
		}
		
//		ii). Verify the Page Title of FaceBook HomePage.
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String ExpectedResultofFb="Facebook – log in or sign up";
		String ActualResultofFb=driver.getTitle();
		if(ActualResultofFb.equals(ExpectedResultofFb)) {
			System.out.println("Verified the Page Tittle of Facebook HomaPage");
		}
		else
		{
			System.out.println("Verification of the Page Tittle of Facebook HomaPage is failed");
		}
		
				
//		Invoke : Firefox, Safari, Opera, IE
		
		WebDriver Fdriver=new FirefoxDriver();
		Fdriver.get("https://www.google.com/");
		Fdriver.manage().window().maximize();
		Fdriver.quit();		
				
		
//		WebDriver IEdriver=new InternetExplorerDriver();
//		IEdriver.get("https://www.google.com/");
//		IEdriver.manage().window().maximize();
//		IEdriver.quit();
//		
//	    WebDriver Sdriver = new SafariDriver();
//	    Sdriver.get("https://www.google.com/");
//	    Sdriver.manage().window().maximize();
//	    Sdriver.quit();
//	    
//	    WebDriver Odriver = new OperaDriver();
//	    Odriver.get("https://www.google.com/");
//	    Odriver.manage().window().maximize();
//	    Odriver.quit();
	    
//	    Using Navigator commands to move home page to other page and comeback to homepage
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.quit();
	}

}
	