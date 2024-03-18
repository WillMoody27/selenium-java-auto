package org.example.introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators {
    public static void main(String[] args) {
        // Chrome
        System.setProperty("webdriver.chrome.driver", "/Users/williamhellems-moody/Documents/selenium-drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Implicit Wait - Selenium waits for 5 seconds before throwing an exception. Assist with synchronization issues.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("<ENTER URL>");

        // Locators
        driver.findElement(By.id("inputUsername")).sendKeys("william");
        driver.findElement(By.name("inputPassword")).sendKeys("hello123");
        driver.findElement(By.className("signInBtn")).click();

        /*
        * Selenium scans from top to bottom!!
        *
        * Can use CSS and Xpath
        * - CSS
        * -- Tag and ID
        *       id -> tagname#id -> input#inputUsername
        * If no class or id, use tagname and attribute
        *      input[name='inputPassword']
        * -- Construct a CSS selector using class to identify the element
        *       input[placeholder="Username"]
        * */

        System.out.println(driver.findElement(By.cssSelector("p.error")).getText()); // extract text from error message
    }
}
