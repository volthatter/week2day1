package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverSelenium {


    public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	String text = driver.findElement(By.tagName("h2")).getText();
	System.out.println(text);
	driver.findElement(By.linkText("CRM/SFA")).click();
	String title = driver.getTitle();
	System.out.println(title);

	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("leaftest");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("mathavan");
	driver.findElement(By.id("createLeadForm_dataSourceId")).sendKeys("employee");
	driver.findElement(By.id("createLeadForm_dataSourceId")).sendKeys("600053");			
	driver.close();			

	
	
}


}
