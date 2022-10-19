package week5.Ass;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import testcase.ProjectSpecificMethod;
import week6.day1.ReadExcel;

public class CreateLead extends  ProjetcSpecificMethod{
@Test(dataProvider ="create" )
public void runCreateLead(String cname,String fname,String lname,String phnum) {
	
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phnum);
	driver.findElement(By.name("submitButton")).click();
}
	

@DataProvider(name="create")
public String[][] getdata() throws IOException {
	String[][] readData = ReadExcel.readData();
	return readData();


}}
