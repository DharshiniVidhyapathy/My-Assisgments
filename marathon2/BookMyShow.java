package marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookMyShow {

	public static void main(String[] args) throws IOException {
		//Testcase 3 (BookMyShow)
	//	01) Launch Edge / Chrome
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
				
		//02) Load   https://in.bookmyshow.com/
		driver.get("https://in.bookmyshow.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));		
		//03) Type the city as "Hyderabad" in Select City
		driver.findElement(By.xpath("(//div[@class='sc-ekulBa bxvwzt'])[4]")).click();
	//	04) Confirm the URL has got loaded with Hyderabad
		System.out.println(driver.getWindowHandle());
	//	05) Search for your favorite movie 
		driver.findElement(By.xpath("//span[text()='Search for Movies, Events, Plays, Sports and Activities']")).click();

		driver.findElement(By.xpath("//span[text()='Tamil']")).click();
		driver.findElement(By.xpath("//a[text()='Ponniyin Selvan - Part 1 (UA)']")).click();
	//	06) Click Book Tickets
		driver.findElement(By.xpath("//span[text()='Book tickets']")).click();
		
	//	07) Print the name of the theater displayed first
		String theatre = driver.findElement(By.xpath("//a[text()='AMB Cinemas: Gachibowli']")).getText();
		System.out.println("Name of the theatre   "    +  theatre);
		
	//	08) Click on the info of the theater
		driver.findElement(By.xpath("//div[@class='venue-info-text']")).click();
		
	//	09) Confirm if there is a parking facility in the theater
		String facility = driver.findElement(By.xpath("(//div[@class='facility-text'])[4]")).getText();
		System.out.println("parking facility avilable  "   +   facility);
	//	10) Close the theater popup
	//	11) Click on the first green (available) timing
		driver.findElement(By.xpath("(//div[@class='__details'])[4]")).click();
	//	12) Click Accept
		driver.findElement(By.xpath("//div[text()='Accept']")).click();
	//	13) Choose 1 Seat and Click Select Seats
		driver.findElement(By.xpath("//li[text()='1']")).click();
		//14) Choose any available ticket and Click Pay
		driver.findElement(By.xpath("//table[@class='setmain']/tbody[1]/tr[8]/td[2]/div[4]/a[1]")).click();
		driver.findElement(By.id("btmcntbook")).click();
		//15) Print the sub total
		String subtotal = driver.findElement(By.xpath("//span[text()='Rs.207.14']")).getText();
		System.out.println(subtotal);
		//16) Take screenshot and close browser
		File source = driver.getScreenshotAs(OutputType.FILE);
 		File dest=new File("./snaps/screenshot.png");        
         FileUtils.copyFile(source, dest);
         driver.close();
	}

}
