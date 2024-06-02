package x_path_Functions_text_position_contains_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Countertest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\src\\Driver Versions\\chromedriver-win6405-02-24\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qaclickcounter.ccbp.tech/");
        
        for (int i = 1; i <= 100; i++) {
            WebElement clickMeButton = driver.findElement(By.xpath("//*[contains(text(),'Click Me!')]"));
            clickMeButton.click();
            
            WebElement counter = driver.findElement(By.xpath("//*[contains(@class,'counter-value')]"));
            String countText = counter.getText();
            
            if (countText.equals(String.valueOf(i))) {
                System.out.println("Matched Count: " + i);
            } else {
                System.out.println("Mismatched Count: " + countText);
                break;
            }
        }
        
        System.out.println("Click Counter App: Working as expected");
        driver.quit();
    }
}