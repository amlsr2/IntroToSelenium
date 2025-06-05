package intro;

import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class frameTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// move the "drag me to the target" to the "drop here" -> the "drop here" will change color from grey to yellow and say "dropped!" 

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amelia sari\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");

		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		driver.switchTo().frame(0);
		
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));

		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();

        // Tutup browser
//      driver.quit();
	}
}
