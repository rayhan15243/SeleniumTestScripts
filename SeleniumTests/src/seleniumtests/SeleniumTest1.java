package seleniumtests;

// import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.safari.SafariDriver;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



//Script that opens up the course study pages in Chrome, Firefox and Safari. 



public class SeleniumTest1 {

  
    
    public static void main(String[] args) {
    	
    // New instant of Safari Web Driver:
    // WebDriver driver = new SafariDriver();
   
 //  System.setProperty("webdriver.chrome.driver", "C:\\Users\\k1786825\\Downloads\\SeleniumTests\\chromedriver_win32\\chromedriver.exe");
//  WebDriver driver = new ChromeDriver();
    	
     
   System.setProperty("webdriver.gecko.driver", "C:\\Users\\k1786825\\SeleniumTestScripts\\geckodriver-v0.26.0-win64\\geckodriver.exe");
   WebDriver driver = new FirefoxDriver();
    
    driver.get("https://uatmy.corehr.com/pls/coreportal_kclx/");
    
    driver.manage().window().maximize();
    
    
    try {
      
    	
    
 
   WebElement email = driver.findElement(By.id("p_username"));
   WebElement password = driver.findElement(By.name("p_password"));
   WebElement login = driver.findElement(By.id("login-button"));
   
   email.sendKeys("ITPROFILE1");
   password.sendKeys("Kingscollegelondon2020!");
   login.click();
   
   
    }catch(Exception e){
        System.out.println(e);
    }
    

    }
    
}
