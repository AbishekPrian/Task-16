package SeleniumTask;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program_03 {

			public static void main(String[] args) throws InterruptedException {
				System.setProperty("Webdriver.Chrome.driver", "/Users/abishekprian/Downloads");
				//WebDriver driver = new FirefoxDriver();
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.wikipedia.org/");
				driver.manage().window().maximize();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Artificial Intelligence");
				driver.findElement(By.xpath("//i[@class='sprite svg-search-icon']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/div[21]/a")).click();
				Thread.sleep(5000);
				System.out.println(driver.getTitle());			
				driver.quit();
	}

}