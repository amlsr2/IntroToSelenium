package intro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// skip "go to login (button)" but the result is same like Locators.Java, but with diff steps

		String name = "rahul";

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amelia sari\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// 2
		String password = getPassword(driver);
		
		// 3
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(2000);

		driver.findElement(By.id("inputUsername")).sendKeys(name);
		Thread.sleep(2000);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);

		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Thread.sleep(2000);

		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),
				"Hello " + name + ",");

		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		Thread.sleep(2000);
		
		// end here

		// Tutup browser
//      driver.quit();
	}

	public static String getPassword(WebDriver driver) throws InterruptedException {

		// 1 
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(2000);

		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		Thread.sleep(2000);

		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		// Please use temporary password 'rahulshettyacademy' to Login.
		String[] passwordArray = passwordText.split("'");
		// String[] passwordArray2 = passwordArray[1].split("'");
		// passwordArray2[0]
		String password = passwordArray[1].split("'")[0];
		return password;
		// 0th index - Please use temporary password
		// 1st index - rahulshettyacademy' to Login.
		// 0th index - rahulshettyacademy
		// 1st index - to Login.
	}
}