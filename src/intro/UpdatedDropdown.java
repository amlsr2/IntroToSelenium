package intro;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
import org.testng.Assert;

public class UpdatedDropdown {  

	public static void main(String[] args) throws InterruptedException {  
	    // TODO Auto-generated method stub  
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amelia sari\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());		
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
		if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("0.5")) 
		{
			System.out.println("Its Enabled");
					Assert.assertTrue(false);
		}
		else
		{
			Assert.assertTrue(true);
		}
		
//		from the class
//		System.out.println(); buat print di output
//		driver.findElements(); buat kalau ada banyak checkbox dengan type:'checkbox' yang sama dan mau di klik yg kedua
//		driver.findElement(); buat kalau ada banyak checkbox dengan type:'checkbox' yang sama dan hanya mau pilih satu
		
//		count the number of checkbox
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		driver.findElement(By.id("divpaxinfo")).click(); 
	    	Thread.sleep(2000);

	    
	    System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	    
	    for(int i=1;i<5;i++) {  
	        driver.findElement(By.id("hrefIncAdt")).click();  
	    }  
	
	    driver.findElement(By.id("btnclosepaxoption")).click();

	    Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
	    
	    System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	
	}  
}
