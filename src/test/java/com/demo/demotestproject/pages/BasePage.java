package com.demo.demotestproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.WebElement;
public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;


    JavascriptExecutor js;



    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        js = (JavascriptExecutor)driver;
    }

    public void waitForLocator(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public WebElement findBy(By locator){
        return driver.findElement(locator);
    }


    public void alertAccept(){
        driver.switchTo().alert().accept();
    }

    public void clearCookies(){
        driver.manage().deleteAllCookies();
    }
    public void maximizeWindow(){
        driver.manage().window().maximize();
    }

    public void click(By locator){
        waitForLocator(locator);
        findBy(locator).click();
    }

    public void setText(By locator, String text){
        waitForLocator(locator);
        findBy(locator).clear();
        findBy(locator).sendKeys(text);
    }

    public String getText(By locator){
        waitForLocator(locator);
        return findBy(locator).getText();
    }


    public boolean isAt(By locator){
       return findBy(locator).isDisplayed();
    }


}
