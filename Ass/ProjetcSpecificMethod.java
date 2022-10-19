package week5.Ass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import week6.day1.ReadExcel;

public class ProjetcSpecificMethod {
	RemoteWebDriver driver;//Global variable declaration
	String excelFile;
	@Parameters({"browser","url","username","password"})//2 step
	@BeforeMethod
	public void setup(String browser,String URL, String UserName,String Password){//3 
	if(browser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
	driver.manage().window().maximize();
	driver.get(URL);//4
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.id("username")).sendKeys(UserName);
	driver.findElement(By.id("password")).sendKeys(Password);
	driver.findElement(By.className("decorativeSubmit")).click();
}
	@AfterMethod
public void tearDown() {
	driver.close();
}
	@DataProvider(name="fetchData")
	  public String[][] getData() throws IOException  {
		  String[][] readData = ReadExcel.readData(excelFile);
		return readData;
		  
}

}
