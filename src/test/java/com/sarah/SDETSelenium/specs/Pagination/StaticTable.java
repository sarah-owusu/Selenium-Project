package com.sarah.SDETSelenium.specs.Pagination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.time.Duration;

public class StaticTable {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String url = "https://testautomationpractice.blogspot.com/";
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Multiple tables in a web page
        int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        System.out.println("Number of rows " + rows);

        // if single table in your web page
        //int row = driver.findElements(By.tagName("tr")).size();

        //2) find total number of columns in a table
        int columns = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
        System.out.println("The number of columns are " + columns);

       //String bookName =  driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]/td[1]")).getText();
        //System.out.println(bookName);
        //driver.close();

//        System.out.println("BookName" + "\t" + "Author"+ "\t" + "Subject" + "\t" + "price");
//        //4) read data from all the rows and columns using xpath syntax
//        for (int r=2; r<=rows; r++){
//            for (int c=1; c<=columns; c++){
//                String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td["+c+"]")).getText();
//                System.out.println(value+"\t");
//            }
//        }

        // orint book name's Author's
//        for(int r = 2; r<=rows; r++){
//            String authoName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]/td[1]")).getText();
//            if(authoName.equals("Mukesh")){
//                String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();
//                System.out.println(bookName+"\t" + authoName);
//            }
//        }

        int total = 0;
        for (int r=2; r<=rows; r++){
            String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[4]")).getText();

            total=total+Integer.parseInt(price);
            System.out.println("totale price of the book is " + total);
        }


    }
}
