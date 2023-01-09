package com.demo.demotestproject.webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverManager {
    public WebDriver driver;
    public DriverOptions driverOptions;

    public void setDriver(String browserName) throws MalformedURLException {
        driverOptions = new DriverOptions();

        if (browserName != null){

            switch (browserName){
                case "chrome-local":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;

                case "firefox-local":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;

                case "chrome-grid":
                    driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), driverOptions.getChrome());
                    break;

                case "firefox-grid":
                    driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), driverOptions.getFirefoxOptions());
                    break;

            }

        }

    }


    public void tearDown(){
        if(driver != null ){
            driver.quit();
        }
    }

}
