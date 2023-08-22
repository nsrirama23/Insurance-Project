package businessfunctions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;

import configuration.ConfigUtil1;
import pagerepo.LoginPage1;
import pagerepo.RegnPageElements;

public class RegnUtil extends BaseClass1{
	  //LOGIN PAGE ELEMENTS FOR NEW USER REGISTRATION
	  public static void register() {
		  driver.findElement(By.linkText("LOGIN")).click();
		  //check if login page appears 
		  String expectedTitle = "Login / Register | Yes-M"; 
		  try {
		  Assert.assertEquals(expectedTitle, driver.getTitle());
		  System.out.println("Navigated to the Login page"); 
		  } 
		  catch (Throwable pageNavigationError) {
		  System.out.println("Didn't navigate to Login page"); }
		 //REGISTRATION FORM ENTRIES BELOW
		  RegnPageElements.enterEmail(ConfigUtil1.readProperty("email2"));
		  RegnPageElements.enterPassword(ConfigUtil1.readProperty("pwd2"));
		  RegnPageElements.enterFullname(ConfigUtil1.readProperty("fullname"));
		  RegnPageElements.enterMobile(ConfigUtil1.readProperty("mobileno"));
		  RegnPageElements.enterGender(ConfigUtil1.readProperty("gender"));
		 // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		  RegnPageElements.enterdob(ConfigUtil1.readProperty("dob"));
		 // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		  RegnPageElements.enterStreet(ConfigUtil1.readProperty("doorst"));
		 // RegnPageElements.enterlocation(ConfigUtil1.readProperty("location"));
		  RegnPageElements.entercity(ConfigUtil1.readProperty("city"));
		  RegnPageElements.enterstate(ConfigUtil1.readProperty("state"));
		  RegnPageElements.enterzip(ConfigUtil1.readProperty("zip"));
		  //REGISTER BUTTON CLICK
		  RegnPageElements.RegisterbtnClick();
		  
		  
		   
	  }
	  
	  public static void registerneg() {
		  //driver.findElement(By.linkText("LOGIN")).click();
			/*
			 * //check if login page appears String expectedTitle =
			 * "Login / Register | Yes-M"; try { Assert.assertEquals(expectedTitle,
			 * driver.getTitle()); System.out.println("Navigated to the Login page"); }
			 * catch (Throwable pageNavigationError) {
			 * System.out.println("Didn't navigate to Login page"); }
			 */
		 //REGISTRATION FORM ENTRIES BELOW
		  RegnPageElements.enterEmail(ConfigUtil1.readProperty("email1"));
		  RegnPageElements.enterPassword(ConfigUtil1.readProperty("pwd1"));
		  RegnPageElements.enterFullname(ConfigUtil1.readProperty("fullname"));
		  RegnPageElements.enterMobile(ConfigUtil1.readProperty("mobileno"));
		  RegnPageElements.enterGender(ConfigUtil1.readProperty("gender"));
		 // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		  RegnPageElements.enterdob(ConfigUtil1.readProperty("dob"));
		 // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		  RegnPageElements.enterStreet(ConfigUtil1.readProperty("doorst"));
		 // RegnPageElements.enterlocation(ConfigUtil1.readProperty("location"));
		  RegnPageElements.entercity(ConfigUtil1.readProperty("city"));
		  RegnPageElements.enterstate(ConfigUtil1.readProperty("state"));
		  RegnPageElements.enterzip(ConfigUtil1.readProperty("zip"));
		  //REGISTER BUTTON CLICK
		  RegnPageElements.RegisterbtnClick();
		  
		  
		  
		   
	  }
	
}

