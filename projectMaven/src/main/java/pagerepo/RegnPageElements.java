package pagerepo;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;

import businessfunctions.BaseClass1;

public class RegnPageElements extends BaseClass1 {
	static By txtEmail = By.name("REmail");
	static By txtPassword = By.name("RPwd");
	static By txtFullName = By.name("RName");
	static By mobileNumber = By.name("RMobile");
	//static By gender = By.xpath("//*[@id=\"RForm\"]/div[3]/div[1]/div[1]/label");
	static By gender= By.xpath("/html/body/main/section/div/div/div[2]/div/div/form/div[3]/div[1]/div[1]/label");
	static By dob = By.name("RDob");
	static By doornoStreetname = By.name("RAddress_1");
	static By location = By.name("RAddress_2");
	static By city = By.xpath("//*[@id=\"RCity\"]");
	static By state = By.xpath("//*[@id=\"RState\"]");
	static By zip = By.xpath("//*[@id=\"RZip\"]");

	public static void enterEmail(String mailid) {
		driver.findElement(txtEmail).sendKeys(mailid);
	}

	public static void enterPassword(String passwd) {

		driver.findElement(txtPassword).sendKeys(passwd);
	}

	public static void enterFullname(String fullname) {

		driver.findElement(txtFullName).sendKeys(fullname);
	}

	public static void enterMobile(String mobileno) {

		driver.findElement(mobileNumber).sendKeys(mobileno);
	}

	public static void enterGender(String Gender) {

		driver.findElement(gender).click();
	}

	public static void enterdob(String dateOfBirth) {

		driver.findElement(dob).sendKeys(dateOfBirth);
	}

	public static void enterStreet(String streetadd) {

		driver.findElement(doornoStreetname).sendKeys(streetadd);
	}

	public static void enterlocation(String loc) {

		driver.findElement(location).sendKeys(loc);
	}

	public static void entercity(String city1) {

		driver.findElement(city).sendKeys(city1);
	}

	public static void enterstate(String state1) {

		driver.findElement(state).sendKeys(state1);
	}

	public static void enterzip(String zip1) {

		driver.findElement(zip).sendKeys(zip1);
	}
	
	//REGISTER BUTTON CLICK
	  public static void RegisterbtnClick() {
	  driver.findElement(By.xpath("/html/body/main/section/div/div/div[2]/div/div/form/div[6]/button")).click(); }
	 

}
