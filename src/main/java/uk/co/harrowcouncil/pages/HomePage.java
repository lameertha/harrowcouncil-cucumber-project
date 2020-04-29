package uk.co.harrowcouncil.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.harrowcouncil.utility.Utility;

/* Created
 * by Lamee */
public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());



    @FindBy(xpath = "//span[@class='icon-fallback']")
    WebElement _loginAndRegisterLink;

    @FindBy (xpath ="//span[contains(text(),'Council Tax')]" )
    WebElement _councilTaxLink;

    public void clickOnLoginAndRegisterLink (){
        Reporter.addStepLog("clicking on login and register link : " + _councilTaxLink.toString());
        clickOnElement(_loginAndRegisterLink);
        log.info("clicking on login and register link : " + _councilTaxLink.toString());
    }
    public void clickOnCouncilTaxLink(){
        Reporter.addStepLog("clicking on counciltax link : " + _councilTaxLink.toString() + "<br>");
        clickOnElement(_councilTaxLink);
        log.info("clicking on counciltax link : " + _councilTaxLink.toString());
    }


}
