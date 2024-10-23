package com.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import net.thucydies.core.webdriver.DriverSource;

public class LocalSerenityDriver implements DriverSource {
    public WebDriver newDriver(){
        
        try{
        System.setProperties("webdriver.chrome.driver", "chromedriver.exe");
        return new ChromeDriver();
        }    
        catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public boolean takeScreenshot() {
        return true;
    }
}   
