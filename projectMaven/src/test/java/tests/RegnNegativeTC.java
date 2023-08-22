package tests;
import org.testng.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import businessfunctions.BaseClass1;
import businessfunctions.LoginUtil1;
import businessfunctions.RegnUtil;
import configuration.ConfigUtil1;

public class RegnNegativeTC extends BaseClass1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BaseClass1.openBrowser();
		RegnUtil.registerneg();
		 String exp ="This email address already exists! Please sign in to proceed!";
		 WebElement m = driver.findElement(By.xpath("/html/body/main/section/div/div/div[2]/div/div/form/div[6]/span"));
	     
	      try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      String msg = m.getText();
	      System.out.println("Error message is: "+ msg);
	      //verify error message with Assertion
	      Assert.assertEquals(exp, msg);
	      driver.quit();

	}

}
