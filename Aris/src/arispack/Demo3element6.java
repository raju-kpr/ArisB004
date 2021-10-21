package arispack;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo3element6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00005104\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/draggable/");
		System.out.println("Title is :" +driver.getTitle());
		
		String vText=driver.findElement(By.className("entry-title")).getText();
		System.out.println(vText);
		
		int vFrame = driver.findElements(By.tagName("iframe")).size();
		System.out.println(vFrame);
		
		//driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		vText = driver.findElement(By.id("draggable")).getText();
		System.out.println(vText);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("draggable"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
		
		Thread.sleep(4000);
		
		driver.switchTo().defaultContent();
		
		
		vText=driver.findElement(By.className("entry-title")).getText();
		System.out.println("Main Page Text : "+vText);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
