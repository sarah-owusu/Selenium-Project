package com.sarah.SDETSelenium.specs.HandlingBrowserWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.browser.model.WindowID;

import java.time.Duration;
import java.util.Set;

public class ClosingSpecificBrowserWindow {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        //WebElement clinkLink = driver.findElement(By.linkText("OrangeHRM, Inc"));
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();
        System.out.println("Current url after clickin on the link beneath the forget passwrod : " + driver.getCurrentUrl());

        // setting window IDs to be able to handle browser windows or tabs
        Set<String> windowIDs = driver.getWindowHandles();

        // An enhanced for loop to loop through all the window ids by their specific titles
        for(String winId : windowIDs){
            String title = driver.switchTo().window(winId).getTitle();
            System.out.println("These are available titles: " + title);

            if(title.equals("OrangeHRM")){
                driver.close();
            }

        }

    }
}
