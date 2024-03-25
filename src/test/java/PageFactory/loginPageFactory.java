package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPageFactory {

	WebDriver driver;

	@FindBy(id="txtUsername")
	WebElement text_username;
	
	@FindBy(id="txtPassword")
	WebElement txt_password;
	
	@FindBy(id="btnLogin")
	WebElement btn_login;
	
	public void enterusername(String username) {
		text_username.sendKeys(username);
	}
	public void enterpassword(String password) {
		txt_password.sendKeys(password);

	}
	public void clickOnLoginBtn() {
		btn_login.click();
	}
	public loginPageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
