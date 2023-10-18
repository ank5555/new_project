package my_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launch_browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		System.out.println("current title of the application is"+" "+driver.getTitle());
		System.out.println("current url of the application is"+" "+driver.getCurrentUrl());
		//System.out.println("Current html code of application is"+" "+driver.getPageSource());
		
		
		
		
		
		
	}

}
