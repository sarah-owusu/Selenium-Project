package com.sarah.SDETSelenium.specs.FramesAndIframes;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.browser.model.WindowID;

import java.security.Key;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HandlingFrames {

    // The three approach for iframes
    //driver.switchTo().frame(name)
    //driver.switchTo().frame(id)
    //driver.switchTo().frame(Webelement)
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url = "https://ui.vision/demo/webtest/frames/"; // parent html page
        driver.get(url);
        driver.manage().window().maximize();

        //frame1
        WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(frame1); //passed frame as a webElement // switch to frame1

         //Entering test in iframe 1 input box
        driver.findElement(By.xpath("//input[@type='text' and @name='mytext1']")).sendKeys("Welcome");
//
        WebElement inputField1 = driver.findElement(By.xpath("//*[@id=\"id1\"]/div/input"));
        System.out.println(inputField1.getAttribute("value"));
//
        System.out.println(); //did not get the value
//
//        Switching to the default content / go back to the page
        driver.switchTo().defaultContent();
        //frame2
        WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(frame2);
//
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Selenium");
        WebElement inputfield2 = driver.findElement(By.xpath("//*[@id=\"id2\"]/div/input"));

        System.out.println(inputfield2.getAttribute("value"));
        driver.switchTo().defaultContent();

        //frame3
        WebElement frame3 = driver.findElement(By.xpath("//frame[@src=\"frame_3.html\"]"));
        driver.switchTo().frame(frame3);


        WebElement enterString =
        driver.findElement(By.xpath("//input[@name='mytext3']"));
        enterString.sendKeys("java");
        //enterString.sendKeys(Keys.ENTER);

        WebElement inputfield3 = driver.findElement(By.xpath("//input[@name='mytext3']"));
        System.out.println(inputfield3.getAttribute("value"));


        //inner iframe
//        driver.navigate().
//                to("https://docs.google.com/forms/d/e/1FAIpQLScP-K8zi-9ar0MCq93D3VIFhegSNPveBfdLqiMfTYR9Q1iSKQ/viewform?embedded=true");
//        Set<String> windowIDs = driver.getWindowHandles();
//        List<String> windowList = new ArrayList(windowIDs);
//
//        String childID = windowList.get(0);
//
//        driver.switchTo().window(childID);
//        System.out.println(driver.getTitle());


        //Approach 2
        driver.switchTo().frame(0); // switchin to frame using index
        WebElement radioButton =
        driver.findElement(By.xpath("//*[@id=\"i5\"]/div[3]/div"));
        System.out.println("first radio button status is: " + radioButton.isSelected());
        radioButton.click();
        driver.quit();


//

    }
}
