package wee4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ERailApp {

	public static void main(String[] args) {
		/*
		 * 1. Navigate to https://erail.in/
2. Clear(.clear) the text in source and enter (sendkeys("ms",keys.tab))"ms" and tab
3. Clear the text in destination and enter "mdu" and tab
4. Uncheck sort on date(use .click)
5. Get all  the train names and verify whether any duplicate train name is there or not
tips:
Table Class Name :DataTable TrainList TrainListHeader stickyTrainListHeader
//table[contains(@class,'DataTable TrainList')]//tr//td[2]
		 */
		
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("https://erail.in/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.manage().window().maximize();
WebElement from = driver.findElement(By.id("txtStationFrom"));
from.clear();
from.sendKeys("ms",Keys.TAB);
WebElement to=driver.findElement(By.id("txtStationTo"));
to.clear();
to.sendKeys("mdu",Keys.TAB);
driver.findElement(By.id("chkSelectDateOnly")).click();


		
		
	}

}
