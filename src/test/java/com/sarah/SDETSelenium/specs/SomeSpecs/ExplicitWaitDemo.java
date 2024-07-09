package com.sarah.SDETSelenium.specs.SomeSpecs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitDemo {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        ///Declaration wait type
        WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));


        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        WebElement txtUsername = myWait.
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")));
        txtUsername.sendKeys("Admin");

        //ExplicitWait for password
        WebElement txtPassword = myWait.
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")));
        txtPassword.
                sendKeys("admin123");

        WebElement button = myWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")));
        button.click();

        //driver.close();
    }
}
