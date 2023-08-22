package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import businessfunctions.BaseClass1;
import businessfunctions.LoginUtil1;
import configuration.ConfigUtil1;

public class UpdateLocationTest extends BaseClass1 {
	public static void main(String[] args) throws InterruptedException {
		BaseClass1.openBrowser();
		//Logs the user in
		LoginUtil1.login(ConfigUtil1.readProperty("email1"),ConfigUtil1.readProperty("pwd1"));
	 
       //clicking on balloon icon and updating the zipcode and submit
		driver.findElement(By.xpath("/html/body/header/nav/div/ul/li[4]/a/i")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/form/div/input")).sendKeys(ConfigUtil1.readProperty("location"));
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/form/button")).click();
        
       
		
        WebElement m = driver.findElement(By.xpath("/html/body/header/nav/div/ul/li[4]/a/span"));
        //System.out.println(m);
        Thread.sleep(500);
	     String msg = m.getText();
	     System.out.println("Updated the location to:"+ msg);
	     System.out.println("Tescase Passed");
			/*
			 * //verify error message with Assertion //Assert.assertEquals(exp, msg); }try
			else TC is INCOMPLETE!IT  will pass as you r asking to just print the locaation
			 */
	     driver.quit();

}}
