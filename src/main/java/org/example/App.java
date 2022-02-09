package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Hello world!
 *
 */
 class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        By.ByLinkText driver;
        WebElement webElement = driver.findElement(By.xpath("//*[@id=\"ord-nav-links\"]/ul/li[3]/a"));
    }
}
