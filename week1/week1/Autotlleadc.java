package assignmentsOfTestleaf.week1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Autotlleadc {

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
		dropdown.findElement(By.linkText("Leads")).click();
		dropdown.findElement(By.linkText("Create Lead")).click();
		dropdown.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
		dropdown.findElement(By.id("createLeadForm_firstName")).sendKeys("Reshma");
		dropdown.findElement(By.id("createLeadForm_lastName")).sendKeys("Y");
		dropdown.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("create the lead for automation");
		String printTitle = dropdown.getTitle();
		System.out.println(printTitle);
		dropdown.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
	//	dropdown.close();
		//dropdown.quit();
	}

}
