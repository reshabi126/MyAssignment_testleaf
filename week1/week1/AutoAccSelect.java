package assignmentsOfTestleaf.week1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AutoAccSelect {

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
		dropdown.findElement(By.xpath("//input[@id ='accountName']")).sendKeys("Kutty2");
	//	String value=eleAcctNme.getText();
	//	System.out.println("T "+value);
		dropdown.findElement(By.xpath("//textarea[@name ='description']")).sendKeys("Selenium Automation Tester");
		
		WebElement industry= dropdown.findElement(By.xpath("//select[@name ='industryEnumId']"));
		Select lists_1 = new Select(industry);
		lists_1.selectByValue("IND_SOFTWARE");
		
		WebElement ownership = dropdown.findElement(By.xpath("(//select[@class ='inputBox'])[3]"));
		Select lists_2 = new Select(ownership);
		lists_2 .selectByVisibleText("S-Corporation");
		
		WebElement sourcess= dropdown.findElement(By.xpath("(//select[@class ='inputBox'])[4]"));
		Select lists_3 = new Select(sourcess);
		lists_3.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marketing= dropdown.findElement(By.xpath("//select[@id='marketingCampaignId']"));
		Select lists_4 = new Select(marketing);
		lists_4.selectByIndex(6);
		
		
		WebElement place = dropdown.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
		Select list_5 = new Select(place);
		list_5.selectByValue("TX");
		dropdown.findElement(By.xpath("//input[@value ='Create Account']")).click();
		
		WebElement printAcc = dropdown.findElement(By.xpath("//span[text()='Account Name']/ancestor::tr//span[@class='tabletext']"));
		String printAccN = printAcc.getText();
		System.out.println(printAccN);
		dropdown.close();

		
	}

}
