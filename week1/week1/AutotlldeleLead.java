package assignmentsOfTestleaf.week1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutotlldeleLead {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("guest");
		
		
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='password']/ancestor::form//input[@name='USERNAME']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//form[@id='login']//input[@id ='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']/parent::p")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]/parent::div")).click();
		driver.findElement(By.xpath("//a[(text()='Leads')]/parent::div")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[@class='x-tab-strip-inner']//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//div[@class='x-plain-body x-plain-body-noheader x-plain-body-noborder']//input[@name='phoneCountryCode']")).sendKeys("91");
		driver.findElement(By.xpath("//div[@class='x-plain-body x-plain-body-noheader x-plain-body-noborder']//input[@name='phoneAreaCode']")).sendKeys("91");
		driver.findElement(By.xpath("//div[@class='x-plain-body x-plain-body-noheader x-plain-body-noborder']//input[@name='phoneNumber']")).sendKeys("9876543210");
		
		driver.findElement(By.xpath("//td[@class='x-btn-center']//button[text()='Find Leads']")).click();

		


	}

}
