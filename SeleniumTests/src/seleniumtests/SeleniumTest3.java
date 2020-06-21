

package seleniumtests;


//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumTest3 {
   
    public static void main(String[] args) {
   // WebDriver driver = new SafariDriver();
    	
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\k1786825\\Downloads\\SeleniumTests\\chromedriver_win32\\chromedriver.exe");
    	  WebDriver driver = new ChromeDriver();
    	    	
    	     
    	  //   System.setProperty("webdriver.gecko.driver", "C:\\Users\\k1786825\\Downloads\\SeleniumTests\\geckodriver-v0.26.0-win64\\geckodriver.exe");
    	  //  WebDriver driver = new FirefoxDriver();
    	
    	
    	
    	
    	
    driver.get("http://dev.preview.kcl-dev.contensis.cloud/study/undergraduate/courses/english");
    driver.manage().window().maximize();

   
 // Script that clicks on a widget button to open up course stats for the Course Study Pages.    
    
    try {
        Thread.sleep(3000);
   
        
        WebElement Elmnt = driver.findElement(By.className("widget-cta-button"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style','background: yellow; border: 7px solid red;');", Elmnt); 
        Actions actions = new Actions(driver);
        actions.moveToElement(Elmnt);
        actions.perform();
        
        Thread.sleep(4000);
      
        driver.findElement(By.className("widget-cta-button")).click();
        

        Thread.sleep(4000);
        driver.quit();
       
   
        
    }catch(Exception e){
        System.out.println(e);
        
    }
    
    
    
    
    }
}


/**Testing if user can add a product to the basket 
//   Thread.sleep(3000);
//   driver.navigate().to("http://localhost:8080/basket.php");
//   Thread.sleep(2000);
//  driver.findElement(By.id("order_now")).click();
 driver.navigate().to("http://localhost:8080/register.php");*/