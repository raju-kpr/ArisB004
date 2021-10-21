package arispack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3element3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00005104\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/");
		System.out.println("Tilte: " +driver.getTitle());
		
		
		Select adultselect = new Select(driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div[1]/div/div[2]/div/div[4]/div/div[1]/select")));
		
		adultselect.selectByIndex(1);
		Thread.sleep(5000);
		adultselect.selectByValue("5");
		Thread.sleep(5000);
		adultselect.selectByVisibleText("8");
		Thread.sleep(5000);
		
		
Select childselect = new Select(driver.findElement(By.className("bc-neutral-100 bg-transparent")));
		
		childselect.selectByIndex(1);
		Thread.sleep(5000);
		
		childselect.selectByValue("5");
		Thread.sleep(5000);
		
		childselect.selectByVisibleText("8");
		Thread.sleep(5000);
		
		
		driver.close();
		//driver.quuit();
		
	}

}
