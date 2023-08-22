

package tests;

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.Assert;

	public class LoginLogoutPageTest0 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			WebDriver driver = new ChromeDriver();
			// to maximize window
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
			driver.get("http://tanchan-001-site3.btempurl.com/production/");
			// TC001
			driver.findElement(By.linkText("LOGIN")).click();
			driver.findElement(By.name("LEmail")).sendKeys("nishaa.sriraman1@gmail.com");
			driver.findElement(By.name("LPwd")).sendKeys("nsrirama23");
			driver.findElement(By.xpath("/html/body/main/section/div/div/div[1]/div/div/form/div[3]/button")).click();
			// to chk if the correct page is loaded

			String expectedTitle = "Login / Register | Yes-M";
			try {
				Assert.assertEquals(expectedTitle, driver.getTitle());
				System.out.println("Navigated to correct webpage");
			} catch (Throwable pageNavigationError) {
				System.out.println("Didn't navigate to correct webpage");
			}

			/*
			 * OR USE THIS AS BELOW if(driver.getTitle().contains("some expected text"))
			 * //Pass
			 * System.out.println("Page title contains \"Login / Register | Yes-M\" "); else
			 * //Fail System.out.
			 * println("Page title doesn't contains \"Login / Register | Yes-M\" ");
			 */
			// System.out.println(driver.getTitle());

		
			driver.findElement(By.linkText("MY ACCOUNT")).click();

			driver.findElement(By.linkText("Logout")).click();

			driver.quit();

		}

	}


