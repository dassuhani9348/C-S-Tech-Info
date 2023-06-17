package Automationtest02Functional;
import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FunctionalTestcase {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main (String[]args) throws AWTException, InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.dealsdray.com/");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[text()='Order']")).click();
		driver.findElement(By.xpath("(//span[text()='Orders'])[1]")).click();
	driver.findElement(By.xpath("//button[text()='Add Bulk Orders']")).click();
	File f=new File("./data/demo-data.xlsx");
	String abpath = f.getAbsolutePath();
	driver.findElement(By.xpath("//input[@type='file']")).sendKeys(abpath);
	driver.findElement(By.xpath("//button[text()='Import']")).click();
	driver.findElement(By.xpath("//button[text()='Validate Data']")).click();
	Thread.sleep(2000);
	Alert a = driver.switchTo().alert();
	Thread.sleep(2000);
	a.accept();
	driver.close();
	}
}