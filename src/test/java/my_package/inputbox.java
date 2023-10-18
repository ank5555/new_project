package my_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class inputbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.in/");

WebElement ele1 = driver.findElement(By.id("twotabsearchtextbox"));
ele1.sendKeys("iphone14");
System.out.println("get the text entered"+" "+ele1.getAttribute("id"));
ele1.clear();

WebElement ele2 = driver.findElement(By.xpath("//label[normalize-space()='Search Amazon.in']"));
System.out.println("get the text entered"+" "+ele2.getText());


	}

}
