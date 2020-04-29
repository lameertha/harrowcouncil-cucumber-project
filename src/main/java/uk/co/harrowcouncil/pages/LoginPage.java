package uk.co.harrowcouncil.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.harrowcouncil.utility.Utility;

/* Created
 * by Lamee */
public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @FindBy(xpath = "//a[contains(text(),'Log In')]")
    WebElement _loginPageText;

    @FindBy (xpath = "//input[@id='username-input']")
    WebElement _yourEmail;

    @FindBy (xpath ="//input[@id='password-input']" )
    WebElement _yourPassword;

    @FindBy(xpath = "//input[@id='submitBtnSignIn']")
    WebElement _loginButton;

    @FindBy(xpath = "//span[@id='password.errors']")
    WebElement _errorMessage;


    public String getLoginPageText(){
        Reporter.addStepLog("getting text from : " + _loginPageText.toString());
        log.info("getting text from : " + _loginPageText.toString());
        return getTextFromElement(_loginPageText);

    }

    public void enterEmail(String email){
        Reporter.addStepLog("Entering eamil : " + email + "to email field: " + _yourEmail.toString());
        sendTextToElement(_yourEmail,email);
        log.info("Entering email : " + email + "to email field: " + _yourEmail.toString());

    }
    public void enterPassword(String password) {
        Reporter.addStepLog("Entering password : " + password + "to password field: " + _yourPassword.toString());
        sendTextToElement(_yourPassword, password);
        log.info("Entering password : " + password + "to password field: " + _yourPassword.toString());
    }

    public void clickOnLoginButton(){
        Reporter.addStepLog("clicking on login button : " +_loginButton.toString());
        clickOnElement(_loginButton);
        log.info("clicking on login button : " +_loginButton.toString());
    }

    public String loginErrorMessage(){
        Reporter.addStepLog("getting text from : " + _errorMessage.toString());
        log.info("getting text from : " +_errorMessage.toString());
        return getTextFromElement(_errorMessage);


    }
}
