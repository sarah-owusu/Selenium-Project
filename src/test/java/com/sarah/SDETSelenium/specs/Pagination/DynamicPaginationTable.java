package com.sarah.SDETSelenium.specs.Pagination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DynamicPaginationTable {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String url = "https://amali-tech.atlassian.net/browse/AMAP-394";
        driver.get(url);
        driver.manage().window().maximize();
        WebElement loginButton = driver.findElement(By.linkText("Login"));
        loginButton.click();
        Thread.sleep(5000);
        System.out.println(loginButton.getText());
        //driver.findElement(By.xpath("//a[.=' Dashboard']")).click();


        WebElement userName = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
        userName.clear();
                userName.sendKeys("sarahowusu781@gmail.com");

                WebElement password =
        driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
                password.clear();
                password.sendKeys("12345");
        driver.findElement(By.xpath("//button[@type='submit' and @xpath='1']")).click();
        String text = driver.findElement(By.xpath("//div[contains(text(), 'Pages')]")).getText();
        int totla_pages = Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));

        //Assignment
        //https://testautomationpractice.blogspot.com/

    }

}
