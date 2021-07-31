package PageLocators;

import org.openqa.selenium.By;

public class SignUpPageLocators {

    public static By name_txt = By.name("name");
    public static By orgName_txt = By.name("orgName");
    public static By email_txt = By.name("email");
    public static By iAgree_chkbox = By.xpath("//span[contains(text(),'I agree to the')]");
    public static By getStarted_btn = By.xpath("//button[contains(text(),'Get Started')]");
    public static By emailmsg_lbl = By.xpath("//div[@ng-show='errorMessage']/span");



}
