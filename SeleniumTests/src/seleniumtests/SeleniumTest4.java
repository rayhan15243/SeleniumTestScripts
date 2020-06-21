package seleniumtests;


//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;

public class SeleniumTest4 {
    
    public static void main(String[] args) {
   // WebDriver driver = new SafariDriver()
    	
    	
  // Test Script for Apply Button on the Course Study Pages.
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\k1786825\\Downloads\\SeleniumTests\\chromedriver_win32\\chromedriver.exe");
    	  WebDriver driver = new ChromeDriver();
    	    	
    	     
    	  //   System.setProperty("webdriver.gecko.driver", "C:\\Users\\k1786825\\Downloads\\SeleniumTests\\geckodriver-v0.26.0-win64\\geckodriver.exe");
    	  //  WebDriver driver = new FirefoxDriver();
    	
    	
    	
    	
    	
    	    driver.get("http://dev.preview.kcl-dev.contensis.cloud/study/undergraduate/courses/english");
    	    driver.manage().window().maximize();

   
    
    
    try {

        
    	Thread.sleep(2000);
        WebElement element =  driver.findElement(By.linkText("Apply"));
       
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style','background: blue; border: 7px solid red;');", element); 
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
        
        Thread.sleep(2000);
       
        driver.findElement(By.linkText("Apply")).click();
        
        
        Thread.sleep(4000);
        driver.quit();
    
      
       
      /**  Thread.sleep(3000);
      //   driver.navigate().to("http://localhost:8080/basket.php");
      //   Thread.sleep(2000);
      //  driver.findElement(By.id("order_now")).click();
       driver.navigate().to("http://localhost:8080/register.php"); */
        
        
    }catch(Exception e){
        System.out.println(e);
    }
    
    
    
    
    }
}
