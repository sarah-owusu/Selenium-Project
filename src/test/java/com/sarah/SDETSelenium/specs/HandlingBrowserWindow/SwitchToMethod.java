package com.sarah.SDETSelenium.specs.HandlingBrowserWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SwitchToMethod {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());

        //WebElement clinkLink = driver.findElement(By.linkText("OrangeHRM, Inc"));
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();
        System.out.println("Current url after clickin on the link beneath the forget passwrod : " + driver.getCurrentUrl());

        Set<String> windowIDs = driver.getWindowHandles();

        List<String> windowList = new ArrayList(windowIDs);

        // Getting the IDs

        String parentID = windowList.get(0);
        String childID = windowList.get(1);

        System.out.println(driver.getTitle());

        //Switching to child window
        driver.switchTo().window(childID);
        System.out.println("child window title is " + driver.getTitle());

        //Switching to parentWindow window
        driver.switchTo().window(parentID);
        System.out.println("parent window title is " + driver.getTitle());

        driver.close();

    }
}
