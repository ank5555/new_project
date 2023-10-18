package my_package;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datepicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://www.irctc.co.in/nget/train-search");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

String date = "16";
String month = "December";
String year = "2023";


WebElement calender = driver.findElement(By.xpath("//p-calendar[@id='jDate']"));
calender.click();

while(true)
{
	String month1 = driver.findElement(By.xpath("//span[@class='ui-datepicker-month ng-tns-c58-10 ng-star-inserted']")).getText();
	String year1 = driver.findElement(By.xpath("//span[@class='ui-datepicker-year ng-tns-c58-10 ng-star-inserted']")).getText();
	if(month1.equals(month) && year1.equals(year))
	{
	
	break;
	}
		
	else
	{
		 driver.findElement(By.xpath("//span[@class='ui-datepicker-next-icon pi pi-chevron-right ng-tns-c58-10']")).click();
		 
		
	}
}

//date selection

List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar ng-tns-c58-10']//td"));

for(WebElement date1: alldates)
{
	String date11 = date1.getText();
	if(date11.equals(date))
	{
		date1.click();
		break;
	
	}
}

		
		
		
		
		
	}

}
