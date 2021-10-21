package arispack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3element {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00005104\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
driver.get("https://www.linkedin.com/");
		
		driver.findElement(By.className("nav__button-secondary")).click();
		
		
		driver.findElement(By.id("username")).sendKeys("raju");
		driver.findElement(By.name("session_password")).sendKeys("9949");
		
		
		//driver.findElement(By.xpath("//button[@aria-label = 'Sign in']")).click();
		//driver.findElement(By.xpath("//*[@aria-label = 'Sign in']")).click();
		//driver.findElement(By.xpath("//button[@class = 'btn__primary--large from__button--floating']")).click();
		//driver.findElement(By.xpath("//button[@type='submit' and @aria-label = 'Sign in']")).click();
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
		
	String errormessage = driver.findElement(By.id("error-for-username")).getText();
		
		System.out.println(errormessage);

	}

}
