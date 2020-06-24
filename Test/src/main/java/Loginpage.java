
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage {
	
	public static void main(String[] args) throws Exception {
		
	// Admin >> User Management >> Ports
		
			System.setProperty("webdriver.chrome.driver", "E:\\Jibeworkspace\\src\\main\\resources\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
			driver.get("https://j2-qc.jibe.solutions/QC1/Infrastructure/dashboard.aspx");
			driver.findElement(By.id("ctl00_MainContent_LoginUser_UserName")).sendKeys("sudhirp");
			driver.findElement(By.id("ctl00_MainContent_LoginUser_Password")).sendKeys("Jibe@12345");
			driver.findElement(By.id("ctl00_MainContent_LoginUser_LoginButton")).click();
			Thread.sleep(2000);
			
			
		}
}