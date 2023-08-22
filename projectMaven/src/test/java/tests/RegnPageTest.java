package tests;

import org.testng.Assert;

import businessfunctions.BaseClass1;
import businessfunctions.LoginUtil1;
import businessfunctions.RegnUtil;
import configuration.ConfigUtil1;

public class RegnPageTest extends BaseClass1 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		// BaseClass1 FUNCTION CALLED TO OPEN THE BROWSER
		BaseClass1.openBrowser();
	
		RegnUtil.register();

        System.out.println("Successfully registered the user");
        //Now try logging in with the same user id and password as registered above
        LoginUtil1.login(ConfigUtil1.readProperty("email1"),ConfigUtil1.readProperty("pwd1"));
        String expectedTitle = "Login / Register | Yes-M";
		try {
			Assert.assertEquals(expectedTitle, driver.getTitle());
			System.out.println("Navigated to correct webpage after Login-Testcase Passed");
		} catch (Throwable pageNavigationError) {
			System.out.println("Didn't navigate to correct webpage-Testcase Failed");
		}
      
		// BaseClass1 FUNCTION CALLED TO CLOSE THE BROWSER

		BaseClass1.closeBrowser();

		driver.quit();

	}

}
