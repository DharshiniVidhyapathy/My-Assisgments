package week2.Day1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class CreateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dharshini");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vidhyapathy");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Dharshini");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Selenium");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("The lead will do marketing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("dharshinikumarec@gmail.com");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);

	}

}
