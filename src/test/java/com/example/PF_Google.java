package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import net.thucydies.core.webdriver.DriverSource;

public class PF_Google implements DriverSource {

    @FindBy(xpath="//input[@name='q']")
    private WebElement searchBox;

    @FindBy(xpath="//input[text()='Search Google or type a URL']")
    private WebElement googleSearchBox;

public void main(String[] args) {
    driver.get("https://google.com");
    PF_Google.searchBox.sendKeys("Automation Step by Step");
}


    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public WebDriver newDriver() {
        try{
            System.setProperties("webdriver.chrome.driver", "chromedriver.exe");
            return new ChromeDriver();
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public void Search ()
    {   
        driver.get("https://google.com");
        searchBox.sendKeys("Automation Step by Step");
        googleSearchBox.click();
    }

}