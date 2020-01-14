package inte.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CiscoSearch {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Files/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.cisco.com/c/en_in/index.html");
		
		driver.findElement(By.xpath("//div[@id='fwt-nav-button-label']")).click();
		
		
		WebElement root1 = driver.findElement(By.tagName("cdc-nav"));
		WebElement shadowRoot1 = expandRootElement(root1);

		WebElement root2 = shadowRoot1.findElement(By.cssSelector("#ProductsServices-tab > cdc-nav-products"));
		WebElement shadowRoot2 = expandRootElement(root2);
		shadowRoot2.findElement(By.cssSelector(
				"#Networking-tab > div.wc-row.wc-halves > div:nth-child(1) > div:nth-child(1) > div > ul > li:nth-child(6) > a"))
				.click();
		String text = driver.findElement(By.xpath("//h1[@id='fw-pagetitle']")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//button[@id='fwt-search-button']")).click();
		
		WebElement search = driver.findElement(By.cssSelector("#fwt-masthead-overlay > cdc-search"));
		
		WebElement s1 = expandRootElement(search);
		
		s1.findElement(By.cssSelector("#swc-search-phrase")).sendKeys(text);
		s1.findElement(By.cssSelector("#swc-search-button")).click();
		driver.quit();

//	driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
//	driver.findElement(By.name("email")).sendKeys("Lakshay@whitebox-learning.com");
//	driver.findElement(By.name("password")).sendKeys("Test@123");
//	driver.findElement(By.xpath("//div[contains(text(),'Login') and @class='ui fluid large blue submit button']")).click();
	}

	public static WebElement expandRootElement(WebElement element) {
		WebElement ele = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot",
				element);
		return ele;
	}
}