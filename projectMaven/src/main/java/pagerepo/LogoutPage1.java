package pagerepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import businessfunctions.BaseClass1;
//THIS CODE HAS THE ELEMENTS IN LOGOUT PAGE AND LOGOUT FUNCTION

public class LogoutPage1 extends BaseClass1{
	
	//static WebDriver driver=null;
	static By homeIcon=By.xpath("//*[@id=\"navbarCollapse\"]/ul/li[1]/a");
	static By btnIcon=By.linkText("MY ACCOUNT");
	
    static By linkLogout=By.linkText("Logout");

	public static void clickOnIcon() {
		driver.findElement(homeIcon).click();
		driver.findElement(btnIcon).click();
	}
	
	 public static void clickLogout() {
		driver.findElement(linkLogout).click();
	}
}
