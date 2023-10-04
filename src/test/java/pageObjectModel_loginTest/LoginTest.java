package pageObjectModel_loginTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjectModel_loginPage.LoginPage;

public class LoginTest {
	WebDriver driver;
	LoginPage loginsite;
	@BeforeMethod       
	public void openApp() {
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.facebook.com/");
	}
	@Test
	public void validLoginTest() {
		loginsite=new LoginPage(driver);
		loginsite.userName("tanita");
		loginsite.passWord("1234567");
		loginsite.loginButton();
	}

}
