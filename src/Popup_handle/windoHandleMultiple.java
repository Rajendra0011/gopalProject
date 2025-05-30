package Popup_handle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class windoHandleMultiple {

	public static void main(String[] args) 
	{
	

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Asus\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS	);
		driver.manage().window().maximize();

		WebElement Header=driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
		WebElement dropdown = driver.findElement(By.xpath("//a[text()='Windows']"));
 		
		// Mouse action object
		Actions act=new Actions(driver);
		
		act.moveToElement(Header).moveToElement(dropdown).click().build().perform();
		
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		driver.findElement(By.xpath("( //button[@class='btn btn-info'])[2]")).click();
	}

}
 