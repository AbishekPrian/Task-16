package SeleniumTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program_02 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver", "/Users/abishekprian/Downloads");
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		String a = driver.getTitle();
		System.out.println(a);
		Thread.sleep(5000);
		if( a.equals("STORE")) {
			System.out.println("Page landed on correct website");
		}
		else {
			System.out.println("Page not landed on correct page");
		}
		driver.quit();
	}

}
