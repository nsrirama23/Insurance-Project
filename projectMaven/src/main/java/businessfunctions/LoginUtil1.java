package businessfunctions;

import org.openqa.selenium.By;
import org.testng.Assert;

import configuration.ConfigUtil1;
import pagerepo.LoginPage1;

public class LoginUtil1 extends BaseClass1{
	
	//LOGIN PAGE FUNCTIONAL USAGE FOR ALREADY REGISTERED USER
 public static void login(String email,String pwd) {
	    driver.findElement(By.linkText("LOGIN")).click();
	//  System.out.println(driver.getTitle());
		  String expectedTitle = "Login / Register | Yes-M"; 
		  try {
		  Assert.assertEquals(expectedTitle, driver.getTitle());
		  //System.out.println("Navigated to the Login page"); 
		  } 
		  catch (Throwable pageNavigationError) {
		  System.out.println("Didn't navigate to correct webpage"); }
		LoginPage1.enterEmail(email);
		LoginPage1.enterPassword(pwd);
		LoginPage1.clickLoginButton();
	}
 public static void loginafterlogout(String email,String pwd) {
	    driver.findElement(By.linkText("LOGIN")).click();
	//  System.out.println(driver.getTitle());
		  String expectedTitle = "Login / Register | Yes-M"; 
		  try {
		  Assert.assertEquals(expectedTitle, driver.getTitle());
		  //System.out.println("Navigated to the Login page"); 
		  } 
		  catch (Throwable pageNavigationError) {
		  System.out.println("Didn't navigate to correct webpage"); }
		LoginPage1.enterEmail(email);
		LoginPage1.enterPassword(pwd);
		LoginPage1.clickLoginButton();
	}
  

	

}
