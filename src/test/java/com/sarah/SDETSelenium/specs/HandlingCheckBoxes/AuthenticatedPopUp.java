package com.sarah.SDETSelenium.specs.HandlingCheckBoxes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatedPopUp {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        //injection method of handling authentication pop ups

        String url = "http://the-internet.herokuapp.com/basic_auth";
        driver.manage().window().maximize();
        driver.get(url);

        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
    }
}
