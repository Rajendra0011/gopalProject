package SeleniumConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iframeHandle
{
	public static void main(String args[])
	{
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		driver.get("https://demo.automationtesting.in/WebTable.html");
		
		driver.findElement(By.xpath("//a[text()='SwitchTo']")).click();
		driver.findElement(By.xpath("//a[text()='Frames']")).click();
		
		Actions act=new Actions(driver);
		
		driver.switchTo().frame("singleframe");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("1111");
		
		 
		 
	}

}
