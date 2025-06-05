package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
    	// at "FROM" choose "BLR" -> at "TO" choose "MAA" -> at "Depart date" choose "20"

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\amelia sari\\eclipse-workspace\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[text()='20']")).click();
        
        // Tutup browser
//      driver.quit();
    }
}