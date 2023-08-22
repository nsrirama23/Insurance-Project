package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import businessfunctions.BaseClass1;
import businessfunctions.LoginUtil1;
import configuration.ConfigUtil1;
import pagerepo.LoginPage1;
import pagerepo.LogoutPage1;

public class LoginLogoutPageTest1 extends BaseClass1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//BaseClass1 FUNCTION CALLED TO OPEN THE BROWSER
		BaseClass1.openBrowser();
		// TC001-LOGIN FUNCTIONALITY  TEST
		
		 LoginUtil1.login(ConfigUtil1.readProperty("email1"),ConfigUtil1.readProperty("pwd1"));
		
		// to chk if the correct page is loaded

		String expectedTitle = "Login / Register | Yes-M";
		try {
			Assert.assertEquals(expectedTitle, driver.getTitle());
			System.out.println("Navigated to correct webpage after Login-Testcase Passed");
		} catch (Throwable pageNavigationError) {
			System.out.println("Didn't navigate to correct webpage-Testcase Failed");
		}

		//BaseClass1 FUNCTION CALLED TO CLOSE THE BROWSER
		BaseClass1.closeBrowser();

		driver.quit();

	}

}
