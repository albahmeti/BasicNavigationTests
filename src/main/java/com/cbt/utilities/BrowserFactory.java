package com.cbt.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
    public static WebDriver getDriver(String browser) {
        if(browser.equalsIgnoreCase("chrome")){

            System.setProperty("webdriver.chrome.driver",

                    "C:\\Users\\Alba Ahmeti\\.m2\\repository\\webdriver\\chromedriver\\win32\\83.0.4103.39\\chromedriver.exe");
            return new ChromeDriver();
        }else if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver",
                    "C:\\Users\\Alba Ahmeti\\.m2\\repository\\webdriver\\geckodriver\\win64\\0.26.0\\geckodriver.exe");
            return new FirefoxDriver();
        }else if(browser.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver",
                    "C:\\Users\\Alba Ahmeti\\Downloads\\msedgedriver.exe");
            return new EdgeDriver();
        }
        else{
            return null;
        }

    }
}
