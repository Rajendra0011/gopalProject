package Popup_handle;

 
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hidden_Division_Popup 
{
	public static void main(String args [])
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\My Project-1993\\chromeDriver\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@data-toggle='tab'])[1]")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		//Create Object of alert popup
		
		Alert al=driver.switchTo().alert();
		al.accept();
		
		System.out.println("Accept popup");
		 
	}

}
