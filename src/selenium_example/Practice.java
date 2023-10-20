package selenium_example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice {

	public static void main(String[] args) {
//        snytax = //tagname[@attribute name = 'attribute value']

//		  System.setProperty("WebDriver.gecko.drver"," C:\\Users\\Sudeep T\\Downloads\\geckodriver-v0.33.0-win64 (2)\\geckodriver-v0.33.0-win64");

//        WebDriver d1=new FirefoxDriver();
//        System.setProperty(" WebDriver.edge.driver" ," C:\\Users\\Sudeep T\\Downloads\\edgedriver_win64");
//        WebDriver d2=new EdgeDriver();
        
		System.setProperty( "WebDriver.chrome.drive",
	    "C:\\Users\\Sudeep T\\Downloads\\chromedriver-win64.zip\\chromedriver-win64");
		
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.findElement(By.name("email")).sendKeys("sudeeptsudeep4gamil.com");
		d.findElement(By.id("passContainer")).sendKeys("9945600608");

	
	
	
	
	
	
	
	}
	
	

}
