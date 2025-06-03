package intro;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
import org.testng.Assert;

public class UpdatedDropdown {  

	public static void main(String[] args) throws InterruptedException {  
	    // TODO Auto-generated method stub  
	
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");	 // URL in the browser
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
//		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
//		Assert.assertFalse(true);
//		Assert.assertFalse(false);
//		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());			
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		//.ui-state-default.ui-state-highlight.ui-state-active
		
//		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
//		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
//		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		
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
		
//		System.out.println(); buat print di output
//		driver.findElements(); buat kalau misalnya ada banyak checkbox dengan type:'checkbox' yang sama dan mau di klik yg kedua
//		driver.findElement(); buat kalau misalnya ada banyak checkbox dengan type:'checkbox' yang sama dan hanya mau pilih satu
		
//		count the number of checkbox
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		driver.findElement(By.id("divpaxinfo")).click(); 
	    	Thread.sleep(2000);
	
	    /* int i = 1;  
	    while (i <= 4) {  
	        driver.findElement(By.id("hrefIncAct")).click(); // 4 times  
	        i++;  
	    } */
	    
	    System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	    
	    for(int i=1;i<5;i++) {  
	        driver.findElement(By.id("hrefIncAdt")).click();  
	    }  
	
	    driver.findElement(By.id("btnclosepaxoption")).click();

	    Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
	    
	    System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	
	}  
}
