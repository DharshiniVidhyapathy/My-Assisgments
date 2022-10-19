package week4.day2Ass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazonass4 {

	public static void main(String[] args) throws IOException {
		//Assignment:4
		
		//Amazon:
		//1.Load the uRL https://www.amazon.in/
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//2.search as oneplus 9 pro 
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro ",Keys.ENTER);
				
		//3.Get the price of the first product
		String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[4]")).getText();
		System.out.println("1st Moible PRice  "   +   price);
		
		//4. Print the number of customer ratings for the first displayed product
		String customerratings = driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']")).getText();
		System.out.println("No of Customer ratings   "   +  customerratings  );
		
		//5. Mouse Hover on the stars
		WebElement starrating = driver.findElement(By.xpath("//span[@class='a-icon-alt']"));
		Actions builder=new Actions(driver);
		builder.moveToElement(starrating).perform();
		
		//6. Get the percentage of ratings for the 5 star.
		//String ratingper = driver.findElement(By.xpath("//a[@title='48% of reviews have 5 stars']")).getText();
		//System.out.println(ratingper);
		
		//7. Click the first text link of the first image
		driver.findElement(By.xpath("//span[text()='Samsung Galaxy M53 5G (Mystique Green, 6GB, 128GB Storage) | 108MP | sAmoled+ 120Hz | 12GB RAM with RAM Plus | Travel Adapter to be Purchased Separately']")).click();
		
		//8. Take a screen shot of the product displayed
		File source = driver.getScreenshotAs(OutputType.FILE);
		 File dest=new File("./snaps/screenshort.png");
		 FileUtils.copyFile(source, dest);
		 
		//How can i know the second window
	        Set<String> windowHandles = driver.getWindowHandles();//ctrl+2+l
	        System.out.println("How many window open"+windowHandles.size());
		 
		//convert set into list by pass the set value to list as a arg
	        List<String>lstWindow=new ArrayList<String>(windowHandles);
	        		
	        		//how can i get second window
	                //convert set into list by pass the set value to list as a arg
	                List<String>listWindow=new ArrayList<String>(windowHandles);
	                //How to move the control
	                driver.switchTo().window(listWindow.get(1));
	                //print title
	                System.out.println(driver.getTitle());
		
		//9. Click 'Add to Cart' button
		 driver.findElement(By.id("add-to-cart-button")).click();
		 
		//10. Get the cart subtotal and verify if it is correct.
		 driver.findElement(By.xpath("//span[text()=' Cart ']/following::input")).click();
		
		
	}

}
