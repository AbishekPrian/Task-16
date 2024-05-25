package SeleniumTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_01 {

	public static void main(String[] args) throws Exception {
		System.setProperty("Webdriver.Chrome.driver", "/Users/abishekprian/Downloads");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh();
		driver.close();
		
		
	}

}
