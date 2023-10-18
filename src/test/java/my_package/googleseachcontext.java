package my_package;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class googleseachcontext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://www.google.com/");
WebElement ele1 = driver.findElement(By.name("q"));
ele1.click();
ele1.sendKeys("java tutorial");

List<WebElement> list = driver.findElements(By.xpath("//li[@class='sbct']//div[@role='option']//span"));
System.out.println("size"+" "+list.size());

for(WebElement opt:list)
{
	if(opt.getText().contains("java tutorial for beginners"))
	{
		opt.click();
		break;
	}
}



	}

}
