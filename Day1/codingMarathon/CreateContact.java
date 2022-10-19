package codingMarathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch=new ChromeOptions();
	    ch.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(ch);
		//url:https://login.salesforce.com/?locale=in
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	  //username:ramkumar.ramaiah@testleaf.com
		driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com");
		//password:Password#123
		driver.findElement(By.id("password")).sendKeys("Password#123");
		driver.findElement(By.id("Login")).click();
		 //Click on toggle menu button from the left corner
		driver.findElement(By.className("slds-icon-waffle")).click();
		//Click view All and click Sales from App Launcher
		driver.findElement(By.xpath("//button[@class='slds-button']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		WebElement click = driver.findElement(By.xpath("//span[text()='Accounts']"));
		          driver.executeScript("arguments[0].click();", click); 
		                //Click on New button
		          driver.findElement(By.className("forceActionLink")).click();
		        //Enter 'your name' as account name
		          driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Dharshini");	
		          WebElement click1 = driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox__input')])[3] "));
		          driver.executeScript("arguments[0].click();", click1);
		//Select Ownership as Public
		          WebElement click2 = driver.findElement(By.xpath("(//span[text()='Public'])[1]"));
		          driver.executeScript("arguments[0].click();", click2);		          		             
		//click save
		          driver.findElement(By.xpath("//button[text()='Save']")).click();
		        
		//verify message
		          String attribute = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]/a")).getAttribute("title");
		          System.out.println(attribute);
		        if (attribute.contains("Dharshini")) {
		             System.out.println("verfied");
		             }else {
		         System.out.println("not verfied"); }
	}

}
