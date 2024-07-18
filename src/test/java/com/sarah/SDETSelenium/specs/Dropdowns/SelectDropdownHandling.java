package com.sarah.SDETSelenium.specs.Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class SelectDropdownHandling {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url = "https://testautomationpractice.blogspot.com/";
        driver.get(url);
        driver.manage().window().maximize();

        // implementing select type dropdown using the Select class
        WebElement drpCountryEle = driver.findElement(By.xpath("//select[@class='form-control' and @id='country']"));
        Select drpCountry = new Select(drpCountryEle);

        // select drop down by visible text
        System.out.println("using the select class");
        drpCountry.selectByVisibleText("France");
        System.out.println(drpCountryEle.getText());

        System.out.println("Selecting a dropdown by the value, only if it has value attribute");
        // select drop down by value text - not mostly used
        //drpCountry.selectByValue("Japan");

        //Select by index
        System.out.println("using the selectByIndex method");
        drpCountry.selectByIndex(2);

        // capturing the options from the drop-down
        List<WebElement> options = drpCountry.getOptions();
        //System.out.println("number of options is : " + options.size());

        //printing all the options
        System.out.println("printing all options in the dropdown");
        for(int i = 0; i<options.size(); i++){
            System.out.println(options.get(i).getText());
        }
//
//        //enhanced for loop
        System.out.println("using the enhance for loop to print all the options in the drop down");
        for(WebElement op : options){
            System.out.println(op.getText());
        }



    }
}
