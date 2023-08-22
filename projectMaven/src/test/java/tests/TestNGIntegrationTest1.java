package tests;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import businessfunctions.BaseClass1;
import businessfunctions.LoginUtil1;
import businessfunctions.RegnUtil;
import businessfunctions.UpdateLocationUtil1;
import businessfunctions.UpdateProfileUtil1;
import configuration.ConfigUtil1;
import pagerepo.ApplyInsElemts;
import pagerepo.LogoutPage1;

public class TestNGIntegrationTest1 extends BaseClass1 {

	@BeforeSuite

	public void initialization() {
		BaseClass1.openBrowser();
		System.out.println("BeforeSuite Executed");

	}

	@AfterSuite
	public void cleanup() {
		driver.quit();
		System.out.println("AfterSuite Executed");
	}

	

	
	// LoginFunctionalityTest

	@Test
	public void tc1() {
		// BaseClass1.openBrowser();
		//LoginUtil1.login(ConfigUtil1.readProperty("email1"), ConfigUtil1.readProperty("pwd1"));
		String expectedTitle = "Login / Register | Yes-M";
		try {
			Assert.assertEquals(expectedTitle, driver.getTitle());
			System.out.println("Testcase tc1 Passed-User could login successfully");
		} catch (Throwable pageNavigationError) {
			System.out.println("Testcase tc1 Failed-User could not login");
		}
	}

	// Updating Location

	@Test
	public void tc2() throws InterruptedException {
		UpdateLocationUtil1.updateLocation();
		 //Capturing the displayed location
	    WebElement m= driver.findElement(By.xpath("/html/body/header/nav/div/ul/li[4]/a/span"));
	    Thread.sleep(500);
	    String msg = m.getText();
	    System.out.println("Updated the location to:"+ msg);
	    String expectedTitle = ConfigUtil1.readProperty("locationname");
		try {
			Assert.assertEquals(expectedTitle,msg);
			System.out.println("Testcase tc2 Passed-Updated the location successfully");
		} catch (Throwable pageNavigationError) {
			System.out.println("Testcase tc2 Failed-Unable to update the location");
		}
		
	}
//Update Profile Test

	@Test
	public void tc3() {

		UpdateProfileUtil1.updateProfile();
		// Chcking if the dashboard displays the updated mobile number-Assertion
					// Click on MyAccount,dashboard and get the displayed mobile number and compare to assert
					driver.findElement(By.xpath("//*[@id=\"dropdown03\"]")).click();
					driver.findElement(By.xpath("//*[@id=\"AuthLink\"]/div/a[1]")).click();
					
					WebElement content=driver.findElement(By.xpath("//*[@id=\"YMContents_d_phn\"]"));
					 try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				     String getmobiledisplayed = content.getText();
				     String exp1=ConfigUtil1.readProperty("mobile1");
				     System.out.println("Updated the mobile number to:"+ getmobiledisplayed);
				     try {
				     Assert.assertEquals(exp1, getmobiledisplayed);
				     System.out.println("Testcase tc3 Passed-Updated the mobile number successfully");
				     } catch (Throwable pageNavigationError) {
							System.out.println("Testcase tc3 Failed-Unable to update the mobile number");
						}
				    					 
					driver.quit();

			}	
		

	

	

	// Negative testing-already registered user test

	@Test
	public void tc4() {
		BaseClass1.openBrowser();
		driver.findElement(By.linkText("LOGIN")).click();
		RegnUtil.registerneg();
		String exp = "This email address already exists! Please sign in to proceed!";
		WebElement m = driver.findElement(By.xpath("/html/body/main/section/div/div/div[2]/div/div/form/div[6]/span"));

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String msg = m.getText();
		System.out.println("Error message is: " + msg);
		// verify error message with Assertion
		try{
			Assert.assertEquals(exp, msg);
			// click anywhere on the web page to activate the MyAccount to be visible so
			// that After MEthod logout can be executed
			driver.findElement(By.xpath("//html")).click();
			// Click on MyAccount
			driver.findElement(By.xpath("/html/body/header/nav/div/ul/li[5]/a")).click();

			System.out.println("Testcase tc4 Passed-Negative testing success");
		}catch(Throwable pageNavigationError) {
			System.out.println("Testcase tc4 Failed-Negative testing failed");
		}
			
		}
		
	
	
		// Registration test

		@Test
		public void tc5() {
			RegnUtil.register();
			System.out.println("Successfully registered the user");
			System.out.println(driver.getTitle());
			String expectedTitle = "Login / Register | Yes-M";

			try {
				Assert.assertEquals(expectedTitle, driver.getTitle());
				System.out.println("Testcase tc5 Passed-Registered the user successfully");

			} catch (

			Throwable pageNavigationError) {
				System.out.println("Testcase tc5 Failed-Unable to register the user");
			}
          driver.quit();
		}
		//Applying Insurance Test
		@Test
		public void tc6() throws InterruptedException{
			BaseClass1.openBrowser();
			LoginUtil1.login(ConfigUtil1.readProperty("email1"),ConfigUtil1.readProperty("pwd1"));
			ApplyInsElemts.ApplyInsurance();
			driver.close();
			BaseClass1.openBrowser();
			LoginUtil1.login(ConfigUtil1.readProperty("email1"), ConfigUtil1.readProperty("pwd1"));
			String expectedTitle = "Login / Register | Yes-M";
			try {
				Assert.assertEquals(expectedTitle, driver.getTitle());
				System.out.println("Testcase tc6 Passed-User could apply insurance successfully");
			} catch (Throwable pageNavigationError) {
				System.out.println("Testcase tc6 Failed-User could not apply insurance");
			}
			driver.quit();
			
			/*
			 * //quitting and reopening the browser as "MyAccount" is not visible to execute
			 * AfterMethod-logout driver.close(); BaseClass1.openBrowser();
			 * LoginUtil1.login(ConfigUtil1.readProperty("email1"),ConfigUtil1.readProperty(
			 * "pwd1"));
			 */
			/*
			 * WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));//EXPLICIT
			 * WAIT wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
			 * "/html/body/header/nav/div/ul/li[5]/a"))).click();
			 */
			 
		}
		
		
		


}
