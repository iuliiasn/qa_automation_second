package com.course.six;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.annotations.Test;

public class HWsixth {

    @Test (description = "Using ChromeDriver")
    public void crhomeTest(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\usosn\\Downloads\\87chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
}
    @Test (description = "Using FirefoxDriver")
    public void mozillaTest(){
    System.setProperty("webdriver.gecko.driver", "C:\\Users\\usosn\\Downloads\\geckodriver-v0.28.0-win64\\geckodriver.exe");
    WebDriver driver2 = new FirefoxDriver();
    driver2.get("https://www.google.com/");
    }
}
