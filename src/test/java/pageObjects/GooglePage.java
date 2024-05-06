package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utillities.ActionCommands;

public class GooglePage extends ActionCommands {


    WebDriver driver;
    private By serachBox = By.name("q");

    public GooglePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openPage() {
        openurl(driver, "https://www.google.com/");
    }

    public void typeSearchText(String searchText) {
        System.out.println(searchText);
        type(driver, serachBox, searchText);
    }

    public void clickOnSearch() {
        hitEnter(driver, serachBox);
    }
    public void pageWait(){
        waitTime();
    }

}