package week1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ChromeDriver driver=new ChromeDriver();
		//driver.get("http://leaftaps.com/opentaps/control/main");
		//driver.manage().window().maximize();
	//	String story = driver.getTitle();
		FirefoxDriver driver1 = new FirefoxDriver();
		driver1.get("https://www.facebook.com/");
	    driver1.manage().window().maximize();
		String title = driver1.getTitle();
		System.out.println(title);
		//driver1.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		//WebElement s=driver1.findElement(By.id("pass"));
		//		.sendKeys("Tuna@321");
		//System.out.println(s);
		driver1.findElement(By.xpath("input[@id='email']")).sendKeys("testleaf.2023@gmail.com");
		//driver1.findElement(By.id("pass")).sendKeys("Tuna@321");
		//driver1.findElement(By.xpath()
		driver1.findElement(By.name("login")).click();
		String title1 = driver1.getTitle();
		System.out.println(title1);
		
	}

}
