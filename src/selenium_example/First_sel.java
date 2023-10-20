package selenium_example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class First_sel {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette", " C:\\Users\\Sudeep T\\Downloads\\geckodriver-v0.33.0-win64 (2)");
		System.setProperty( "WebDriver.chrome.drive", "C:\\Users\\Sudeep T\\Downloads\\chromedriver-win64.zip\\chromedriver-win64");
        WebDriver d= new FirefoxDriver();
        //WebDriver d1=new EdgeDriver();
      
        d.get("https://www.facebook.com/");
        
       
        
//        driver.get("file:///C:/Users/Dell/OneDrive/Documents/test.html");
      WebElement e = d.findElement(By.name("email"));
    // WebElement e1 = d.findElement(By.tagName("button"));
//       e.sendKeys("besant");
   e.sendKeys("sudeeptsudeep4@gmail.com");
   
   WebElement e1 = d.findElement(By.name("pass"));
   e1.sendKeys("9945600608");
   
   d.findElement(By.name("login")).click();
  
 
        
        
        
	}

}

