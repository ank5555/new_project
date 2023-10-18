package my_package;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javascriptexecutor {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//border and screenshot
		
		WebElement ele1 = driver.findElement(By.xpath("//div[@id='desktop-grid-1']"));
		javascriptUtil.drawBorder(ele1, driver);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(".\\Screenshots\\image4.png");
	    FileUtils.copyFile(src, trg);
	    
		
		//get title of webpage
	    
	   String title =  javascriptUtil.getTitleByJS(driver);
	    System.out.println(title);
	    
	    //click action
	    
	    WebElement link = driver.findElement(By.xpath("//a[normalize-space()='Sell']"));
	    javascriptUtil.clickElementByJS(link, driver);
	    
	    
		
		
	}

}
