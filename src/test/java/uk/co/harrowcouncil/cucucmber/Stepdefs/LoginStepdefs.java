package uk.co.harrowcouncil.cucucmber.Stepdefs;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.co.harrowcouncil.pages.HomePage;
import uk.co.harrowcouncil.pages.LoginPage;

import java.util.List;

/* Created
 * by Lamee */
public class LoginStepdefs {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @When("^I click on login and register link$")
    public void iClickOnLoginAndRegisterLink() {
        new HomePage().clickOnLoginAndRegisterLink();
    }

    @Then("^I should navigate to login and register page$")
    public void iShouldNavigateToLoginAndRegisterPage() {
        Assert.assertEquals(new LoginPage().getLoginPageText(),"Log In / Register");
    }

    @And("^I enter the below credentials$")
    public void iEnterTheBelowCredentials(DataTable dataTable) {
        List<String>credentials=dataTable.asList(String.class);
        String email=credentials.get(0);
        String password=credentials.get(1);
        new LoginPage().enterEmail(email);
        new LoginPage().enterPassword(password);


    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I should see the error message$")
    public void iShouldSeeTheErrorMessage() {
        Assert.assertEquals(new LoginPage().loginErrorMessage(),"Invalid Username/Password supplied");
    }
}
