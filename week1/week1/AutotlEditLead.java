package assignmentsOfTestleaf.week1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AutotlEditLead {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("guest");
		
		
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.manage().window().maximize();
		//editLead.findElement(By.xpath("//input[@id='username']/ancestor::form")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']/ancestor::form//input[@name='USERNAME']")).sendKeys("demosalesmanager");
		//driver.findElement(By.xpath("//p[@class='top']/input")).sendKeys("demosalesmanager");
		//editLead.findElement(By.xpath("//input[@id='password']/ancestor::form")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//form[@id='login']//input[@id ='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']/parent::p")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]/parent::div")).click();
		driver.findElement(By.xpath("//a[(text()='Leads')]/parent::div")).click();
		driver.findElement(By.xpath("//ul[@class= 'shortcuts']//a[text()='Create Lead']")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Reshma");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Y");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Reshma");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("testing");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("testleaf testing classs");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("Reshma123@gmail.com");
		
		WebElement place = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select list_5 = new Select(place);
		list_5.selectByValue("TX");
		
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		WebElement clear = driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']"));
		clear.clear();
		
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("testing class");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		WebElement title = driver.findElement(By.xpath("//div[@id='sectionHeaderTitle_leads']"));
		String title_1 = title.getText();
		System.out.println("Title    "+ title_1);
		driver.close();
		

		
		
	}

}
