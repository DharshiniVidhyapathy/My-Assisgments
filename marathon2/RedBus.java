package marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {
	/*
	 * 01) Launch Firefox / Chrome 02) Load https://www.redbus.in/ 03) Type
	 * "Chennai" in the FROM text box hint: Sendkeys(Keys.ENTER) 04) Type
	 * "Bangalore" in the TO text box 05) Select tomorrow's date in the Date field
	 * 06) Click Search Buses 07) Print the number of buses shown as results (104
	 * Buses found) 08) Choose SLEEPER in the left menu 09) Print the name of the
	 * second resulting bus 10) Click the VIEW SEATS of that bus 11) Take screenshot
	 * and close browser
	 */
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
        ChromeOptions option=new ChromeOptions();
        option.addArguments("-disable-notiofications");
        ChromeDriver driver=new ChromeDriver(option);  
        driver.manage().window().maximize();
        driver.get("https://www.redbus.in");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bangalore");
        Thread.sleep(2000);
        
        driver.findElement(By.id("onward_cal")).click();
        
        driver.findElement(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr[4]/td[5]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='search_btn']")).click();
        String noofbuses = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
        System.out.println("No of buses found   "   +  noofbuses );
        Thread.sleep(3000);
        WebElement findElement = driver.findElement(By.xpath("//label[@for='bt_SLEEPER'][1]"));
        findElement.click();
        String name = driver.findElement(By.xpath("(//div[text()='Hail Trip'])[2]")).getText();
        System.out.println("Name of the bus    "    +   name);
         driver.findElement(By.xpath("(//div[text()='View Seats'])[2]")).click();
         File source = driver.getScreenshotAs(OutputType.FILE);
 		File dest=new File("./snaps/screenshot.png");        
         FileUtils.copyFile(source, dest);
         driver.close();
         
	}

}