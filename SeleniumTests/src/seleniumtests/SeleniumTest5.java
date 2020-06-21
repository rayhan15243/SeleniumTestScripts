package seleniumtests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumTest5 {

	public static void main(String[] args) {
		
		
		
		// Test Script for Social Media Footer
		
		 // WebDriver driver = new SafariDriver();


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\k1786825\\Downloads\\SeleniumTests\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
  	    	
  	     
  	//   System.setProperty("webdriver.gecko.driver", "C:\\Users\\k1786825\\Downloads\\SeleniumTests\\geckodriver-v0.26.0-win64\\geckodriver.exe");
  	//  WebDriver driver = new FirefoxDriver();
		
		
		
	    driver.get("http://dev.preview.kcl-dev.contensis.cloud/study/undergraduate/courses/english");
	    driver.manage().window().maximize();

	   
	    
	    
	    try {
	    	
	    	
	    	
	    	Thread.sleep(3000);
	        WebElement element =  driver.findElement(By.className("FooterSocialMedia__FooterSocialMediaStyled-sc-1o8y4mm-0"));
	       
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].setAttribute('style',' border: 7px solid red;');", element); 
	        Actions actions = new Actions(driver);
	        actions.moveToElement(element);
	        actions.perform();
	      
	    	Thread.sleep(3000);
	        driver.findElement(By.className("bDloTt")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.className("eOhcjZ")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.className("cKVwhy")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.className("ebQgPy")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.className("fesxZI")).click();
	    	
	    	

	        Thread.sleep(6000);
	        driver.quit();
	       
	   
	        
	    }catch(Exception e){
	        System.out.println(e);
	    }
	    
	    
	    
	    
	    }
		
			
		
	}


