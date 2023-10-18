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

public class screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();

driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//TakesScreenshot ts = (TakesScreenshot)driver;
//File src = ts.getScreenshotAs(OutputType.FILE);
// target = new File(".\\Screenshots\\homepage.png");
//FileUtils.copyFile(src, target);

WebElement ele1 = driver.findElement(By.xpath("//div[@id='desktop-grid-1']"));
ele1.click();



File src1 = ele1.getScreenshotAs(OutputType.FILE);
File target1 = new File(".\\Screenshots\\image1.png");
FileUtils.copyFile(src1, target1);

		
		
		
		
		
	}

}
