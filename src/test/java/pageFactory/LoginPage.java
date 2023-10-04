package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.ID,using="email")WebElement uName;
	public WebElement userName(String enterName) {
		uName.clear();
		uName.sendKeys(enterName);
		return uName;
		
		
	}
	@FindBy(how=How.ID,using="pass")private WebElement pass;
	public WebElement passWord(String enterPass) {
		pass.clear();
		pass.sendKeys(enterPass);
		return pass;
		
	}
	@FindBy(how=How.NAME,using="login")WebElement login;
	public void  loginButton() {
		login.click();
		
		
	}
}
