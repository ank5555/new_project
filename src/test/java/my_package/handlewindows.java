package my_package;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handlewindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.get("https://www.irctc.co.in/nget/train-search");
driver.manage().window().maximize();
//getWindowHandle

//String str1 = driver.getWindowHandle();
//System.out.println("id of browser"+" "+str1);

//getWindowHandles

WebElement ele1 = driver.findElement(By.xpath("//a[@aria-label='Menu BUSES. Website will be opened in new tab']"));
ele1.click();

Set<String> ids = driver.getWindowHandles();
//iterator method
//Iterator<String> iterate = ids.iterator();
//String id1 = iterate.next();
//String id2 = iterate.next();

//System.out.println("browser1"+" "+id1);
//System.out.println("browser2"+" "+id2);

//list 

List<String> str1 = new ArrayList(ids);
String parent = str1.get(0);
String child = str1.get(1);

System.out.println("parent"+" "+parent);
System.out.println("child"+" "+child);

		
		//driver.switchTo().window(parent);
		//System.out.println("title of parent"+" "+driver.getTitle());
		
		//driver.switchTo().window(child);
		//System.out.println("title of child"+" "+driver.getTitle());
		
		
		//driver.switchTo().window(parent);
		//System.out.println("title of parent"+" "+driver.getTitle());

//for loop

for(String windowids:str1)
{
	String window = driver.switchTo().window(windowids).getTitle();
	System.out.println(window);
	if ( window.equals( "IRCTC Bus - Online Bus Ticket Booking | Bus Reservation"))
	{
		driver.close();
		
	}
	
	
}


		
	}

}
