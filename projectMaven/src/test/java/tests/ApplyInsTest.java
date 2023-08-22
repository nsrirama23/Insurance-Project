package tests;

import org.testng.Assert;

import businessfunctions.BaseClass1;
import businessfunctions.LoginUtil1;
import configuration.ConfigUtil1;
import pagerepo.ApplyInsElemts;

public class ApplyInsTest extends BaseClass1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		BaseClass1.openBrowser();
		LoginUtil1.login(ConfigUtil1.readProperty("email1"),ConfigUtil1.readProperty("pwd1"));
        ApplyInsElemts.ApplyInsurance();
        String expectedTitle = "Apply for Life Insurance | Yes-M";
		
		  Assert.assertEquals(expectedTitle, driver.getTitle());
		  System.out.println("Navigated to correct webpage after appying the insurance-Testcase Passed" );
			/*
			 * } catch (Throwable pageNavigationError) {
			 * System.out.println("Didn't navigate to correct webpage-Testcase Failed"); }
			 */
      
		

		

		//driver.quit();

	}

        
	}


