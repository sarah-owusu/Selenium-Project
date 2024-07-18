package com.sarah.SDETSelenium.specs.Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AutoSuggestDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url = "https://www.google.com/";
        driver.get(url);
        driver.manage().window().maximize();

        //search box
        driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("Selenium");
        List<WebElement> options = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
        System.out.println(options.size());
        for(WebElement ops:options){
            System.out.println(ops.getText());
        }

        WebElement text = driver.findElement(By.xpath("//*[@id=\"mdzGzd\"]/div[1]/span/b"));
        System.out.println(text.getText());

        driver.close();

    }
}
