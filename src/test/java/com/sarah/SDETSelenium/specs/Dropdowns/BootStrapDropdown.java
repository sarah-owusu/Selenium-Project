package com.sarah.SDETSelenium.specs.Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class BootStrapDropdown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url = "https://www.jquery-az.com/boots/demo.php?ex=63.0_2";
        driver.get(url);
        driver.manage().window().maximize();

        //opening drop down options
        driver.findElement(By.xpath("//span[@class='multiselect-selected-text']")).click();
        driver.findElement(By.xpath("//input[@type='checkbox' and @value='jQuery']")).click();

        //capture all options and find the size
/*        List<WebElement> options = driver.findElement(By.xpath("//ul[contains(@class='multiselect']//label"));*/
        List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class, 'multiselect')]//label"));
        System.out.println("number of options : " + options.size());
        for(WebElement op : options){
           // System.out.println(op.getText());

            //select multiple options
            String option = op.getText();
            if(option.equals("java") || option.equals("Python") || option.equals("MySQL")){
                op.click();
            }
        }

    }
}
