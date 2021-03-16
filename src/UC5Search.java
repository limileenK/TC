import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.apache.commons.io.FileUtils;

class UC5Search {

	@Test
	//pass
	void TC5001() throws InterruptedException {
		WebDriver driver = null;
		String browser = "chrome";
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chawakorn Buakaew\\Desktop/chromedriver.exe");
			driver = new ChromeDriver();
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
	    String result = driver.findElement(By.id("list")).getText();
	    Thread.sleep(1000);
	    assertEquals("รายชื่อศิษย์เก่าทั้งหมด",result);
	    
	    driver.findElement(By.name("search")).click();
	    driver.findElement(By.name("search")).sendKeys("Siwakorn");
	    driver.findElement(By.name("search")).sendKeys(Keys.ENTER);
	    String result1 = driver.findElement(By.id("name")).getText();
	    Thread.sleep(2000);
	    assertEquals("ชื่อ :นาย ศิวกร รามเรือง",result1);
	    this.takeSnapShot(driver,"C://Users//Chawakorn Buakaew//Desktop//resultSearchbyname.png");
	    driver.close();
	}
	@Test
	//pass
	void TC5002() throws InterruptedException {
		WebDriver driver = null;
		String browser = "chrome";
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chawakorn Buakaew\\Desktop/chromedriver.exe");
			driver = new ChromeDriver();
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
	    String result = driver.findElement(By.id("list")).getText();
	    Thread.sleep(1000);
	    assertEquals("รายชื่อศิษย์เก่าทั้งหมด",result);
	    
	    driver.findElement(By.name("search")).click();
	    driver.findElement(By.name("search")).sendKeys("61/47");
	    driver.findElement(By.name("search")).sendKeys(Keys.ENTER);
	    String result1 = driver.findElement(By.id("name")).getText();
	    Thread.sleep(2000);
	     driver.close();
	    assertEquals("ชื่อ :นาย เมืองแมน สระทองจีน",result1);
	    
	}
	@Test
	//pass
	void TC5003() throws InterruptedException {
		WebDriver driver = null;
		String browser = "chrome";
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chawakorn Buakaew\\Desktop/chromedriver.exe");
			driver = new ChromeDriver();
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
	    String result = driver.findElement(By.id("list")).getText();
	    Thread.sleep(1000);
	    assertEquals("รายชื่อศิษย์เก่าทั้งหมด",result);
	    
	    driver.findElement(By.name("search")).click();
	    driver.findElement(By.name("search")).sendKeys("614259026");
	    driver.findElement(By.name("search")).sendKeys(Keys.ENTER);
	    String result1 = driver.findElement(By.id("name")).getText();
	    Thread.sleep(2000);
	    assertEquals("ชื่อ :นาย ชวกรณ์ บัวแก้ว",result1);
	    
	    driver.close();
	}
	@Test
	//pass
	void TC5004() throws InterruptedException {
		WebDriver driver = null;
		String browser = "chrome";
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chawakorn Buakaew\\Desktop/chromedriver.exe");
			driver = new ChromeDriver();
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
	    String result = driver.findElement(By.id("list")).getText();
	    Thread.sleep(1000);
	    assertEquals("รายชื่อศิษย์เก่าทั้งหมด",result);
	    
	    driver.findElement(By.name("search")).click();
	    driver.findElement(By.name("search")).sendKeys("นครปฐม");
	    driver.findElement(By.name("search")).sendKeys(Keys.ENTER);
	    String result1 = driver.findElement(By.id("name")).getText();
	    Thread.sleep(2000);
	    assertEquals("ชื่อ :นาย เมืองแมน สระทองจีน",result1);
	    
	    driver.close();
	}
	@Test
	//pass
	void TC5005() throws InterruptedException {
		WebDriver driver = null;
		String browser = "chrome";
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chawakorn Buakaew\\Desktop/chromedriver.exe");
			driver = new ChromeDriver();
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
	    String result = driver.findElement(By.id("list")).getText();
	    Thread.sleep(1000);
	    assertEquals("รายชื่อศิษย์เก่าทั้งหมด",result);
	    
	    driver.findElement(By.name("search")).click();
	    driver.findElement(By.name("search")).sendKeys("2554");
	    driver.findElement(By.name("search")).sendKeys(Keys.ENTER);
	    String result1 = driver.findElement(By.id("name")).getText();
	    Thread.sleep(2000);
	    assertEquals("ชื่อ :นาย ดิเรก สุขสรร",result1);
	    
	    driver.close();
	}


	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);

    }

}
