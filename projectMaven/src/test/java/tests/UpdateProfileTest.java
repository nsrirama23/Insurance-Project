package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import businessfunctions.BaseClass1;
import businessfunctions.LoginUtil1;
import configuration.ConfigUtil1;

public class UpdateProfileTest extends BaseClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseClass1.openBrowser();
		LoginUtil1.login(ConfigUtil1.readProperty("email1"), ConfigUtil1.readProperty("pwd1"));
		// Click on MyAccount
		driver.findElement(By.xpath("//*[@id=\"dropdown03\"]")).click();
		
		//Click on MyProfile
		driver.findElement(By.xpath("//*[@id=\"AuthLink\"]/div/a[2]")).click();
		// System.out.println((driver.getTitle()));
		String exptitle = "My Profile | Yes-M";
		try {
			Assert.assertEquals(exptitle, driver.getTitle());
			System.out.println("Navigated to MyProfile page");
		} catch (Throwable pageNavigationError) {
			System.out.println("Didn't navigate to correct webpage-Testcase Failed");
		}
		// Clear the already existing mobile number
		WebElement mobilenumField = driver.findElement(By.id("UMobile"));
		mobilenumField.clear();
		// Now updating the mobile number
		mobilenumField.sendKeys(ConfigUtil1.readProperty("mobile1"));

		// Now updating the mobile number
		// driver.findElement(By.id("UMobile")).sendKeys(ConfigUtil1.readProperty("mobile1"));

		driver.findElement(By.id("UBtn")).click();
		String exp = "Profile Updated";
		WebElement m = driver.findElement(By.id("UMsg"));

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String msg = m.getText();
		System.out.println(msg);
		// verify error message with Assertion
		Assert.assertEquals(exp, msg);

		// Chcking if the dashboard displays the updated mobile number
		// Click on MyAccount
		driver.findElement(By.xpath("//*[@id=\"dropdown03\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"AuthLink\"]/div/a[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"YMContents_d_phn\"]"));
		 // String expectedNum = (ConfigUtil1.readProperty("mobile1"));
		driver.getPageSource().contains(ConfigUtil1.readProperty("mobile1"));
		/*
		 * try { Assert.assertEquals(expectedNum, driver.getText());
		 * System.out.println("Navigated to the Login page"); } catch (Throwable
		 * pageNavigationError) {
		 * System.out.println("Didn't navigate to correct webpage"); }
		 */
		driver.quit();
	}

}
