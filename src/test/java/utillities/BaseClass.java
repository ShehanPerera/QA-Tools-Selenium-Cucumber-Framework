package utillities;

import org.openqa.selenium.WebDriver;
import pageObjects.GooglePage;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    public WebDriver driver;
    public GooglePage googlePage;
    protected ConfigDataProvider config;

    public WebDriver steupBrowser() {
        config = new ConfigDataProvider();
        driver = BrowserFactory.startApplication(driver, config.getBrowser(),config.getHeaded());
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }

    public void tearDown() {
        BrowserFactory.quitBrowser(driver);
    }
}
