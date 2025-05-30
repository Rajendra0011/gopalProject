package Popup_handle;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_getText {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\Desktop\\driver\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		//click to text link
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
		//Print Text in console window
		Alert al=driver.switchTo().alert();
		String text=al.getText();
		System.out.println(text);
		
		//Close the popup with OK button
		
		al.accept();
		
		//Print URL
		String url=driver.getCurrentUrl();
		System.out.println("get URL of current page : "+ url);
		
		//Print Title of current page
		String title=driver.getTitle();
		System.out.println("Get title of current page : " + title);
		
		
		
		
		
	}

}
