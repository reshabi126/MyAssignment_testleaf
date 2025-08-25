package week1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;


public class Week2Day2 {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver dropdown = new ChromeDriver(options);
		dropdown.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dropdown.get("http://leaftaps.com/opentaps/");
		dropdown.manage().window().maximize();
		dropdown.findElement(By.id("username1")).sendKeys("demosalesmanager");
		dropdown.findElement(By.id("password")).sendKeys("crmsfa");
		dropdown.findElement(By.className("decorativeSubmit")).click();
		dropdown.findElement(By.partialLinkText("CRM")).click();
		dropdown.findElement(By.linkText("Leads")).click();
		dropdown.findElement(By.linkText("Create Lead")).click();
		dropdown.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
		dropdown.findElement(By.id("createLeadForm_firstName")).sendKeys("Reshma");
		dropdown.findElement(By.id("createLeadForm_lastName")).sendKeys("Y");
	//	WebElement sourceDD= dropdown.findElement(By.id("createLeadForm_dataSourceId"));
	//	Select lists = new Select(sourceDD);
	//	lists.selectByIndex(5);
		
		WebElement sourceSS = dropdown.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));
		Select list = new Select(sourceSS);
		list.selectByValue("LEAD_CONFERENCE");
		WebElement industry= dropdown.findElement(By.id("createLeadForm_industryEnumId"));
		Select lists_1 = new Select(industry);
		lists_1.selectByValue("IND_SOFTWARE");
		WebElement ownership = dropdown.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select lists_3 = new Select(ownership);
		lists_3 .selectByVisibleText("Corporation");
		
		dropdown.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
	}

}
