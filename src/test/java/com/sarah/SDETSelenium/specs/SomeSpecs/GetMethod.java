package com.sarah.SDETSelenium.specs.SomeSpecs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Set;

public class GetMethod {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();

        //System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");

        //get method to launch the application
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(7000);

        //get method to get the title of the application
        System.out.println(driver.getTitle());

        //getCurrent url -returns title of the browser
        System.out.println("The current url is: " + driver.getCurrentUrl());

//        //getPagesource -returns the page of ... app
//        System.out.println(driver.getPageSource());

        //get windowHandle returns the id of the single opwn window
        String windowId = driver.getWindowHandle();
        System.out.println("window ID: " + windowId);

        Thread.sleep(3000);
        //capture multiple browser windows
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();

        Set<String> windowIds;
        windowIds = driver.getWindowHandles();
        System.out.println(windowIds);

        driver.close();
        driver.quit();

    }
}
