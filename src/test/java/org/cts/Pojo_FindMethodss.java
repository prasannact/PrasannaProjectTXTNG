package org.cts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass;

public class Pojo_FindMethodss extends BaseClass{

	// CLASS name and  METHOD name should be same for CONSTRICTOR

	// syntax is this
	public Pojo_FindMethodss() {
		
		PageFactory.initElements(driver,this);
				
	}
	
	@CacheLookup    // to maintain cache for the webelement
	@FindBys({
		
		// its works like AND  operator , both should satisfy,
		@FindBy(xpath="//a[@data-test='header-login-link']"),
		
		@FindBy(xpath="//a[@aria-label='Log in / Register']")
	
	})
	private WebElement ok;
	
	@CacheLookup
	@FindAll({
		// its works like OR  operator , both should satisfy,
		
		@FindBy(xpath="//input[@id='j_username']"),
		@FindBy(id="any one correct means ok , no prob for second one")

		
	})
	private WebElement user;
	
	@FindBy(xpath="//input[@name='j_password']")
	private WebElement pass;
	
	@FindBy(xpath="(//button[@type='submit'])[3]")
	private WebElement  ok1;
	
	// getters here

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
