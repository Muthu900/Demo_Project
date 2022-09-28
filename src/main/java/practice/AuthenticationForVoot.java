package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationForVoot {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.voot.com/activate");
		driver.findElement(By.xpath("//*[@alt='email-icon']")).click();
		driver.findElement(By.name("email")).sendKeys("july@amazon.com");
		driver.findElement(By.xpath("//*[text()='Continue']")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[text()='Continue']")).click();
		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@class='jss1205']")).sendKeys("ASDF");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ABCD");
		//input[@type='text']
		
		
	}
}
