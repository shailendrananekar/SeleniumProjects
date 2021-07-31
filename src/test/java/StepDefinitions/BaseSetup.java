package StepDefinitions;

import Utils.BasePage;
import Utils.ConfigUtils;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class BaseSetup extends BasePage {

    @Before
    public void Setup(Scenario scenario) throws InterruptedException {

        setupLogAndConfig();

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(3000);
    }

    @After
    public void Quit(Scenario scenario) {

        driver.quit();
    }

    public void setupLogAndConfig() {

        ConfigUtils.loadConfig();
    }
}
