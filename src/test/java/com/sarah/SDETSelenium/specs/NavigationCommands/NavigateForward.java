package com.sarah.SDETSelenium.specs.NavigationCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class NavigateForward {
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
        Thread.sleep(3000);
        driver.getCurrentUrl();
        System.out.println("The current url is: " + driver.getCurrentUrl());

        //Navigating forward to the first URL
        driver.navigate().forward();
        System.out.println("The second current url is : " + driver.getCurrentUrl());

        driver.close();
    }
}
