package com.sarah.SDETSelenium.specs.HandlingDatePickers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UsingDatePicker {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url = "https://jqueryui.com/datepicker/";
        driver.manage().window().maximize();
        driver.get(url);
        driver.switchTo().frame(0);

        //Method 2 : using date picker
        String month = "May";
        String year = "2025";
        String day = "20";

        // clicking on the date input field to open the date picker
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();

        //Step1 : select month and year first
        while (true){
            String currentMonth = driver
            .findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String currentYear = driver
                    .findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText(); //get the current year
            if (currentMonth.equals(month) && currentYear.equals(year)){
                break;
            }

                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();

        }

    }
}
