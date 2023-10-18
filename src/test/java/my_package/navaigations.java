package my_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class navaigations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://www.snapdeal.com/");
driver.get("https://www.amazon.in/");

driver.navigate().back(); // back button takes back to previous page/application
driver.navigate().forward();
driver.navigate().refresh();



	}

}
