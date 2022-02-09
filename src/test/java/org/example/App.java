package org.example;

import  io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class App
{
    public static void main( String[] args )
    {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("start-maximazed"); // открытие полноэкранного формата
        options.addArguments("--incognito"); // открытие страницы в режиме инкогнито
        options.addArguments("isable-popup-blocking"); //  блакировка всплывающих окон

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.bbc.com");

    }
}
