package com.sarah.SDETSelenium.specs.HandlingCheckBoxes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandlingAlertsUsingExplicitWait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        // Handling alert using and Explicit wait

        //Adding an Explicit wait
        WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));

        String url = "https://the-internet.herokuapp.com/javascript_alerts";
        driver.manage().window().maximize();
        driver.get(url);

        // Clicking on the JS Prompt alert
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();

        //Using the explicit wait
        Alert myAlert = myWait.until(ExpectedConditions.alertIsPresent());

        System.out.println(myAlert.getText());
        myAlert.accept();


        driver.quit();
    }
}
