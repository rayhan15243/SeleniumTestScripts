

package seleniumtests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SeleniumTest3 {
     // Testing if user can add a product to the basket
    public static void main(String[] args) {
    WebDriver driver = new SafariDriver();
    driver.get("http://localhost:8080/products.php");
    driver.manage().window().maximize();

    
    try {
        Thread.sleep(2000);
        driver.findElement(By.id("basket_add")).click();
        Thread.sleep(3000);
        driver.navigate().to("http://localhost:8080/basket.php");
        Thread.sleep(2000);
        driver.findElement(By.id("order_now")).click();
        driver.navigate().to("http://localhost:8080/register.php");
    }catch(Exception e){
        System.out.println(e);
    }
    
    
    
    
    }
}
