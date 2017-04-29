package gmailwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Gmail {

	public static void main(String[] args) {
		try{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Waliq\\Desktop\\selenium-java-3.3.1\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/SignUp");
		driver.manage().window().maximize(); //maximizes the window

		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.findElement(By.xpath(".//*[@id='FirstName']")).sendKeys("Waliq");
		
		driver.findElement(By.xpath(".//*[@id='LastName']")).sendKeys("Mohammad");
		
		driver.findElement(By.xpath(".//*[@id='GmailAddress']")).sendKeys("waliq7860");

		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("iknowhow1");

		driver.findElement(By.xpath(".//*[@id='PasswdAgain']")).sendKeys("iknowhow1");
		
		driver.findElement(By.xpath(".//*[@id='BirthMonth']/div")).click();
		
		driver.findElement(By.xpath(".//*[@id=':2']")).click();
		
		driver.findElement(By.xpath(".//*[@id='BirthDay']")).sendKeys("3");
		
		driver.findElement(By.xpath(".//*[@id='BirthYear']")).sendKeys("1995");
		
		driver.findElement(By.xpath(".//*[@id='Gender']/div")).click();
		
		driver.findElement(By.xpath(".//*[@id=':f']/div")).click();
		
		driver.findElement(By.xpath(".//*[@id='RecoveryPhoneNumber']")).sendKeys("6314567298");

		driver.findElement(By.xpath(".//*[@id='RecoveryEmailAddress']")).sendKeys("waliq23@yahoo.com");
		
		driver.findElement(By.xpath(".//*[@id='submitbutton']")).click();

		
	}catch(Exception e){
		System.out.println(e);
	}
	
	}
}
