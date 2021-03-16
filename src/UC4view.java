import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;





	class UC4view {

		@Test
		//pass
		void TC4001() throws InterruptedException {
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
			    Thread.sleep(2000);
			    assertEquals("ชื่อ :นาย ชวกรณ์ บัวแก้ว",result1);
		   
		    driver.close();
		}

		@Test
		//pass
		void TC4002() throws InterruptedException {
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
			    String result1 = driver.findElement(By.id("pname")).getText();
			    Thread.sleep(2000);
			    assertEquals("ชื่อ :นาย ศิวกร รามเรือง",result1);
		   
		    driver.close();
		}
		
		@Test
		//pass
		void TC4003() throws InterruptedException {
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
			    String result1 = driver.findElement(By.id("pname")).getText();
			    Thread.sleep(2000);
			    assertEquals("ชื่อ :นาย เมืองแมน สระทองจีน",result1);
		   
		    driver.close();
		}
	}


