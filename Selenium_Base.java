package praveen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_Base {

	public static void main(String[] args) {
		
		
		WebDriver driver =WebDriverManager.chromedriver().create();
		driver.get("https://www.google.com/");
		String Title=driver.getTitle();
		System.out.println(Title);
		

	}

}
