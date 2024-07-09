package com.sarah.SDETSelenium.specs.NavigationCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class NavigationCommandsSpecs {
    public static void main(String[] args) throws MalformedURLException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // using the URL in an object format with the URL class in java
        URL myUrl = new URL("http://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //navigate to the browser url
        driver.navigate().to(myUrl);
        driver.close();
    }
}
