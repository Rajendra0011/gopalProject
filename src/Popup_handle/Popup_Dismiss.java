package Popup_handle;

import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_Dismiss
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\Desktop\\driver\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Lanuch Browser
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		//Maximize Window
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS	);
		System.out.println("Maximize Browser");
		
	  //click to ok button
		
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		
		driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
		
		// Alert dismiss popup
		
		Alert al=driver.switchTo().alert();
		al.dismiss();
		System.out.println("Dismiss popup");
		 
	}
  
}
