package org.example.introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {
        // Chrome
        System.setProperty("webdriver.chrome.driver", "/Users/williamhellems-moody/Documents/selenium-drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        // Type the search query into the search box using the class name locator
        driver.findElement(By.className("gLFyf")).sendKeys("What is Selenium");

    }
}
