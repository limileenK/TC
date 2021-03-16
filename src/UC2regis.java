import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class UC2regis {

	@Test
	//pass
	void TC2001() throws InterruptedException {
		WebDriver driver = null;
		String browser = "chrome";
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chawakorn Buakaew\\Desktop/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Chawakorn Buakaew\\Desktop/geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.get("http://localhost/alumni/index.php");
	    driver.manage().window().maximize();
	    driver.findElement(By.linkText("ลงทะเบียนศิษย์เก่า")).click();
	    driver.findElement(By.id("title")).click();
	    driver.findElement(By.id("title")).click();
	    driver.findElement(By.id("fname")).click();
	    driver.findElement(By.id("fname")).sendKeys("นฤพล");
	    driver.findElement(By.id("lname")).click();
	    driver.findElement(By.id("lname")).sendKeys("สุวรรณวิจิตร");
	    driver.findElement(By.id("idcard")).click();
	    driver.findElement(By.id("idcard")).sendKeys("0254152365984");
	    driver.findElement(By.cssSelector(".custom-control:nth-child(3) > .custom-control-label")).click();
	    driver.findElement(By.id("date")).click();
	    driver.findElement(By.id("date")).sendKeys("1995-02-16");
	    driver.findElement(By.id("job")).click();
	    driver.findElement(By.id("job")).sendKeys("อาจารย์");
	    driver.findElement(By.id("Tel")).click();
	    driver.findElement(By.id("Tel")).sendKeys("0956325474");
	    driver.findElement(By.id("Facebook")).click();
	    driver.findElement(By.id("Facebook")).sendKeys("Naruapon");
	    driver.findElement(By.id("email")).click();
	    driver.findElement(By.id("email")).sendKeys("naruapon@gmail.com");
	    driver.findElement(By.id("password")).click();
	    driver.findElement(By.id("password")).sendKeys("123456");
	    driver.findElement(By.id("House-No")).click();
	    driver.findElement(By.id("House-No")).sendKeys("1");
	    driver.findElement(By.id("Moo-home")).sendKeys("2");
	    driver.findElement(By.id("road-home")).sendKeys("-");
	    driver.findElement(By.id("Province-home")).click();
	    driver.findElement(By.id("Province-home")).sendKeys("กาญจนบุรี");
	    driver.findElement(By.id("Area-home")).click();
	    driver.findElement(By.id("Area-home")).sendKeys("ท่ามะกา");
	    driver.findElement(By.id("Sub-area-home")).click();
	    driver.findElement(By.id("Sub-area-home")).sendKeys("ท่ามะกา");
	    driver.findElement(By.id("Postal-Code-home")).click();
	    driver.findElement(By.id("Postal-Code-home")).sendKeys("70212");
	    driver.findElement(By.id("Tel-home")).click();
	    driver.findElement(By.id("Tel-home")).sendKeys("-");
	    driver.findElement(By.id("Work-No")).click();
	    driver.findElement(By.id("Work-No")).sendKeys("1");
	    driver.findElement(By.id("Moo-work")).sendKeys("1");
	    driver.findElement(By.id("road-work")).sendKeys("-");
	    driver.findElement(By.id("Province-work")).sendKeys("นครปฐม");
	    driver.findElement(By.id("Area-work")).click();
	    driver.findElement(By.id("Area-work")).sendKeys("เมือง");
	    driver.findElement(By.id("Sub-area-work")).click();
	    driver.findElement(By.id("Sub-area-work")).sendKeys("วังตะกู");
	    driver.findElement(By.id("Postal-Code-work")).click();
	    driver.findElement(By.id("Postal-Code-work")).sendKeys("73000");
	    driver.findElement(By.id("Tel-work")).click();
	    driver.findElement(By.id("Tel-work")).sendKeys("-");
	    driver.findElement(By.id("attend")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("attend"));
	      dropdown.findElement(By.xpath("//option[. = '2553']")).click();
	    }
	    driver.findElement(By.id("attend")).click();
	    driver.findElement(By.id("finish")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("finish"));
	      dropdown.findElement(By.xpath("//option[. = '2561']")).click();
	    }
	    driver.findElement(By.id("finish")).click();
	    driver.findElement(By.id("sec")).click();
	    driver.findElement(By.id("sec")).sendKeys("53/54");
	    driver.findElement(By.id("idstd")).click();
	    driver.findElement(By.id("idstd")).sendKeys("536259001");
	    driver.findElement(By.cssSelector(".btn")).click();
	    String result = driver.findElement(By.id("login")).getText();
	    Thread.sleep(4000);
	    driver.close();
	    assertEquals("เข้าสู่ระบบ",result);
	    System.out.print("Regis Successfully");
	}
	@Test
	//fail
	void TC2002() throws InterruptedException {
		WebDriver driver = null;
		String browser = "chrome";
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chawakorn Buakaew\\Desktop/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Chawakorn Buakaew\\Desktop/geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.get("http://localhost/alumni/index.php");
	    driver.manage().window().maximize();
	    driver.findElement(By.linkText("ลงทะเบียนศิษย์เก่า")).click();
	    driver.findElement(By.id("title")).click();
	    driver.findElement(By.id("title")).click();
	    driver.findElement(By.id("fname")).click();
	    driver.findElement(By.id("fname")).sendKeys("นฤพล");
	    driver.findElement(By.id("lname")).click();
	    driver.findElement(By.id("lname")).sendKeys("สุวรรณวิจิตร");
	    driver.findElement(By.id("idcard")).click();
	    driver.findElement(By.id("idcard")).sendKeys("0254152365984");
	    driver.findElement(By.cssSelector(".custom-control:nth-child(3) > .custom-control-label")).click();
	    driver.findElement(By.id("date")).click();
	    driver.findElement(By.id("date")).sendKeys("1995-02-16");
	    driver.findElement(By.id("job")).click();
	    driver.findElement(By.id("job")).sendKeys("อาจารย์");
	    driver.findElement(By.id("Tel")).click();
	    driver.findElement(By.id("Tel")).sendKeys("0956325474");
	    driver.findElement(By.id("Facebook")).click();
	    driver.findElement(By.id("Facebook")).sendKeys("Naruapon");
	    driver.findElement(By.id("email")).click();
	    driver.findElement(By.id("email")).sendKeys("naruapon@gmail.com");
//	    driver.findElement(By.id("password")).click();
//	    driver.findElement(By.id("password")).sendKeys("");
	    driver.findElement(By.id("House-No")).click();
	    driver.findElement(By.id("House-No")).sendKeys("1");
	    driver.findElement(By.id("Moo-home")).sendKeys("2");
	    driver.findElement(By.id("road-home")).sendKeys("-");
	    driver.findElement(By.id("Province-home")).click();
	    driver.findElement(By.id("Province-home")).sendKeys("กาญจนบุรี");
	    driver.findElement(By.id("Area-home")).click();
	    driver.findElement(By.id("Area-home")).sendKeys("ท่ามะกา");
	    driver.findElement(By.id("Sub-area-home")).click();
	    driver.findElement(By.id("Sub-area-home")).sendKeys("ท่ามะกา");
	    driver.findElement(By.id("Postal-Code-home")).click();
	    driver.findElement(By.id("Postal-Code-home")).sendKeys("70212");
	    driver.findElement(By.id("Tel-home")).click();
	    driver.findElement(By.id("Tel-home")).sendKeys("-");
	    driver.findElement(By.id("Work-No")).click();
	    driver.findElement(By.id("Work-No")).sendKeys("1");
	    driver.findElement(By.id("Moo-work")).sendKeys("1");
	    driver.findElement(By.id("road-work")).sendKeys("-");
	    driver.findElement(By.id("Province-work")).sendKeys("นครปฐม");
	    driver.findElement(By.id("Area-work")).click();
	    driver.findElement(By.id("Area-work")).sendKeys("เมือง");
	    driver.findElement(By.id("Sub-area-work")).click();
	    driver.findElement(By.id("Sub-area-work")).sendKeys("วังตะกู");
	    driver.findElement(By.id("Postal-Code-work")).click();
	    driver.findElement(By.id("Postal-Code-work")).sendKeys("73000");
	    driver.findElement(By.id("Tel-work")).click();
	    driver.findElement(By.id("Tel-work")).sendKeys("-");
	    driver.findElement(By.id("attend")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("attend"));
	      dropdown.findElement(By.xpath("//option[. = '2553']")).click();
	    }
	    driver.findElement(By.id("attend")).click();
	    driver.findElement(By.id("finish")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("finish"));
	      dropdown.findElement(By.xpath("//option[. = '2561']")).click();
	    }
	    driver.findElement(By.id("finish")).click();
	    driver.findElement(By.id("sec")).click();
	    driver.findElement(By.id("sec")).sendKeys("53/54");
	    driver.findElement(By.id("idstd")).click();
	    driver.findElement(By.id("idstd")).sendKeys("536259001");
	    driver.findElement(By.cssSelector(".btn")).click();
	    String result = driver.findElement(By.id("regis")).getText();
	    Thread.sleep(4000);
	    driver.close();
	    assertEquals("ลงทะเบียนศิษย์เก่า",result);
	    System.out.print("Regis Successfully");
	}
	@Test
	//pass
	void TC1003() throws InterruptedException {
		WebDriver driver = null;
		String browser = "chrome";
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chawakorn Buakaew\\Desktop/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Chawakorn Buakaew\\Desktop/geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.get("http://localhost/alumni/index.php");
	    driver.manage().window().maximize();
	    driver.findElement(By.linkText("ลงทะเบียนศิษย์เก่า")).click();
	    driver.findElement(By.id("title")).click();
	    driver.findElement(By.id("title")).click();
	    driver.findElement(By.id("fname")).click();
	    driver.findElement(By.id("fname")).sendKeys("ศิวกร");
	    driver.findElement(By.id("lname")).click();
	    driver.findElement(By.id("lname")).sendKeys("รามเรือง");
	    driver.findElement(By.id("idcard")).click();
	    driver.findElement(By.id("idcard")).sendKeys("1234567891234");
	    driver.findElement(By.cssSelector(".custom-control:nth-child(3) > .custom-control-label")).click();
	    driver.findElement(By.id("date")).click();
	    driver.findElement(By.id("date")).sendKeys("1995-02-16");
	    driver.findElement(By.id("job")).click();
	    driver.findElement(By.id("job")).sendKeys("Student");
	    driver.findElement(By.id("Tel")).click();
	    driver.findElement(By.id("Tel")).sendKeys("0993889865");
	    driver.findElement(By.id("Facebook")).click();
	    driver.findElement(By.id("Facebook")).sendKeys("Siwakorn");
	    driver.findElement(By.id("email")).click();
	    driver.findElement(By.id("email")).sendKeys("kong@gmail.com");
	    driver.findElement(By.id("password")).click();
	    driver.findElement(By.id("password")).sendKeys("123456");
	    driver.findElement(By.id("House-No")).click();
	    driver.findElement(By.id("House-No")).sendKeys("1");
	    driver.findElement(By.id("Moo-home")).sendKeys("2");
	    driver.findElement(By.id("road-home")).sendKeys("-");
	    driver.findElement(By.id("Province-home")).click();
	    driver.findElement(By.id("Province-home")).sendKeys("กาญจนบุรี");
	    driver.findElement(By.id("Area-home")).click();
	    driver.findElement(By.id("Area-home")).sendKeys("ท่ามะกา");
	    driver.findElement(By.id("Sub-area-home")).click();
	    driver.findElement(By.id("Sub-area-home")).sendKeys("ท่ามะกา");
	    driver.findElement(By.id("Postal-Code-home")).click();
	    driver.findElement(By.id("Postal-Code-home")).sendKeys("70212");
	    driver.findElement(By.id("Tel-home")).click();
	    driver.findElement(By.id("Tel-home")).sendKeys("-");
	    driver.findElement(By.id("Work-No")).click();
	    driver.findElement(By.id("Work-No")).sendKeys("1");
	    driver.findElement(By.id("Moo-work")).sendKeys("1");
	    driver.findElement(By.id("road-work")).sendKeys("-");
	    driver.findElement(By.id("Province-work")).sendKeys("นครปฐม");
	    driver.findElement(By.id("Area-work")).click();
	    driver.findElement(By.id("Area-work")).sendKeys("เมือง");
	    driver.findElement(By.id("Sub-area-work")).click();
	    driver.findElement(By.id("Sub-area-work")).sendKeys("วังตะกู");
	    driver.findElement(By.id("Postal-Code-work")).click();
	    driver.findElement(By.id("Postal-Code-work")).sendKeys("73000");
	    driver.findElement(By.id("Tel-work")).click();
	    driver.findElement(By.id("Tel-work")).sendKeys("-");
	    driver.findElement(By.id("attend")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("attend"));
	      dropdown.findElement(By.xpath("//option[. = '2553']")).click();
	    }
	    driver.findElement(By.id("attend")).click();
	    driver.findElement(By.id("finish")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("finish"));
	      dropdown.findElement(By.xpath("//option[. = '2561']")).click();
	    }
	    driver.findElement(By.id("finish")).click();
	    driver.findElement(By.id("sec")).click();
	    driver.findElement(By.id("sec")).sendKeys("61/47");
	    driver.findElement(By.id("idstd")).click();
	    driver.findElement(By.id("idstd")).sendKeys("614259048");
	    driver.findElement(By.cssSelector(".btn")).click();
	    String result = driver.findElement(By.id("login")).getText();
	    Thread.sleep(4000);
	    driver.close();
	    assertEquals("เข้าสู่ระบบ",result);
	    System.out.print("Regis Successfully");
	}

}
