package intro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// 2 page 3 move page, wrong login -> sign in page (wrong login) -> forgot password page -> sign in page (right login)
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amelia sari\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		// implicit wait - 5 second time out
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// wrong login
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		Thread.sleep(2000);
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		Thread.sleep(2000);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		
		// forgot password page
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text'] [2]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("864353253");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(2000);
		
		// right login
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		Thread.sleep(2000);
		driver.findElement(By.id("chkboxOne")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		Thread.sleep(2000);
		
		// note from the class
		//driver.findElement(By.id("inputUsername")).sendKeys("right");
		//driver.findElement(By.name("inputPassword")).sendKeys("right");
		//driver.findElement(By.className("signInBtn")).click();
		//driver.findElement(By.tagName("?"));
		//driver.findElement(By.linkText("?"));
		//driver.findElement(By.partialLinkText("?"));
		//driver.findElement(By.cssSelector("?"));
		//driver.findElement(By.xpath("?"));
		// at chrome
		// for CSS = F12 -> Console -> $('p.error') -> the result will be the HTML something that refers to a unique word
		// for Xpath = F12 -> Console -> $x('//input[@placeholder="Name"]') -> The results will appear later, whether there is input or not.
//		driver.close(); -> use driver.quit(); because if use driver.close(); there's warning like: "WARNING: Connection reset"
	}

}
