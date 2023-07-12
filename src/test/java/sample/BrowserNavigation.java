package sample;

import java.lang.StackWalker.Option;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;

public class BrowserNavigation {
//pull request
	public static void main(String[] args) {
		ChromeOptions Option = new ChromeOptions();
		Option.addArguments("incognito");
		WebDriver driver=new ChromeDriver(Option);
		driver.get("https://www.flipkart.com");
		EdgeOptions Options = new EdgeOptions();
		Options.addArguments("InPrivate");
		driver.get("https://www.flipkart.com");

	}

}
