package SeleniumConcept;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Asus\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.naukri.com/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().window().maximize();
		
		List<WebElement> allLinks = driver.findElements(By.tagName("//aaa"));
		
		for(WebElement link:allLinks)
		{ 
			String href = link.getAttribute("href");
		System.out.println(href);
		}
		
		
	}

}
