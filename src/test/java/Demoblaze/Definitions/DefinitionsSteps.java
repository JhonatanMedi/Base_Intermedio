package Demoblaze.Definitions;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import Demoblaze.Paginas.LogInPage;
import Demoblaze.Steps.Connection;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DefinitionsSteps {

    private WebDriver driver;
    private Connection conexion = new Connection();
    private LogInPage logInPage;


    private static String name;
    private static String country;
    private static String city;
    private static String creditCard;
    private static String month;
    private static String year;

    @Given("^open browser$")
    public void open_browser() {

        this.conexion = new Connection();
        this.driver = this.conexion.abrirNavegador();

    }


    @When("^clic on logIn user (.*) password (.*)$")
    public void logIn(String userNameP, String passwordP) {
        this.logInPage = new LogInPage(driver);
        this.logInPage.logInM(userNameP, passwordP);

    }

    @And("^assert Welcome (.*)$")
    public void assertWelcome(String userNameP) {
        this.logInPage = new LogInPage(driver);
        this.logInPage.assertWelcome(userNameP);
    }


}