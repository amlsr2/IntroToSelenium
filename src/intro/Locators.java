package intro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		// implicit wait - 5 second time out
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// wrong test  case
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
		driver.findElement(By.xpath("//input[@type='text'] [2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("864353253");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		// dari class
		//driver.findElement(By.id("inputUsername")).sendKeys("right");
		//driver.findElement(By.name("inputPassword")).sendKeys("right");
		//driver.findElement(By.className("signInBtn")).click();
		//driver.findElement(By.tagName("?"));
		//driver.findElement(By.linkText("?"));
		//driver.findElement(By.partialLinkText("?"));
		//driver.findElement(By.cssSelector("?"));
		//driver.findElement(By.xpath("?"));
		// di chrome
		// untuk CSS = F12 -> Console -> $('p.error') -> hasilnya nanti muncul html yg merujuk ke kata yg unik
		// untuk Xpath = F12 -> Console -> $x('//input[@placeholder="Name"]') -> hasilnya nanti muncul ada input atau engga
	}

}
