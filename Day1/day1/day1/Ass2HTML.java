package wee4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ass2HTML {

	public static void main(String[] args) {
		
		/*
		 * Assignment2:
============
1. Launch the URL https://html.com/tags/table/
2. Get the count of number of rows
3. Get the count of number of columns

		 */
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://html.com/tags/table/");
		
		List <WebElement>rowcount = driver.findElements(By.xpath("(//table//tbody)[1]"));
		 System.out.println("The row count is"+rowcount.size());
		 
		 List <WebElement>columncount = driver.findElements(By.xpath("(//table//tr[1]/td)[1]"));
	System.out.println("The column count is "+columncount.size());
	
	
	List<WebElement> text=driver.findElements(By.xpath("(//table//tr[2])[1]"));
for (int i = 0; i <text.size(); i++) {
	System.out.println(text.get(i).getText());
}
	}

}
