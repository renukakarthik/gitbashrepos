package sample;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandling {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		WebElement jobs = driver.findElement(By.xpath("//div[.='Jobs']"));
		Actions act = new Actions(driver);
		act.moveToElement(jobs).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[.='Jobs by skill']")).click();
		driver.findElement(By.xpath("//div[.='Services']")).click();
		String mainId = driver.getWindowHandle();
		System.out.println(mainId);
		Set<String> allids = driver.getWindowHandles();
		{
			if()
		}
		
		
		
	}
}
