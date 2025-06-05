package intro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Switch To Alert Example -> "Enter Your Name (name box)" -> "Alert (button) and okay (button)" -> "Confirm (button) and okay (button)"

		String text = "Amel";

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amelia sari\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 

		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();

		System.out.println(driver.switchTo().alert().getText());

		Thread.sleep(2000);

		driver.switchTo().alert().accept();

		driver.findElement(By.id("confirmbtn")).click();

		Thread.sleep(2000);

		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().dismiss();
		
        // Tutup browser
//      driver.quit();
	}
}
