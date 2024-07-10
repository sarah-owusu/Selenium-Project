package com.sarah.SDETSelenium.specs.HandlingCheckBoxes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlingInputAlerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        //Adding an implicit wait

        String url = "https://the-internet.herokuapp.com/javascript_alerts";
        driver.manage().window().maximize();
        driver.get(url);

        // Clicking on the JS Prompt alert
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();

        //Switching to the alert window
        Alert promtAlert = driver.switchTo().alert();
        promtAlert.sendKeys("Welcome");

        System.out.println(promtAlert.getText());
        promtAlert.accept();


        driver.quit();

    }
}
