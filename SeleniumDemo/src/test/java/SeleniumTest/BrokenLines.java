package SeleniumTest;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLines {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rahul\\eclipse-workspace\\SeleniumDemo\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");// URL
		//driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();

		
		//1.get all the links and img
	List<WebElement> linklist=	driver.findElements(By.tagName("a"));
	System.out.println("Get the Size of all the  links"+linklist.size());
		
	linklist.addAll(driver.findElements(By.tagName("img")));
	List<WebElement> activeLinks = new ArrayList<WebElement>();
	
	
	//2.Iterate the linklist: exclude all the links/image does not have any href attribute
	for(int i=0;i<linklist.size();i++) {
		if(linklist.get(i).getAttribute("href")!=null && (!linklist.get(i).getAttribute("href").contains("javascript"))) {
			activeLinks.add(linklist.get(i));
		}
	}
	
	//Get the size of active linklist:
	System.out.println("Get the Size of all the active links"+activeLinks.size());
	
		
	//3. check the href url with connection api
		for(int j=0;j<activeLinks.size();j++) {
		HttpURLConnection connection= (HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();
		connection.connect();
		String reponse=connection.getResponseMessage();
		connection.disconnect();
		
		System.out.println(activeLinks.get(j).getAttribute("href") +"---->"+reponse);
		
		}

	}

}
