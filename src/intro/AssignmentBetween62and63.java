package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentBetween62and63 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); // URL in the browser
		
		driver.findElement(By.cssSelector("input[id*='Option1']")).click();
        Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id*='Option1']")).click();
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	
//      // Tutup browser
//      driver.quit();
	}

}
