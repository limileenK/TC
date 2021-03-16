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

class UC3editprofile {

	@Test
	//pass
	void TC3001() throws InterruptedException {
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

		 driver.get("http://localhost/alumni/index.php");
		    driver.manage().window().setSize(new Dimension(1382, 744));
		    driver.findElement(By.linkText("เข้าสู่ระบบ")).click();
		    driver.findElement(By.name("idstd")).click();
		    driver.findElement(By.name("idstd")).sendKeys("614259026");
		    driver.findElement(By.name("password")).click();
		    {
		      WebElement element = driver.findElement(By.name("login"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element).perform();
		    }
		    driver.findElement(By.name("password")).sendKeys("123456");
		    driver.findElement(By.name("login")).click();
		    {
		      WebElement element = driver.findElement(By.cssSelector(".darken-3"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element).perform();
		    }
		    driver.findElement(By.cssSelector(".darken-3")).click();
		    {
		      WebElement element = driver.findElement(By.tagName("body"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element, 0, 0).perform();
		    }
		    driver.findElement(By.linkText("ข้อมูลส่วนตัว")).click();
		    String result1 = driver.findElement(By.id("pname")).getText();
		    Thread.sleep(5000);
		    assertEquals("ชื่อ :นาย ชวกรณ์ บัวแก้ว",result1);
		    driver.findElement(By.linkText("แก้ไข")).click();
		    driver.findElement(By.id("face")).click();
		    driver.findElement(By.id("face")).click();
		    {
		      WebElement element = driver.findElement(By.id("face"));
		      Actions builder = new Actions(driver);
		      builder.doubleClick(element).perform();
		    }
		    driver.findElement(By.id("face")).sendKeys("kornhuhu");
		    driver.findElement(By.cssSelector(".btn-primary")).click();
		    String result2 = driver.findElement(By.id("face")).getText();
		    Thread.sleep(5000);
		    assertEquals("เฟสบุ๊ค : kornhuhu",result2);
	    driver.close();
	}
	//pass
	@Test
	void TC3002() throws InterruptedException {
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

		 driver.get("http://localhost/alumni/index.php");
		    driver.manage().window().setSize(new Dimension(1382, 744));
		    driver.findElement(By.linkText("เข้าสู่ระบบ")).click();
		    driver.findElement(By.name("idstd")).click();
		    driver.findElement(By.name("idstd")).sendKeys("614259048");
		    driver.findElement(By.name("password")).click();
		    {
		      WebElement element = driver.findElement(By.name("login"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element).perform();
		    }
		    driver.findElement(By.name("password")).sendKeys("123456");
		    driver.findElement(By.name("login")).click();
		    {
		      WebElement element = driver.findElement(By.cssSelector(".darken-3"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element).perform();
		    }
		    driver.findElement(By.cssSelector(".darken-3")).click();
		    {
		      WebElement element = driver.findElement(By.tagName("body"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element, 0, 0).perform();
		    }
		    driver.findElement(By.linkText("ข้อมูลส่วนตัว")).click();
		   
		    driver.findElement(By.linkText("แก้ไข")).click();
		    driver.findElement(By.id("face")).click();
		    driver.findElement(By.id("face")).click();
		    {
		      WebElement element = driver.findElement(By.id("face"));
		      Actions builder = new Actions(driver);
		      builder.doubleClick(element).perform();
		    }
		    driver.findElement(By.id("face")).sendKeys("konghuhu");
		    driver.findElement(By.cssSelector(".btn-primary")).click();
		    String result2 = driver.findElement(By.id("face")).getText();
		    Thread.sleep(5000);
		    assertEquals("เฟสบุ๊ค : Siwakorn konghuhu",result2);
	    driver.close();
	}
	
	@Test
	//pass
	void TC3003() throws InterruptedException {
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

		 driver.get("http://localhost/alumni/index.php");
		    driver.manage().window().setSize(new Dimension(1382, 744));
		    driver.findElement(By.linkText("เข้าสู่ระบบ")).click();
		    driver.findElement(By.name("idstd")).click();
		    driver.findElement(By.name("idstd")).sendKeys("614259041");
		    driver.findElement(By.name("password")).click();
		    {
		      WebElement element = driver.findElement(By.name("login"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element).perform();
		    }
		    driver.findElement(By.name("password")).sendKeys("123456");
		    driver.findElement(By.name("login")).click();
		    {
		      WebElement element = driver.findElement(By.cssSelector(".darken-3"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element).perform();
		    }
		    driver.findElement(By.cssSelector(".darken-3")).click();
		    {
		      WebElement element = driver.findElement(By.tagName("body"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element, 0, 0).perform();
		    }
		    driver.findElement(By.linkText("ข้อมูลส่วนตัว")).click();
		   
		    driver.findElement(By.linkText("แก้ไข")).click();
		    driver.findElement(By.id("face")).click();
		    driver.findElement(By.id("face")).click();
		    {
		      WebElement element = driver.findElement(By.id("face"));
		      Actions builder = new Actions(driver);
		      builder.doubleClick(element).perform();
		    }
		    {
		      WebElement element = driver.findElement(By.cssSelector(".btn-primary"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element).perform();
		    }
		    driver.findElement(By.id("face")).sendKeys("migs");
		    driver.findElement(By.cssSelector(".btn-primary")).click();
		    String result2 = driver.findElement(By.id("face")).getText();
		    Thread.sleep(5000);
		    assertEquals("เฟสบุ๊ค : migs",result2);
	    driver.close();
	}


}
