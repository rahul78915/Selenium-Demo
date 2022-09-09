package SeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighLightColor {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rahul\\eclipse-workspace\\SeleniumDemo\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://classic.freecrm.com/index.html");// URL
		WebElement LoginBtn=driver.findElement(By.xpath("//input[@type='submit']"));
		Flush(LoginBtn,driver);
	}
		
		public static void Flush(WebElement element,WebDriver driver) {
		JavascriptExecutor js=	((JavascriptExecutor)driver);
		String bgColor=element.getCssValue("backgroundColor");
		for(int i=0;i<10;i++) {
			ChangeColor("rgb(0,200,0)",element,driver);
			ChangeColor(bgColor,element,driver);
			
			
			
		
			
		}
		
	}
		
		public static void drawBorder(WebDriver driver,WebElement element) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript(null, null);
			
		}

public static void ChangeColor(String color,WebElement element,WebDriver driver) {
JavascriptExecutor js=((JavascriptExecutor)driver);
js.executeScript("argument[0].style.backgroundColor = '"+color+"'", element);
}
}
