package week4.day2Ass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.beust.jcommander.JCommander.Builder;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

 	public static void main(String[] args) throws InterruptedException {
 		//1) Go to https://www.nykaa.com/
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//2) Mouseover on Brands and Search L'Oreal Paris
		WebElement brands = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions builder=new Actions(driver);
		builder.moveToElement(brands).perform();
		driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
		Thread.sleep(2000);
		
//3) Click L'Oreal Paris
		//driver.findElement(By.xpath("//div[@id='scroller-container']/div[4]/a[1]")).click();
	 //driver.findElement(By.xpath("(//div[@class='css-ov2o3v'])[6]")).click();//
		 driver.findElement(By.linkText("L'Oreal Paris")).click();
		 Thread.sleep(2000);
		
				
//4) Check the title contains L'Oreal Paris(Hint-GetTitle)
		System.out.println(driver.getTitle());
		//scrool down
		
		WebElement allproducts = driver.findElement(By.xpath("//span[text()='Makeup'] "));
		Actions builder1=new Actions(driver);
		builder1.scrollToElement(allproducts).perform();
		Thread.sleep(2000);
		
		
//5) Click sort By and select customer top rated
		driver.findElement(By.className("sort-name")).click();
		driver.findElement(By.xpath("(//label[@class='control control-radio'])[4]")).click();
		Thread.sleep(2000);
		
//6) Click Category and click Hair->Click haircare->Shampoo
		driver.findElement(By.id("category")).click();
		Thread.sleep(2000);
		WebElement hair = driver.findElement(By.xpath("//a[text()='hair']"));
		Actions builder2=new Actions(driver);
		builder2.moveToElement(hair).perform();
		//hair.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Shampoo']")).click();
		driver.findElement(By.name("search-suggestions-nykaa")).sendKeys("shampoo",Keys.ENTER);
		//driver.findElement(By.xpath("//div[text()='Nykaa Naturals Onion & Fenugreek Hair Growth Paraben and Sul...']")).click();
		
 	}
}
		
		//scroll down
		//WebElement findElement = driver.findElement(By.xpath("//div[text()='Tresemme Hair Fall Defense Shampoo']"));
		//builder.scrollToElement(findElement).perform();
		//Thread.sleep(2000);
		
//7) Click->Concern->Color Protection
	// driver.findElement(By.xpath("//div[@id='filters-strip']/div[1]/div[1]/div[7]/div[1]/span[1]")).click();
		//Select source=new Select(dropdown);
	//	source.selectByVisibleText("Color Protection");
	//	System.out.println(driver.getTitle());
		//driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		
//driver.findElement(By.xpath("//svg[@class='arrow-icon']")).click();
		
//8)check whether the Filter is applied with Shampoo
		//String text = driver.findElement(By.xpath("//span[text()='Concern']")).getText();
	//	if(text.contains("Color Protection")) {
	//		System.out.println();
		

		
//10) GO to the new window and select size as 175ml
//11) Print the MRP of the product
//12) Click on ADD to BAG
//13) Go to Shopping Bag 
//14) Print the Grand Total amount
//15) Click Proceed
//16) Click on Continue as Guest
//17) Check if this grand total is the same in step 14
//18) Close all windows
 
	
	


