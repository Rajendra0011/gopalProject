package SeleniumConcept;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class windowsHandle {

	private static final boolean WebElement = false;

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args)
	{
		ChromeOptions options = new ChromeOptions();
	      options.addArguments("--remote-allow-origins=*");
	      options.addArguments("--no-sandbox");
	      options.addArguments("--disable-dev-shm-usage");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(options);
		driver.get("C:\\applications\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
		
		System.out.println("open browser");
		WebElement dropdown=driver.findElement(By.xpath("//a[text()='SwitchTo']"));
		WebElement windtext = driver.findElement(By.xpath("//a[text()='Windows']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(dropdown).moveToElement(windtext).click().build().perform();		
		
	List<WebElement> windowstitles=driver.findElements(By.xpath("//ul[@class='nav nav-tabs nav-stacked']//a"));

	 windowstitles.get(0).click();
	 
	 driver.findElement(By.xpath("//button[text()='    click   ']")).click();
	 
	Set<String> windwsHandles= driver.getWindowHandles();
	 String parentwindow=driver.getWindowHandle(); 
	
	
	  for(String wHandle:windwsHandles)
	  {
		  if(!wHandle.equals(parentwindow))
		  {
		  driver.switchTo().window(wHandle);
		  System.out.println(driver.getTitle());
		  }
		   
	  }
	  
	}
 

}
