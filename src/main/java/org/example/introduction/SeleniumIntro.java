package org.example.introduction;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntro {
    // Implement all methods in WebDriver
    public static void main(String[] args) {

        /*
         * Invoking browser
         * Chrome - ChromeDriver -> Method close get
         * Firefox - FirefoxDriver -> Method close get
         * Safari SafariDriver -> Method close get
         * Alt.
         * WebDriver
         * WebDriver methods + class methods
         *
         * Strict Browser Restriction
         * - invokes:
         * -- chromedriver.exe -> Chrome Browser
         *  	Reliance on this to launch Chrome browser
         *
         * Step to invoke chrome driver -> Runs chrome and closes
         * - Selenium Manager
         * */


        // Chrome
        System.setProperty("webdriver.chrome.driver", "/Users/williamhellems-moody/Documents/selenium-drivers/chromedriver");
        WebDriver driver = new ChromeDriver();


//		// FireFox
//		System.setProperty("webdriver.gecko.driver", "/Users/williamhellems-moody/Documents/selenium-drivers/geckodriver");
//		WebDriver driver = new FirefoxDriver();

//		// MS Edge
//		System.setProperty("webdriver.edge.driver", "/Users/williamhellems-moody/Documents/selenium-drivers/msedgedriver");
//		WebDriver driver = new EdgeDriver();


        // URL
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle()); // Obtain Title
        System.out.println(driver.getCurrentUrl()); // Obtain URL
        driver.close();
        // driver.quit();

    }
}
