package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selintro {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//invoking browser
		//Chrome - ChromeDriver -> Methods
		//ChromeDriver driver = new ChromeDriver();
		
		// chromedriver.exe -> chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amelia sari\\eclipse-workspace\\chromedriver.exe");
		
		// webdriver.chrome.driver -> value of path
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com");
		Thread.sleep(2000);
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		
	}

}
