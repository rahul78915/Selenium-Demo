package SeleniumTest;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashMapInSelenium {
	
	
	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\rahul\\eclipse-workspace\\SeleniumDemo\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//		driver.get("https://www.crmpro.com/login.cfm");
//		driver.findElement(By.name("username")).sendKeys("rahularaynet15@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("rahul1105@");
		System.out.println(getCredentialMap());
	
	}
	
	public static HashMap getCredentialMap() {
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("Customer", "Rahul:Test@123");
		hm.put("Admin", "Anurag:Test@14563");
		hm.put("Customer Care", "RahulSinha:Test2345@123");
		return hm;
		
	}


}
