package com.demo.demotestproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglePage extends BasePage{
    private final String GOOGLE_URL = "https://www.google.com/";

    private By searchInputLocator = By.cssSelector("input[title='Ara']");


    public GooglePage(WebDriver driver) {
        super(driver);
    }

    public void getGooglePage(){
        driver.get(GOOGLE_URL);
    }

    public boolean googlePageOpened(){
        return isAt(searchInputLocator);
    }



}
