package arispack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1_BrowserValidate {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00005104\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.linkedin.com/");
		
		driver.findElement(By.className("nav__button-secondary")).click();
		
		
		driver.findElement(By.id("username")).sendKeys("raju");
		driver.findElement(By.name("session_password")).sendKeys("9949");
		
		driver.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button")).click();
		
		String errormessage = driver.findElement(By.id("error-for-username")).getText();
		
		System.out.println(errormessage);
		
		driver.findElement(By.partialLinkText("Forgot")).click();
		System.out.println("Title: " +driver.getTitle());
		
		driver.findElement(By.linkText("Join now")).click();
		System.out.println("Title: " +driver.getTitle());
		
		
		
		int vsize = driver.findElements(By.tagName("a")).size();
		System.out.println("Total links: " +vsize);
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
