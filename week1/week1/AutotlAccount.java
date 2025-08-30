package assignmentsOfTestleaf.week1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutotlAccount {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver dropdown = new ChromeDriver(options);

		dropdown.get("http://leaftaps.com/opentaps/");
		dropdown.manage().window().maximize();
		dropdown.findElement(By.id("username")).sendKeys("demosalesmanager");
		dropdown.findElement(By.id("password")).sendKeys("crmsfa");
		dropdown.findElement(By.className("decorativeSubmit")).click();
		dropdown.findElement(By.partialLinkText("CRM")).click();
		dropdown.findElement(By.linkText("Accounts")).click();
		dropdown.findElement(By.linkText("Create Account")).click();
		dropdown.findElement(By.xpath("//input[@id ='accountName']")).sendKeys("Rryaa");
		dropdown.findElement(By.xpath("//textarea[@name ='description']")).sendKeys("Selenium Automation Tester");
		dropdown.findElement(By.xpath("//input[@id ='numberEmployees']")).sendKeys("15246");
		dropdown.findElement(By.xpath("//input[@id ='officeSiteName']")).sendKeys("leafTaps");
		dropdown.findElement(By.xpath("//input[@value ='Create Account']")).click();
		
		WebElement header = dropdown.findElement(By.xpath("//div[@id='sectionHeaderTitle_accounts']"));
		String title = header.getText();
		System.out.println(title);
		//String printTitle1 = dropdown.getTitle();
	//	System.out.println(printTitle1);
	  // dropdown.close();
		
		
		

	}

}
