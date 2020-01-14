package inte.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PDFCompare {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "/Users/vedangwhitebox/Desktop/Vedang/New/IntCodes/Files/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	driver.get("https://www.bhhskcrealty.com/");
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/header/div/div[3]/button")).click();
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Lakshay@whitebox-learning.com");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("TalentScreen@6");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.findElement(By.xpath("//div[@class='Avatar-sc-12cxdgc-0 pBksO']")).click();
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div[5]/header/div/div[3]/div[2]/ul/div[2]/button")).click();
	

	//driver.close();
	
	}
}
