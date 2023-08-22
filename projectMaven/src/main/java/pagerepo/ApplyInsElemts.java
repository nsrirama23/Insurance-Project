package pagerepo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.WebDriver;

import org.testng.Assert;

import businessfunctions.BaseClass1;
import configuration.ConfigUtil1;

public class ApplyInsElemts extends BaseClass1 {

	static By Insurance = By.xpath("/html/body/header/nav/div/ul/li[2]/a");
	static By dob = By.name("LQDob");
	static By gender = By.xpath("//*[@id=\"LQForm\"]/div[3]/div[1]/div[1]/label");
	static By Height = By.name("LQHeightF");
	static By Inches = By.name("LQHeightI");
	static By Weight = By.name("LQWeight");
	static By zip = By.id("LQZip");

	public static void ApplyInsurance() throws InterruptedException {
		driver.findElement(Insurance).click();
		driver.findElement(By.linkText("Apply Life Insurance")).click();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		Select insurance = new Select(driver.findElement(By.name("ctl00$YMContents$LQCoverage")));
		insurance.selectByValue("25000");
		// Thread.sleep(500);
		driver.findElement(zip).sendKeys(ConfigUtil1.readProperty("zip"));
		driver.findElement(dob).sendKeys(ConfigUtil1.readProperty("dob"));
		driver.findElement(gender).click();
		driver.findElement(Height).sendKeys(ConfigUtil1.readProperty("height"));
		driver.findElement(Inches).sendKeys(ConfigUtil1.readProperty("inches"));
		driver.findElement(Weight).sendKeys(ConfigUtil1.readProperty("weight"));
		//Two radio buttons
		driver.findElement(By.xpath("/html/body/main/section/div/div/div[2]/div/div/form/div[4]/div[2]/div[2]/label"))
				.click();
		driver.findElement(By.xpath("/html/body/main/section/div/div/div[2]/div/div/form/div[5]/div[2]/div[2]/label"))
				.click();
		//Checkbox click
		driver.findElement(By.xpath("/html/body/main/section/div/div/div[2]/div/div/form/div[7]/label")).click();
		//GetInstantQuotesButton click
		driver.findElement(By.id("LQBtn")).click();
		
		// System.out.println(driver.getTitle());
		// Click on PayPremium Yes-M App
		driver.findElement(By.xpath("//*[@id=\"InsurerTbl\"]/tr[2]/td[5]/button")).click();
		
		// Again click on the next Pay Premium button

		driver.findElement(By.xpath("/html/body/main/section/div/div/div[2]/div/div/form/div[1]/button")).click();
		
		// Now click on enter card details popupwindow's "Pay Now button
		driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div[2]/div/div/form/div[3]/button")).click();

	}

}
