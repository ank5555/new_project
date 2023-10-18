package my_package;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class javascriptUtil {

	public static void drawBorder(WebElement element , WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
		
	}
	
	public static String getTitleByJS(WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title = js.executeScript("return document.title;").toString();
		return title;
	}
	
	public static void clickElementByJS(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js =((JavascriptExecutor) driver);
				js.executeScript("argument[0].click();", element);
		
	}
	
	
	
	

}
