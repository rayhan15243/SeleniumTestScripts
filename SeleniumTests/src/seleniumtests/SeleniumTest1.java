
package seleniumtests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;




public class SeleniumTest1 {

    
    // Testing if Dustbuster website opens in Safari 
    public static void main(String[] args) {
    WebDriver driver = new SafariDriver();
    driver.get("http://localhost:8080");
    driver.manage().window().maximize();
    }
    
}
