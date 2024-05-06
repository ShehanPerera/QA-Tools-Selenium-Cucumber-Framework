package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.GooglePage;
import utillities.BaseClass;
import utillities.ConfigDataProvider;

public class GoogleSearchSteps extends BaseClass {

    ConfigDataProvider conf = new ConfigDataProvider();

    @Given("^goto google page$")
    public void gotoGooglePage() {
        driver =  steupBrowser();
        googlePage = new GooglePage(driver);
        googlePage.openPage();
    }

    @When("^type name as (.*)$")
    public void typename(String name) {
        googlePage.typeSearchText(name);
    }

    @When("^type conf data")
    public void typeConfData() {
        googlePage.typeSearchText(conf.getSearchText());
    }

    @And("^click on search$")
    public void clickOnSearch() {
        googlePage.clickOnSearch();
    }

    @Then("^verify result page as (.*)$")
    public void verifyResultPage(String results) {
        driver.getPageSource().contains(results);

    }
    @Then("^close browser")
    public void  closeBrowser(){
        tearDown();
    }

    @Then("^verify conf result page title")
    public void verifyConfResultPage() {
        String expectedConf = conf.getVerifyMessage();
        String actualTitle= driver.getTitle();
        System.out.println("acct "+ actualTitle);
        Assert.assertEquals(actualTitle,expectedConf);
    }
}
