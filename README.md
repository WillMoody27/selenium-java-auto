# Selenium WebDriver Introduction [My Review]

- ### NOTE: This Repo is a part of my learning journey of Selenium WebDriver and Automation. 👨🏾‍💻

This repository contains a Java code snippet for automating browser interactions using Selenium WebDriver. The code demonstrates basic usage of Selenium WebDriver for locating elements on a web page and performing actions such as entering text and clicking buttons.

## What You Need

- Java Development Kit (JDK) installed
- Selenium WebDriver Java bindings
- ChromeDriver (for running tests in Google Chrome)

## Usage

1. Clone the repository to your local machine:

   ```bash
   git clone https://github.com/WillMoody27/selenium-java-auto.git
   ```

2. Ensure you have the necessary dependencies installed.

These dependencies are required to run the Selenium WebDriver code and are found in the `pom.xml` file:
```java
    <dependencies>
        <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>4.18.1</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.testng/testng -->
        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>7.9.0</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
```

These are dependencies for Selenium WebDriver and TestNG pulled from Maven Central Repository. The versions may change, so ensure you have the latest versions installed. You can install them using Maven or your preferred build tool.

3. Set the system property for ChromeDriver with the correct path to the executable:

   ```java
   System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
   ```

4. Run the `Locators.java` file to execute the Selenium WebDriver code.

## Code Overview

The `Locators.java` file demonstrates the following:

- Setting up ChromeDriver and navigating to a web page.
- Locating elements on the web page using various locators such as ID, Name, Class Name, CSS Selector, and XPath.
- Performing actions on elements, such as sending keys and clicking buttons.

## Additional Notes

- The code includes comments explaining different aspects of Selenium WebDriver usage and locator strategies.
- I will also be updating the code to include more advanced Selenium WebDriver features and best practices as I learn them. 🫡
- You can modify the code to suit your specific testing needs or integrate it into your test automation framework.