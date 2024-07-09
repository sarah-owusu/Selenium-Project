package com.sarah.SDETSelenium.specs.SomeSpecs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SleepCommand {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(7000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"))
                .sendKeys("Admin");

    }
}
