package com.demo.demotestproject.test;

import com.demo.demotestproject.pages.GooglePage;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {
    GooglePage googlePage;

    @Test
    public void googleTest() throws InterruptedException {
        googlePage = new GooglePage(driver);
        googlePage.getGooglePage();
        Thread.sleep(15000);
    }

}
