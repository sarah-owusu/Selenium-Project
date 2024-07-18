package com.sarah.SDETSelenium.specs.HandlingDatePickers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DatePickerDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String url = "https://jqueryui.com/datepicker/";
        driver.get(url);
        driver.manage().window().maximize();

        //Switching to the iframe
        driver.switchTo().frame(0);

        //Method 1 : using sendKeys
        WebElement date =
        driver.findElement(By.xpath("//input[@type='text']"));
                date.sendKeys("07/17/2024");
                date.sendKeys(Keys.ENTER);
        System.out.println(date.getAttribute("value"));

                //driver.close();


    }
}
