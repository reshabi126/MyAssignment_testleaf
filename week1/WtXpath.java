package week1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class WtXpath {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver xpth = new ChromeDriver(options);
		xpth.get("http://leaftaps.com/opentaps/");
		xpth.manage().window().maximize();
		
		xpth.findElement(By.xpath("//input[@id ='username'] ")).sendKeys("demosalesmanager");
		xpth.findElement(By.xpath("(//input[@class ='inputLogin'])[2]")).sendKeys("crmsfa");
		xpth.findElement(By.xpath("//input[contains(@class,'decorativeSubmit')]")).click();
		xpth.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		xpth.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		xpth.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		WebElement sourceSS = xpth.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));
		Select list = new Select(sourceSS);
		list.selectByValue("LEAD_CONFERENCE");
		WebElement industry = xpth.findElement(By.xpath("//select[@id='createLeadForm_industryEnumId']"));
		Select list1 = new Select(industry);
		list1.selectByVisibleText("Computer Software");
		WebElement ownerShip = xpth.findElement(By.xpath("//select[@id='createLeadForm_ownershipEnumId']"));
		Select list2 = new Select(ownerShip);
		list2.selectByIndex(4);
		
		
	}

}
