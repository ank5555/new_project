package my_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//find out hom many rows are present in a table
		
		int rows = driver.findElements(By.xpath("//table[@class='navFooterMoreOnAmazon']/tbody/tr")).size();
		System.out.println("the no of rows are"+" "+rows);
		
		
		//how to retrive data or locate data inside table
		
		WebElement link = driver.findElement(By.xpath("//table[@class='navFooterMoreOnAmazon']//tr[3]/td[2]//span[@class='navFooterDescText']/br"));
		link.click();
		
		String str = link.getText();
		System.out.println("link"+" "+str);
		
		
		
		
		
		
		
		
	}

}
