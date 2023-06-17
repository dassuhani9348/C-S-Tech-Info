package AutomationTesting01UI;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.io.Files;

public class Screenshot {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
    }


	public static String browser="chrome";

	 public static void main(String args[]) throws InterruptedException, IOException {

		 ChromeOptions op=new ChromeOptions();
		 op.addArguments ("--remote-allow-origins=*");
		 DesiredCapabilities cp=new DesiredCapabilities(); 
		 cp.setCapability(ChromeOptions.CAPABILITY,op);
		 op.merge(cp);
		 
		 FirefoxOptions opl=new FirefoxOptions();
		 opl.addArguments ("--remote-allow-origins=*"); 
		 DesiredCapabilities cpl=new DesiredCapabilities();
		 cpl.setCapability(FirefoxOptions.FIREFOX_OPTIONS,opl);
		 opl.merge(cpl);

	//click on the Link numberl and take Screenshot
		 if(browser.equals("chrome"))
		 {
			 WebDriver driver=new ChromeDriver(op);
			 Thread.sleep(2000);
			 driver.get("https://www.getcalley.com/page-sitemap.xml");
			 Thread.sleep(2000);
			 driver.manage().window().maximize();
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("a[href='https://www.getcalley.com/blog/\']")).click();
			 Thread.sleep(2000);
			 
			 File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 Thread.sleep(2000);
			 Files.copy(f1, new File("C:\\Users\\ADMIN\\Pictures\\screenshot\\ss1.png"));
			 Thread.sleep(2000);
			 
		//click on the Link number2 and take Screenshot 
			 driver.navigate().back();
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("a[href='https://www.getcalley.com/']")).click();
			 Thread.sleep(2000);
			 File f2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 Thread.sleep(2000);
			 Files.copy(f2, new File("C:\\Users\\ADMIN\\Pictures\\screenshot\\ss2.png"));
			 Thread.sleep(2000);
		//click on the Link number3 and take Screenshot 
			 driver.navigate().back();
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("a[href='https://www.getcalley.com/404-page-not-found/']")).click();
			 Thread.sleep(2000);
			 File f3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 Thread.sleep(2000);
			 Files.copy(f3, new File("C:\\Users\\ADMIN\\Pictures\\screenshot\\ss3.png"));
			 Thread.sleep(2000);
		//click on the Link number4 and take Screenshot 
			 driver.navigate().back();
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("a[href='https://www.getcalley.com/feature-comparison/']")).click();
			 Thread.sleep(2000);
			 File f4=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 Thread.sleep(2000);
			 Files.copy(f4, new File("C:\\Users\\ADMIN\\Pictures\\screenshot\\ss4.png"));
			 Thread.sleep(2000);
		//click on the Link number5 and take Screenshot 
			 driver.navigate().back();
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("a[href='https://www.getcalley.com/why-automatic-call-dialer-software/']")).click();
			 Thread.sleep(2000);
			 File f5=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 Thread.sleep(2000);
			 Files.copy(f5, new File("C:\\Users\\ADMIN\\Pictures\\screenshot\\ss5.png"));
			 Thread.sleep(2000);
			 driver.close();
		//using firefox browser
			 if(browser.equals("firefox"))
			    {
				 WebDriver driver1=new FirefoxDriver(opl);
				 Thread.sleep(2000);
				 driver.get("https://www.getcalley.com/page-sitemap.xml");
				 Thread.sleep(2000);
				 driver.manage().window().maximize();
				 Thread.sleep(2000);
				 driver.findElement(By.cssSelector("a[href='https://www.getcalley.com/blog/\']")).click();
				 Thread.sleep(2000);
				 File f6=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				 Thread.sleep(2000);
				 Files.copy(f6, new File("C:\\Users\\ADMIN\\Pictures\\screenshot\\ss1.png"));
				 Thread.sleep(2000);
				//click on the Link number2 and take Screenshot 
				 driver.navigate().back();
				 Thread.sleep(2000);
				 driver.findElement(By.cssSelector("a[href='https://www.getcalley.com/']")).click();
				 Thread.sleep(2000);
				 File f7=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				 Thread.sleep(2000);
				 Files.copy(f7, new File("C:\\Users\\ADMIN\\Pictures\\screenshot\\ss2.png"));
				 Thread.sleep(2000);
				//click on the Link number3 and take Screenshot 
				 driver.navigate().back();
				 Thread.sleep(2000);
				 driver.findElement(By.cssSelector("a[href='https://www.getcalley.com/404-page-not-found/']")).click();
				 Thread.sleep(2000);
				 File f8=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				 Thread.sleep(2000);
				 Files.copy(f8, new File("C:\\Users\\ADMIN\\Pictures\\screenshot\\ss3.png"));
				 Thread.sleep(2000);
				//click on the Link number4 and take Screenshot 
				 driver.navigate().back();
				 Thread.sleep(2000);
				 driver.findElement(By.cssSelector("a[href='https://www.getcalley.com/feature-comparison/']")).click();
				 Thread.sleep(2000);
				 File f9=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				 Thread.sleep(2000);
				 Files.copy(f9, new File("C:\\Users\\ADMIN\\Pictures\\screenshot\\ss4.png"));
				 Thread.sleep(2000);
				//click on the Link number5 and take Screenshot 
				 driver.navigate().back();
				 Thread.sleep(2000);
				 driver.findElement(By.cssSelector("a[href='https://www.getcalley.com/why-automatic-call-dialer-software/']")).click();
				 Thread.sleep(2000);
				 File f10=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				 Thread.sleep(2000);
				 Files.copy(f10, new File("C:\\Users\\ADMIN\\Pictures\\screenshot\\ss5.png"));
				 Thread.sleep(2000);
				 driver.close();
			    }
		 }
	 }
}
			    
				 
				 
				 
				 
			 
			 
			 
			 
			
			 
			 
			 
			 
			 
		
