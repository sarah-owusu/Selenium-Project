package com.sarah.SDETSelenium.specs.SomeSpecs;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class FluentWait<W extends SearchContext> {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();


        //fluent wait declaration
//        Wait<WebDriver> myWait =  new FluentWait<WebDriver>(driver)
//                .withTimeout(Duration.ofSeconds(30)) // Timeout duration in seconds
//                .pollingEvery(Duration.ofMillis(50))
//                                .ignoring(NoSuchElementException.class);


        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

//
//        WebElement txtUsername = myWait.until(new Function<WebDriver, WebElement>(){
//            @Override
//            public WebElement apply(WebDriver driver){
//                return driver.findElement(By.id("foo"));
        //}
//        });
//        txtUsername.sendKeys("Admin");
//        driver.close();
//
//
//    }
//}
    }
}