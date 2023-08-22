package businessfunctions;

import org.openqa.selenium.By;
import org.testng.Assert;

import configuration.ConfigUtil1;
import pagerepo.LoginPage1;

public class LogoutUtil1 extends BaseClass1{
	
	// FOR ALREADY LOGGED IN USER
 public static void logout() {
	 //LoginUtil1.login(ConfigUtil1.readProperty("email1"),ConfigUtil1.readProperty("pwd1"));
	// Click on MyAccount
	 driver.findElement(By.xpath("//*[@id=\"dropdown03\"]")).click();
	 //Clicks on Logout from dropdown menu
	 driver.findElement(By.xpath("//*[@id=\"AuthLink\"]/div/a[3]")).click();
	 driver.findElement(By.linkText("Logout")).click();
		
	}
  

	

}
