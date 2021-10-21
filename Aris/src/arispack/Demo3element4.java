package arispack;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3element4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00005104\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.gmail.com");		
		System.out.println("Tilte: " +driver.getTitle());
		
		driver.findElement(By.linkText("Help")).click();
		Set<String> ids = driver.getWindowHandles();
		System.out.println(ids);
		
		
		//Iterator concepts
		Iterator<String> it = ids.iterator();
		
		String GmailWindowid = it.next();
		String HelpWindowid = it.next();
		
		System.out.println("Gmail Window ID: " +GmailWindowid);
		System.out.println("Help Window ID: " +HelpWindowid);
		
		driver.switchTo().window(HelpWindowid);
	    System.out.println("Tilte: " +driver.getTitle());
		
		
		
		
		
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
