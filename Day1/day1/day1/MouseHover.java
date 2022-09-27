package wee4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) {
		//https://www.snapdeal.com/
		/*
		 * ClassRoom:
Load the url:https://www.snapdeal.com/
Mousehover on Men's Fashion
verify the page is loaded

		 */
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch=new ChromeOptions();
	    ch.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement men = driver.findElement(By.linkText("Men's Fashion"));
		Actions builder=new Actions(driver);
		builder.moveToElement(men).perform();
		

		

	}

}
