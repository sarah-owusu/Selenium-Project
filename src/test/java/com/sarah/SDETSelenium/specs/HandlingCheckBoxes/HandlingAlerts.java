package com.sarah.SDETSelenium.specs.HandlingCheckBoxes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class HandlingAlerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        String url = "https://the-internet.herokuapp.com/javascript_alerts";
        driver.get(url);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
//
//        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
//        Thread.sleep(5000);
//
//         //Using accept to close alert
//        Alert myAlert = driver.switchTo().alert();
//        System.out.println(myAlert.getText());

        //2) confirmation Alert -ok and cancel


//        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
//        //Thread.sleep(5000);
//
//        Alert cancelButton = driver.switchTo().alert();
//        cancelButton.dismiss();
//        System.out.println(cancelButton.getText());

        //
          driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
          Thread.sleep(5000);

         Alert myPromptAlert = driver.switchTo().alert();
         myPromptAlert.sendKeys("Welcome");
         myPromptAlert.accept();
    }
}
