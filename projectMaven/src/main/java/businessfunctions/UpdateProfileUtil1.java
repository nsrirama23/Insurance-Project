package businessfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import businessfunctions.BaseClass1;
import configuration.ConfigUtil1;

public class UpdateProfileUtil1 extends BaseClass1{
	
	public static void updateProfile() {
		LoginUtil1.login(ConfigUtil1.readProperty("email1"), ConfigUtil1.readProperty("pwd1"));
	// Click on MyAccount
	driver.findElement(By.xpath("//*[@id=\"dropdown03\"]")).click();
	//Click on My Profile
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
	driver.findElement(By.id("UBtn")).click();
	//You should see a message saying the below phrase 
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
	// verify the message with Assertion
	Assert.assertEquals(exp, msg);
	
	}	
	
}
