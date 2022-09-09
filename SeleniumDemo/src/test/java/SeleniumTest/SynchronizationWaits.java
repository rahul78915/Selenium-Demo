package SeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationWaits {
	


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rahul\\eclipse-workspace\\SeleniumDemo\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");// URL
		WebElement email= driver.findElement(By.name("email"));
		Sendskey(driver,email,10,"rahularyanet15@gmail.com");
		

	}
	
	public static void Sendskey(WebDriver driver,WebElement element,int timeout,String Value) {
		new WebDriverWait(driver,timeout).
		until(ExpectedConditions.visibilityOf(element));
//		element.Sendskey(Value);
		
	}
	
	//Explicit wait
	//1. explicit keyword or method
	//2.Available with WebDriver wait some expected condition
	//3.to Specific element
	//4.dynamic in nature
	
	public static void ClickOn(WebDriver driver,WebElement element,int timeout) {
		new WebDriverWait(driver,timeout).
		until(ExpectedConditions.visibilityOf(element));
		element.click();


}
}
