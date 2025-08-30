package assignmentsOfTestleaf.week1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoFaceLogin {

	public static void main(String[] args) {
		
		ChromeDriver login = new ChromeDriver();
		login.get("https://en-gb.facebook.com/");
		login.manage().window().maximize();
		
		login.findElement(By.xpath("//a[text()='Create new account']")).click();
		login.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("Reshma");
		login.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Y");
		WebElement birthday = login.findElement(By.xpath("//select[@id ='day']"));
		Select birday = new Select(birthday);
		birday.selectByValue("12");
		WebElement birmonth = login.findElement(By.xpath("//select[@id='month']"));
		Select bimonth = new Select(birmonth);
		bimonth.selectByVisibleText("Jun");
		WebElement biyear = login.findElement(By.xpath("//select[@id ='year']"));
		Select biryear = new Select(biyear);
		biryear.selectByValue("2000");
		login.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("resabi126@gmail.com");
		login.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Yogasrly@");
		login.findElement(By.xpath("//input[@value='1']")).click();
		//login.findElement(By.xpath)By
	
	}
}
