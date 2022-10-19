package week4.day2Ass;

import java.awt.Desktop.Action;
import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.mongodb.MapReduceCommand.OutputType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {
	// 1. Launch https://www.snapdeal.com/
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//2. Go to Mens Fashion
		WebElement mensfashion = driver.findElement(By.linkText("Men's Fashion"));
		Actions builder=new Actions(driver);
		builder.moveToElement(mensfashion).perform();
//3. Go to Sports Shoes
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		
//4. Get the count of the sports shoes
		String text = driver.findElement(By.xpath("//div[@class='child-cat-count ']")).getText();
		System.out.println( "total no of shoes" +  text);
		
//5. Click Training shoes
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		Thread.sleep(4000);
//6. Sort by Low to High
		driver.findElement(By.xpath("//div[@class='sort-drop clearfix']")).click();
		String text2 = driver.findElement(By.xpath("(//li[@data-index='1'])[2]")).getText();
//7. Check if the items displayed are sorted correctly
		if(text2.contains("Low to High")) {
			System.out.println("Displayed items are correct");
		}
		else {
			System.out.println("Displayed items are wrong");
		}
		
//8.Select the price range (900-1200)
		Thread.sleep(4000);
		driver.findElement(By.name("fromVal")).clear();
		driver.findElement(By.name("fromVal")).sendKeys("500",Keys.ENTER);
		driver.findElement(By.name("toVal")).clear();
		Thread.sleep(4000);
		driver.findElement(By.name("toVal")).sendKeys("1200",Keys.ENTER);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[contains(@class,'price-go-arrow btn')]")).click();
		//9.Filter with color Navy
		//driver.findElement(By.xpath("//label[@for='Color_s-Navy']")).click();
		
		
//10 verify the all applied filters 
//11. Mouse Hover on first resulting Training shoes
		WebElement findElement = driver.findElement(By.xpath("//img[@class='product-image wooble"));
		builder.moveToElement(findElement).perform();
		Thread.sleep(4000);
//12. click QuickView button
		driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();
		
//13. Print the cost and the discount percentage
		String cost= driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		System.out.println("cost of the product "  + cost);
		String dicount = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println("discount for the product  "   + dicount  );
		Thread.sleep(4000);
		//14. Take the snapshot of the shoes.
	 driver.getScreenshotAs(OutputType.FILE)			
	 File dens= new File("./snaps/shoes.png");
        FileUtils.copyFile(src, dens);
//15. Close the current window
        driver.findElement(By.xpath("(//i[@class='sd-icon sd-icon-delete-sign'])[3]")).click();
        Thread.sleep(2000);
		
//16. Close the main window
        driver.close();
	 

	
		
	}

}
