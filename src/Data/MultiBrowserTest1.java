package Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MultiBrowserTest1 {

	public static void main(String[] args) {
		
		Xls_Reader d = new Xls_Reader("I:\\testing\\NikulTest.xlsx");
		
		
		String browser = d.getCellData("Data", "Browser", 2);
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


