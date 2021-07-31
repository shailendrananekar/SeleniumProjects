package StepDefinitions;

import PageLocators.SignUpPageLocators;
import Utils.BasePage;
import Utils.ConfigUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SignUpSteps extends BasePage {

    @Given("^Launch the Signup page of Travel website$")
    public void launchURL() throws InterruptedException {

        driver.get(ConfigUtils.getConfigValue("url"));
        Thread.sleep(2000);
    }

    @When("^Validate dropdown values and enter other fields$")
    public void SignupForm() throws InterruptedException {

        List<WebElement> lstLanguage = driver.findElements(By.xpath("//div[@ng-bind-html='language']"));
        for (int i = 0; i < lstLanguage.size(); i++) {
            if (lstLanguage.get(i).equals("English")) {
                Assert.assertEquals("English", lstLanguage.get(i));
            }
            if (lstLanguage.get(i).equals("Dutch")) {
                Assert.assertEquals("Dutch", lstLanguage.get(i));
            } else {
                Assert.fail("Other Value Present in Language dropdown.");
            }
        }

        driver.findElement(SignUpPageLocators.name_txt).sendKeys(ConfigUtils.getConfigValue("FullName"));
        driver.findElement(SignUpPageLocators.orgName_txt).sendKeys(ConfigUtils.getConfigValue("OrganizationName"));
        driver.findElement(SignUpPageLocators.email_txt).sendKeys(ConfigUtils.getConfigValue("Email"));
        Thread.sleep(5000);
        driver.findElement(SignUpPageLocators.iAgree_chkbox).click();
        Thread.sleep(5000);
    }

    @Then("^Click on Get Started and validate Email has been sent$")
    public void ValidateEmailSuccessfull() throws InterruptedException {

        driver.findElement(SignUpPageLocators.getStarted_btn).click();
        Thread.sleep(10000);
        String sEmailMessage = driver.findElement(SignUpPageLocators.emailmsg_lbl).getText();
        Assert.assertEquals("A welcome email has been sent. Please check your email.", sEmailMessage);

    }


}
