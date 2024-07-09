package com.sarah.SDETSelenium.specs.SomeSpecs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register");
        driver.manage().window().maximize();

        // conditional methods
        //isDisplayed
//        WebElement logo = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
//        logo.isDisplayed();
//        System.out.println("Display status of logo: " + logo.isDisplayed());

        //using boolean
//        boolean logoStatus = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img")).isDisplayed();
//        System.out.println("Display status of logo: " + logoStatus);

        //isEnabled
        boolean firstName = driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).isEnabled();
        System.out.println("First name input enable status is : " + firstName);

        boolean submitButton = driver.findElement(By.id("register-button")).isEnabled();
        System.out.println("submit button enable status is  : " + submitButton);

        // isSelected
        WebElement female = driver.findElement(By.xpath("//*[@id=\"gender-male\"]"));
        System.out.println("Before selecting");
        System.out.println("female radio button is: " + female.isSelected());

        WebElement male = driver.findElement(By.xpath("//*[@id=\"gender-female\"]"));
        System.out.println("Before selecting");
        System.out.println("male radio button is: " + male.isSelected());
        System.out.println();

        System.out.println("After selecting female radio button");
        female.click();
        System.out.println("female radio button is: " + female.isSelected());

        System.out.println("After selecting male radio button");
        //male.click();
        System.out.println("male radio button is: " + male.isSelected());

        boolean checkBox = driver.findElement(By.xpath("//*[@id=\"Newsletter\"]")).isSelected();
        System.out.println("News letter check bos selected status: "  + checkBox);



    }
}
