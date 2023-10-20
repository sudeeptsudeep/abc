package selenium_example;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v116.webaudio.WebAudio;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Automation_practice {

	public static void main(String[] args) {
		
		System.setProperty( "WebDriver.chrome.drive", "C:\\Users\\Sudeep T\\Downloads\\chromedriver-win64.zip\\chromedriver-win64");
		WebDriver d=new ChromeDriver();
	
		d.get("file:///C:/Users/Sudeep%20T/Desktop/sudeep/abc.html");
		d.findElement(By.tagName("input")).sendKeys("sudeeep1`");

		//#post-body-3077692503353518311 > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > h2:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(2)
	
	
	}

}


//d.manage().window().maximize();
//d.findElement(By.id("firstName")).sendKeys("sudeep");
//d.findElement(By.id("lastName")).sendKeys("keshav");
//d.findElement(By.id("userEmail")).sendKeys("sudeeptsudeep4@gmail.com");
//d.findElement(By.id("userNumber")).sendKeys("7618780683");
//d.get("https://web.whatsapp.com/");
