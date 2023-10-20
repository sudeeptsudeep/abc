package selenium_example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Besent_Assignment {

	public static void main(String[] args) {
		
		System.setProperty( "WebDriver.chrome.drive", "C:\\Users\\Sudeep T\\Downloads\\chromedriver-win64.zip\\chromedriver-win64");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.youtube.com/");
		
	}

}
