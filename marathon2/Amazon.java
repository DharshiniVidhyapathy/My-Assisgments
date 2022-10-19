package marathon2;

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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws IOException {
		//01) Launch Chrome
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
				
		//02) Load https://www.amazon.in/
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));		
		
		//03) Type "Bags" in the Search box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys",Keys.ENTER);		
		
		//04) Choose the displayed item in the result with bags for boys
		
		
		//05) Print the total number of results (like 30000)
		String noofresults = driver.findElement(By.xpath("//span[text()='1-48 of over 30,000 results for']")).getText();
		String s= noofresults;
		int length=s.length();
		String[] split=s.split(" ");
		System.out.println(noofresults);
		System.out.println(split[3]);
		   // 1-48 of over 30,000 results for "bags for boys"
		
		//06) Select the first 2 brands in the left menu
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		
		 //   (like American Tourister, Generic)
		
		//07) Confirm the results have got reduced like 5000 &30,000     (use step 05 for compare)
		String noofresults2 = driver.findElement(By.xpath("//span[text()='1-48 of over 5,000 results for']")).getText();
		String s2= noofresults2;
		int length2=s2.length();
		String[] split2=s2.split(" ");
		System.out.println(noofresults2);
		System.out.println(split2[3]);
		if(split[3]==split2[3])
		{
			System.out.println("count is reduced");
		}
		else {
			System.out.println("count is reduced");
		}
		//08) Choose New Arrivals (Sort)
		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		
		//09) Print the first resulting bag info (name, discounted price)
		//driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']")).click();
		String Title = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']")).getText();
		System.out.println("Title of the product is"    +   Title);
		String discount = driver.findElement(By.xpath("//span[text()='(73% off)']")).getText();
		System.out.println("Discount of the product is"   +   discount   );
		//10) Take screenshot and close
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snaps/screenshot.png");        
        FileUtils.copyFile(source, dest);
        driver.close();


		
	}

}
