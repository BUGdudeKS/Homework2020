package com.cbt.tests;
import
import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;

import static com.cbt.utilities.StringUtility.verifyEquals;

public class NavigationTests {
    private WebDriver driver;

    public  void chromeTest() throws InterruptedException {
        driver=BrowserFactory.getDriver("chrome");
        prosedure();
    }

    private void prosedure() throws InterruptedException {
        driver.get("https://google.com");
        String googleTitle=driver.getTitle();
        Thread.sleep(1000);
        driver.get("https://etsy.com");
        String etsyTitle=driver.getTitle();
        Thread.sleep(1000);
        driver.navigate().back();
        verifyEquals(googleTitle,driver.getTitle());
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);
        verifyEquals(etsyTitle, driver.getTitle());
        BrowserFactory.closeDriver();
    }

    public  void firefoxTest() throws InterruptedException {
        driver = BrowserFactory.getDriver("firefox");

        prosedure();
    }
    public  void edgeTest()
    {
        WebDriver driver=BrowserFactory.getDriver("edge");

        BrowserFactory.closeDriver();
    }

    public static void main(String[] args) throws InterruptedException {
        NavigationTests n=new NavigationTests();

        System.out.println("Test being performed on google chrome");
        // n.chromeTest();
        System.out.println("Test being performed on firefox");
        //n.firefoxTest();
        System.out.println("Test being performed on Edge");
        n.edgeTest();
    }
}

