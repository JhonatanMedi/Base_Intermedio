package Demoblaze.Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ButtonPages {

	private WebDriver driver;
	private Questions questions;


	@FindBy(how = How.ID, using = "login2")
	private WebElement btnLogIn;

	@FindBy(how = How.XPATH, using = "//button[@onclick = 'logIn()']")
	private WebElement btnLogin;



	public ButtonPages(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.questions = new Questions(driver);
	}


	public void btnLogIn() {
		btnLogIn.isDisplayed();
		btnLogIn.click();
	}

	public void btnLogin() {
		btnLogin.isDisplayed();
		btnLogin.click();
	}


}
