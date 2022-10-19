package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IRCTC {

	public static void main(String[] args) {
		
	//	1. Load https://www.irctc.co.in/
		
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.irctc.co.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
               
		//	2. Click on OK button in the dialog 
       driver.findElement(By.xpath("//button[text()='OK']")).click();
        
		//	3. Click on FLIGHTS link          
       driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
       
       
			//4. Get the Title of the page*/
       
       System.out.println(driver.getTitle());
       
	}

}
