package SeleniumTest;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rahul\\eclipse-workspace\\SeleniumDemo\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.crmpro.com/login.cfm");// URL
	WebElement signUp=	driver.findElement(By.xpath("//input[@type='submit']"));
	drawBroder( driver,signUp);
	GetAlert(driver,"This is the issue with the login button");
		
		
	}

	public static void drawBroder(WebDriver driver,WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("argument[0].style.border=3px solid red", element);
	}
	
	public static void GetAlert(WebDriver driver,String Message) {
	JavascriptExecutor js=	((JavascriptExecutor) driver);
	js.executeScript("alert(" +Message+ ")");
	}
//	//Take Screenshot
//	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	FileUtils.copyFile(src ,new File(""));
}
