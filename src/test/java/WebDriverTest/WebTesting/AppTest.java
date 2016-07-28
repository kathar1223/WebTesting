package WebDriverTest.WebTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AppTest {
public  WebDriver driver;
	
@Test(description = "send Member profile Information", invocationCount = 1, threadPoolSize = 1, timeOut = 5555555, priority = 1)
	public void test()
	{
		System.out.println("1212121212121");
		driver = new FirefoxDriver();
		driver.get("https://google.com");
		driver.findElement(By.id("test"));
		driver.findElement(By.name("test"));
		System.out.println("1212155555555555551");
		
	}
	
}
