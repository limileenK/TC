import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

class UC1login {

	@Test
	//pass
	void TC1001() throws InterruptedException {
		WebDriver driver = null;
		String browser = "chrome";
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Chawakorn Buakaew\\\\Desktop/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\Chawakorn Buakaew\\\\Desktopgeckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.get("http://localhost/alumni/index.php/welcome/index");
	    driver.manage().window().maximize();
	    driver.findElement(By.linkText("เข้าสู่ระบบ")).click();
	    driver.findElement(By.name("idstd")).click();
	    driver.findElement(By.name("idstd")).sendKeys("614259041");
	    {
	      WebElement element = driver.findElement(By.name("login"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    driver.findElement(By.name("password")).sendKeys("123456");
	    driver.findElement(By.name("login")).click();
	    
	    Thread.sleep(4000);
	    
	    String result = driver.findElement(By.id("list")).getText();
	    assertEquals("รายชื่อศิษย์เก่าทั้งหมด",result);
//	    
	    driver.close();
	}
	@Test
	//fail
	void TC1002() throws InterruptedException {
		WebDriver driver = null;
		String browser = "chrome";
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Chawakorn Buakaew\\\\Desktop/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\Chawakorn Buakaew\\\\Desktop/geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.get("http://localhost/alumni/index.php/welcome/index");
	    driver.manage().window().maximize();
	    driver.findElement(By.linkText("เข้าสู่ระบบ")).click();
	    driver.findElement(By.name("idstd")).click();
	    driver.findElement(By.name("idstd")).sendKeys("614259041");
	    {
	      WebElement element = driver.findElement(By.name("login"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    
//	    driver.findElement(By.name("password")).sendKeys("");
	    driver.findElement(By.name("login")).click();
	    String result = driver.findElement(By.id("login")).getText();
	    assertEquals("เข้าสู่ระบบ",result);
	    Thread.sleep(1000);
	    driver.close();
	}

	@Test
	//pass
	void TC1003() throws InterruptedException {
		WebDriver driver = null;
		String browser = "chrome";
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Chawakorn Buakaew\\\\\\\\Desktop/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\\\\\\\Users\\\\\\\\Chawakorn Buakaew\\\\\\\\Desktop/geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.get("http://localhost/alumni/index.php/welcome/index");
	    driver.manage().window().maximize();
	    driver.findElement(By.linkText("เข้าสู่ระบบ")).click();
	    driver.findElement(By.name("idstd")).click();
	    driver.findElement(By.name("idstd")).sendKeys("614259026");
	    {
	      WebElement element = driver.findElement(By.name("login"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    driver.findElement(By.name("password")).sendKeys("123456");
	    driver.findElement(By.name("login")).click();
	    String result = driver.findElement(By.id("list")).getText();
	    Thread.sleep(4000);
	    driver.close();
	    assertEquals("รายชื่อศิษย์เก่าทั้งหมด",result);
	    System.out.print("Login Successfully");
	}
}
