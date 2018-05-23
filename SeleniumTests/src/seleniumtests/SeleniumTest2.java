package seleniumtests;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;


/**
 *
 * @author Rayhan
 */
public class SeleniumTest2 {
     
    // Testing if Dustbuster contact form work
    public static void main(String[] args) {
    WebDriver driver = new SafariDriver();
    driver.get("http://localhost:8080/contact.html");
    driver.manage().window().maximize();

    
    try {
        Thread.sleep(1000);
        driver.findElement(By.id("name")).sendKeys("John Smith");
        Thread.sleep(1000);
        driver.findElement(By.id("email")).sendKeys("js@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("boxting")).sendKeys("This a message typed inside a textbox");
        Thread.sleep(2000);
        driver.findElement(By.id("reset_message")).click();
    }catch(Exception e){
        System.out.println(e);
    }
    
    }
    
}
