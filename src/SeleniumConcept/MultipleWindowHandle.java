package SeleniumConcept;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleWindowHandle 
{
 public static void main(String args[])
 {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		
driver.get("htttps://www.flikpakt.com");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("//a"));
		
		System.out.println("");
		for(WebElement link:allLinks)
		{ 
			String href = link.getAttribute("href");
		System.out.println(href);
		}
		
		
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		
	WebElement Btn_switchTo = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
		WebElement Text_windows = driver.findElement(By.xpath("//a[text()='Windows']"));
	 
		Actions act=new Actions(driver);
		
		act.moveToElement(Btn_switchTo).moveToElement(Text_windows).click().build().perform();
		
		driver.findElement(By.xpath("//a[text()='Open Seperate Multiple Windows']")).click();
		driver.findElement(By.xpath("//button[text()='click ']")).click();
      
	 Set <String>handles=driver.getWindowHandles();
	 Iterator it=handles.iterator();
      	String parentId =(String) it.next();
       String childId = (String) it.next();
       String childId1= (String) it.next();
	  
 
	 driver.switchTo().window(childId1);
	 
	 
	 driver.findElement(By.id("enterimg")).click();
 }
}
