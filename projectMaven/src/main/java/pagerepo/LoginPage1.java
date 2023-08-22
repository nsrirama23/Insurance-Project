package pagerepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import businessfunctions.BaseClass1;


//IN THIS CODE WE R IDENTIFYING THE LOCATORS FOR ELEMNTS IN LOGIN PAGE
public class LoginPage1 extends BaseClass1{
	//static WebDriver driver=null;
	static By txtEmail=By.name("LEmail");
	static By txtPassword=By.name("LPwd");
	static By btnLogin=By.xpath( "/html/body/main/section/div/div/div[1]/div/div/form/div[3]/button");
	
	
	public static void enterEmail(String mailid) {
		
		driver.findElement(txtEmail).sendKeys(mailid);
	}
	
    public static void enterPassword(String paswd) {
		
		driver.findElement(txtPassword).sendKeys(paswd);
	}
	
    public static void clickLoginButton() {
		
		driver.findElement(btnLogin).click();
	}


}
