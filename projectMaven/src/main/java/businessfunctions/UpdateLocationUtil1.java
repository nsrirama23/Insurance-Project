package businessfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import configuration.ConfigUtil1;

public class UpdateLocationUtil1 extends BaseClass1 {
	public static void updateLocation() throws InterruptedException {
	
	 //clicking on balloon icon and updating the zipcode and submit
	driver.findElement(By.xpath("/html/body/header/nav/div/ul/li[4]/a/i")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/form/div/input")).sendKeys(ConfigUtil1.readProperty("locationzip"));
    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/form/button")).click();
   
	}
}
