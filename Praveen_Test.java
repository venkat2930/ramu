package praveen;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import kotlin.collections.IntIterator;

public class Praveen_Test{
	@Test
	
	public void Launch() throws InterruptedException{
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		WebElement raj=driver.findElement(By.name("q"));
		raj.sendKeys("mobiles");
		raj.submit();
		Thread.sleep(3000);
		String parent=driver.getWindowHandle();
		System.out.println("parent is :"+parent);
		driver.findElement(By.xpath("//div[normalize-space()='Motorola G34 5G (Ocean Green, 128 GB)']")).click();
		Thread.sleep(3000);
		Set<String> s =driver.getWindowHandles();
		System.out.println("child is :"+s);
		for(String child : s)
			if(!child.equals(parent))
			{
		    driver.switchTo().window(child);
			driver.findElement(By.xpath("//img[@class=\"LctmNn\"]")).click();
			Thread.sleep(3000);
			driver.close();
			}
		Thread.sleep(3000);
		driver.switchTo().window(parent);
		WebElement raj1=driver.findElement(By.name("q"));
		
		raj1.sendKeys("mobiles 10");
		raj1.submit();
		Thread.sleep(3000);
		
		
		driver.quit();
	}
	
}

	
	
		
		
		
	
		

		
		
	




