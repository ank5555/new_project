package my_package;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autosuggestDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://www.amazon.in/");

WebElement ele1 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
ele1.click();
ele1.sendKeys("iphone");

List<WebElement> list = driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']//span"));
System.out.println("size of listbox"+" "+list.size());





for(WebElement opt : list)
{
	if(opt.getText().contains("iphone 15 pro max"))
	{
		opt.click();
		break;
	}
}

	}

}
