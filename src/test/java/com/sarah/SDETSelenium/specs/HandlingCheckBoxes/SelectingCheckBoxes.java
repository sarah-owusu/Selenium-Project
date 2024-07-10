package com.sarah.SDETSelenium.specs.HandlingCheckBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SelectingCheckBoxes {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //1) select specific checkBox
        //driver.findElement(By.xpath("//input[@id='sunday']")).click();

        //2) Capture all check boxes
//        List<WebElement> checkBoxes =
//        driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
//       for(int i = 0; i < checkBoxes.size(); i++)
//       {
//           checkBoxes.get(i).click();
//       }

        //Approach 3. use enhanced for loop
//        List<WebElement> checkBoxes =
//                driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
//        for(WebElement checkBox : checkBoxes)
//        {
//            checkBox.click();
//            driver.quit();
//        }

        // Selecting last three checkBoxes

//        List<WebElement> checkBoxes =
//                driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
//               for(int i = 4; i < checkBoxes.size(); i++)
//       {
//           checkBoxes.get(i).click();
//       }

               // select first three checkBoxes
        List<WebElement> checkBoxes =
                driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
        for(int i = 0; i < checkBoxes.size()-4; i++){
            checkBoxes.get(i).click();
        }

        //driver.quit();
    }
}
