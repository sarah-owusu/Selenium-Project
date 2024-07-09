package com.sarah.SDETSelenium.specs.HandlingBrowserWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.browser.model.WindowID;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class UsingLoopingStatement {

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


        //looping through all browser windows
        for(String winId : windowIDs)
        {
            String title = driver.switchTo().window(winId).getTitle();
            if(title.equals("Human Resources Management Software | OrangeHRM")){
                System.out.println("We are on the child window");
                System.out.println(driver.getCurrentUrl());
            }

            else{
                System.out.println("the tile of the cild window is: " + title);
                System.out.println(driver.getCurrentUrl());
            }
        }

    }
}
