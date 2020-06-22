package com.cbt.tests;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {
    public static void main(String[] args) throws InterruptedException {
        List<String> urls = Arrays.asList("https://luluandgeorgia.com",
                "https://wayfair.com",
                "https://www.westelm.com",
                "https://walmart.com");
        WebDriver driver=getDriver("chrome");
        String dummy="";
        for(int i=0;i<=3;i++)
        {
            driver.get(urls.get(i));
            Thread.sleep(1000);
            dummy=driver.getTitle().toLowerCase().trim();
            verifyEquals(urls.get(i).contains(dummy));
        }
        closeDriver();

    }
}

