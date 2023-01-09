package com.demo.demotestproject.webdriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DriverOptions {
    private ChromeOptions chromeOptions;
    private FirefoxOptions firefoxOptions;
    private FirefoxProfile firefoxProfile;



    public void setFirefoxOptions(){
        firefoxOptions = new FirefoxOptions();
        firefoxProfile = new FirefoxProfile();
        //Accept Untrusted Certificates
        firefoxProfile.setAcceptUntrustedCertificates(true);
        firefoxProfile.setAssumeUntrustedCertificateIssuer(false);
        //Use No Proxy Settings
        firefoxProfile.setPreference("network.proxy.type", 0);
        //Set Firefox profile to capabilities

        //options.setCapability(FirefoxDriver.PROFILE, profile);
    }

    public FirefoxOptions getFirefoxOptions(){
        setFirefoxOptions();
        return firefoxOptions;
    }



    public void setChromeOptions(){
        chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("ignore-certificate-errors");
        chromeOptions.addArguments("--disable-dev-shm-usage");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-popup-blocking");
    }

    public ChromeOptions getChrome(){
        setChromeOptions();
        return chromeOptions;
    }


}
