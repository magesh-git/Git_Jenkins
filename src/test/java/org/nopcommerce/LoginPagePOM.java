package org.nopcommerce;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOM extends BaseClass {
	LoginPagePOM(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="ico-login")
	private WebElement login;
	@FindBy(id="Email")
	private WebElement email;
	@FindBy(id="Password")
	private WebElement password;
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement loginButton;
	public WebElement getLogin() {
		return login;
	}
	
	public WebElement getEmail() {
		return email;
	}
	
	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getLoginButton() {
		return loginButton;
	}
	
	
	public void LoginPagePOMOpearations() throws IOException {
		 WebElement login2 = getLogin();
		 click(login2);
		 WebElement email2 = getEmail();
		 sendKeys(email2, excelRead(5,1));
		 WebElement password2 = getPassword();
		 sendKeys(password2,excelRead(6,1));
		 WebElement loginButton2 = getLoginButton();
		 click(loginButton2);
		 
	}
}
