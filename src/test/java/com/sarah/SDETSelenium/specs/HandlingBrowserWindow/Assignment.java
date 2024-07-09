package com.sarah.SDETSelenium.specs.HandlingBrowserWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Assignment {
    public static void main(String[] args) {
        // https://testautomationpractice.blogspot.com/
        // 0. Provide some String search for it
        // 1. count on each link using for loop
        // 2. click on each link using for loop
        // 3. get the window ID's for every browser window
        // 4. close specific browser window

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url = "https://testautomationpractice.blogspot.com/";
        driver.get(url);
        driver.manage().window().maximize();

        WebElement searchText = driver.findElement(By.className("wikipedia-search-input"));
        searchText.sendKeys("Selenium");
        searchText.sendKeys(Keys.ENTER);

        // Setting all browser windows ids
        Set<String> windowIDs = driver.getWindowHandles();

        //approach 2, Converting set String into a list to be able to get the browser windows ID
        List<String> windowList = new ArrayList(windowIDs);

        //System.out.println("ID: " + windowList);

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        // 1. count on each link using for loop
        for(WebElement links : allLinks){
         links.click();

        }

        //driver.close();

    }
}
