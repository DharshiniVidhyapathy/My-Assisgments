package wee4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.description.ModifierReviewable.OfAbstraction;

public class Ass1Chittorgach {

	private static String text;

	public static void main(String[] args) {
		/*Assignment1:
			============
			1. Launch the URL https://www.chittorgarh.com/
			2. Click on stock market
			3. Click on NSE bulk Deals
			4. Get all the Security names
			5. Ensure whether there are duplicate Security names
			*/

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.chittorgarh.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.id("navbtn_stockmarket")).click();
		driver.findElement(By.linkText("NSE Bulk Deals")).click();
		List<String> lst=new ArrayList<String>();
		List<WebElement> securitynames = driver.findElements(By.xpath("//table[contains(@class,'table table-bordered table-condensed table-striped')]//tr//td[3]"));	
		for (int i = 0; i <securitynames.size() ; i++)
		{
			String text=securitynames.get(i).getText();
			System.out.println(securitynames.get(i).getText());
		 //Actions builder=new Actions(driver);
	      //  builder.scrollToElement(securitynames).perform();
			
		}
		for (int j = 0; j < securitynames.size(); j++) {
			lst.add(text);
						
		}
		
		Set <String>dupset=new HashSet<String>(lst);
		if(lst.size()==dupset.size()) {
			System.out.println("no duplicates");
		
		}
		else {
			System.out.println("Duplicates present");
		}
		
		
	}
}


