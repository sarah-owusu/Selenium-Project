package com.sarah.SDETSelenium.specs.NavigationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class NavigateBack {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // navigate back to previous URL

        // using the URL in an object format with the URL class in java
        URL myUrl = new URL("http://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //navigate to the browser url
        driver.navigate().to(myUrl);

        //Navigating to a different Url
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);

        // Navigating back to the previous URL
        driver.navigate().back();

        // getting the current url
        driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
        driver.close();
    }
}
