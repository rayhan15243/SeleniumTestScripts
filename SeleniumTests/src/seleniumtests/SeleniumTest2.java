package seleniumtests;


//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;


/**
 *
 * @author Rayhan
 */


// Script for testing tabbed structure 

public class SeleniumTest2 {
     
	
	//  public static final String USERNAME = "testuser690";
	//  public static final String AUTOMATE_KEY = "J81xRc6KWyWzpLaNjF7R";
	//  public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
	 public static void main(String[] args) {
		   // WebDriver driver = new SafariDriver();
		 
		 
		 
	//	 DesiredCapabilities caps = new DesiredCapabilities();
		 
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\k1786825\\Downloads\\SeleniumTests\\chromedriver_win32\\chromedriver.exe");
   WebDriver driver = new ChromeDriver();
		 
		     
	//	    System.setProperty("webdriver.gecko.driver", "C:\\Users\\k1786825\\Downloads\\SeleniumTests\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	//	  WebDriver driver = new FirefoxDriver();
		 
		 
		 
		 
		    driver.get("http://dev.preview.kcl.contensis.cloud/study/undergraduate/courses/english-test");
		    driver.manage().window().maximize();

		   
		    
		    
		    try {
		      
		        driver.findElement(By.id("courseEssentials")).click();
		        driver.findElement(By.id("entryRequirements")).click();
		        driver.findElement(By.id("teaching&Structure")).click();
		        driver.findElement(By.id("careers")).click();
		        driver.findElement(By.id("fees&Funding")).click();
		        driver.quit();
		       
		   
		        
		    }catch(Exception e){
		        System.out.println(e);
		    }
		    
		    
		    
		    
		    }
		}

/** Testing if Dustbuster contact form work
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
*/ 