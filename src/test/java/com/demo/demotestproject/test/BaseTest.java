package com.demo.demotestproject.test;

import com.demo.demotestproject.webdriver.DriverManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;

public class BaseTest extends DriverManager {


    @BeforeTest
    @Parameters(value = {"browserName"} )
    public void initializeBrowser(@Optional String browserName) throws MalformedURLException {

        if(browserName == null){
            setDriver("chrome-local");

            System.out.println("Local Chrome driver is started");
            driver.manage().window().maximize();

        }else{
            setDriver(browserName);
            System.out.println("Browser is opened: "+ browserName);
        }
    }


    @AfterTest
    public void terminateBrowser(){
        tearDown();
        System.out.println("Driver is removed");
    }


}
