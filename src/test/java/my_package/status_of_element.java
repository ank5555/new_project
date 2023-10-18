package my_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class status_of_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
	//WebElement searchbox =	driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
	
	//System.out.println("display status"+" "+searchbox.isDisplayed());
	//System.out.println("enabled status"+" "+searchbox.isEnabled());
	
	
	WebElement radio1 = driver.findElement(By.xpath("//input[@id='gender-male']"));
	System.out.println("check status"+" "+radio1.isSelected());
	
	
		radio1.click();
		System.out.println("check status"+" "+radio1.isSelected());
		
		
		
	}

}
