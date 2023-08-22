package businessfunctions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import configuration.ConfigUtil1;
import pagerepo.LogoutPage1;


public class BaseClass1 {
	public static WebDriver driver=null;
	
	public static void openBrowser() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(ConfigUtil1.readProperty("url"));
		
	}
	public static void closeBrowser(){
		LogoutPage1.clickOnIcon();
		LogoutPage1.clickLogout();
		
	}
	

}
