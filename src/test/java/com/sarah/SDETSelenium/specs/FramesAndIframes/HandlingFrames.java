package com.sarah.SDETSelenium.specs.FramesAndIframes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlingFrames {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String url = "https://ui.vision/demo/webtest/frames/";
        driver.manage().window().maximize();


    }
}
