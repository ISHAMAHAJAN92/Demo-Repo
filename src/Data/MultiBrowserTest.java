package Data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MultiBrowserTest {

	public static void main(String[] args) throws IOException {
		
		FileInputStream f = new FileInputStream("I:\\testing\\prop1.properties");
		Properties prop= new Properties();
		prop.load(f);
		
		String browser = prop.getProperty("browser");
		System.out.println(browser);
		WebDriver driver;
		
		
		if(browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "I:\\SeleniumJars\\geckodriver.exe");
			driver = new FirefoxDriver(); 
		}else if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "I:\\SeleniumJars\\chromedriver.exe");
			driver = new ChromeDriver(); 
		}else {
			System.setProperty("webdriver.safari.driver", "I:\\SeleniumJars\\safaridriver.exe");
			driver = new SafariDriver(); 
		}
		
		
		
		driver.get("https://www.facebook.com/"); 		
		driver.findElement(By.id("email")).sendKeys("sdgsfgdrthdfgdsfahgsdagsdy"); 
		driver.findElement(By.id("pass")).sendKeys("sdgdgsdfhxfgxhtjdfh");
		driver.findElement(By.name("login")).click();


	}

}
