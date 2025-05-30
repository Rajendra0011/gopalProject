package Popup_handle;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
 

public class Popup_windowHandle
{
	public static void main(String args[])
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\My Project-1993\\chromeDriver\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS	);
		driver.manage().window().maximize();

		WebElement Header=driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
		WebElement dropdown = driver.findElement(By.xpath("//a[text()='Windows']"));
 		
		// Mouse action object
		Actions act=new Actions(driver);
		
		act.moveToElement(Header).moveToElement(dropdown).click().build().perform();
		
		//Select window functionality
		
	  driver.findElement(By.xpath("(//a[@data-toggle='tab'])[1]")).click();
	  driver.findElement(By.xpath("(//button[@class='btn btn-info'])[1]")).click();
	  
	  System.out.print("-----Open new window-----");
	  
	  //Switch to new woindow
	  
	 Set<String> wds=driver.getWindowHandles();
	   
	 for(String wd:wds)
	 {
		 
		 String title=driver.switchTo().window(wd).getTitle();
		 System.out.println(title);
		 String URL=driver.getCurrentUrl();
		 System.out.println(URL);
		 
	 }
		driver.findElement(By.xpath("(//span[text()='Documentation'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='WebDriver']")).click();
	 driver.findElement(By.xpath("//a[@title='Driver Sessions']")).click();
	 
	 System.out.println("Click to driver");
	 
	 
	 //multiple windown handle
	 driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
	  
	}

}
