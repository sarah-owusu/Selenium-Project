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
    public static void main(String[] args) throws InterruptedException {
//         https://testautomationpractice.blogspot.com/
//         0. Provide some String search for it
//         1. count on each link using for loop
//         2. click on each link using for loop
//         3. get the window ID's for every browser window
//         4. close specific browser window

        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url = "https://testautomationpractice.blogspot.com/";
        driver.get(url);
        driver.manage().window().maximize();

        // searching a string in the search input field
        WebElement searchInput =
        driver.findElement(By.xpath("//input[@class='wikipedia-search-input']"));

        searchInput.sendKeys("Selenium");
        searchInput.sendKeys(Keys.ENTER);
        Thread.sleep(5000);

        //Retrieve and print the text entered
        String enteredText = searchInput.getAttribute("value");
        System.out.println("text entered is : " + enteredText);

        // Fetching all search result links
        List<WebElement> searchResults = driver.findElements(By.xpath("//*[@id=\"wikipedia-search-result-link\"]"));
        System.out.println("number of search result: " + searchResults.size());

        for (WebElement result: searchResults){
            System.out.println("search result : " + result.getText());

            //getting window id for every browser window
            Set<String> windowHandles = driver.getWindowHandles();
            //converting set to list
            List<String> windowIds = new ArrayList<>(windowHandles);

            System.out.println("window handles : " + windowIds);
        }




        //driver.close();

    }
}
