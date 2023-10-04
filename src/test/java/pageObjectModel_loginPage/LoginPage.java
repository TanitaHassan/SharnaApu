package pageObjectModel_loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement userName(String enterYourName) {
		WebElement uName=driver.findElement(By.id("email"));
		uName.clear();
		uName.sendKeys(enterYourName);
		return uName;
		
		
	}
	public WebElement passWord(String enterPass) {
		WebElement pass=driver.findElement(By.id("pass"));
		pass.clear();
		pass.sendKeys(enterPass);
		return pass;
		
		
	}
	public void loginButton() {
		WebElement loginButton=driver.findElement(By.name("login"));
		loginButton.click();
			
	}
}