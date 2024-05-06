package utillities;

import org.openqa.selenium.*;
import org.testng.Assert;

public class ActionCommands {

    protected void openurl(WebDriver driver, String URL){
        driver.get(URL);
    }
    protected void click (WebDriver driver, By locator){
        WebElement element = driver.findElement(locator);
        element.click();
    }
    protected void type (WebDriver driver, By locator, String input){
        try {
            WebElement element = driver.findElement(locator);
            element.sendKeys(input);
        }catch (NoSuchElementException e){
            System.out.println("No such a element "+ e.getMessage());
            throw e;
        }
    }
    protected void verifyText(WebDriver driver, By locator, String expectedResults){
        WebElement element = driver.findElement(locator);
        Assert.assertEquals(element.getText(),expectedResults);
    }
    protected void clearText(WebDriver driver, By locator){
        WebElement element = driver.findElement(locator);
        element.clear();
    }
    protected String getText(WebDriver driver, By locator){
        WebElement element = driver.findElement(locator);
        return element.getText();
    }
    protected void hitEnter(WebDriver driver,By locator){
        WebElement element = driver.findElement(locator);
        element.sendKeys(Keys.ENTER);
    }
    protected void waitTime(){
        try {
            wait(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
