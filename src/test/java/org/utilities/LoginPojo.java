package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass{
	// CLASS name and  METHOD name should be same for CONSTRICTOR
	
	
	// Non para constructor 
	
	// syntax is this
	public LoginPojo() {

		PageFactory.initElements(driver,this);

	}
   //  we can go with locatrs , id , or xpath here
	
	@FindBy(xpath="//a[@data-test='header-login-link']")
	private WebElement ok;
	
	@FindBy(xpath="//input[@id='j_username']")
	private WebElement user;
	
	@FindBy(xpath="//input[@name='j_password']")
	private WebElement pass;
	
	@FindBy(xpath="(//button[@type='submit'])[3]")
	private WebElement ok1;

	public WebElement getOk() {
		return ok;
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getOk1() {
		return ok1;
	}
	
	
}
