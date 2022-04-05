package Demoblaze.Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Demoblaze.Steps.ButtonPages;
import Demoblaze.Steps.Questions;
import net.thucydides.core.annotations.Step;

public class LogInPage {

	private WebDriver driver;
	private ButtonPages buttonPages;
	private Questions questions;

	@FindBy(how = How.XPATH, using = "//input[@id= 'loginusername']")
	private WebElement inputLogInUserName;

	@FindBy(how = How.XPATH, using = "//input[@id= 'loginpassword']")
	private WebElement inputLogInPassword;

	public LogInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.buttonPages = new ButtonPages(driver);
		this.questions = new Questions(driver);
	}

	@Step
	public void logInM(String userNameP, String passwordP) {
		buttonPages.btnLogIn();
		inputLogInUserName.isDisplayed();
		questions.tiempoSegundos(1);
		inputLogInUserName.sendKeys(userNameP);
		inputLogInPassword.isDisplayed();
		inputLogInPassword.sendKeys(passwordP);
		questions.tiempoSegundos(1);
		buttonPages.btnLogin();
		questions.tiempoSegundos(1);
		//questions.aceptAlert();
		
	}

	@Step
	public void assertWelcome(String userNameP) {
		questions.AsserWelcome(userNameP);
	}
}
