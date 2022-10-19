package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://leafground.com/waits.xhtml");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //find the element
        WebElement visiblity = driver.findElement(By.xpath("(//span[text()='Click'])[1]"));
        visiblity.click();
        //Explicitly wait
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(visiblity));
        String text = driver.findElement(By.xpath("(//span[text()='I am here'])[1]")).getText();
        System.out.println(text);
        WebElement invisibility = driver.findElement(By.xpath("(//span[text()='Click'])[2]"));
        invisibility.click();
        WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait1.until(ExpectedConditions.visibilityOf(invisibility));
        
	}

}
