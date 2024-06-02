package assesment_4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Destination_search_3  {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\src\\Driver Versions\\chromedriver-win6428-03-24(123)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qadest.ccbp.tech");

        // Verify total count of destinations
        String expectedTotalCount = "12";
        int currentCount = driver.findElements(By.xpath("//li[@class='destination-item']"))
                                  .size();
        if (expectedTotalCount.equals(String.valueOf(currentCount))) {
            System.out.println("Destinations count is correct");
        } 
        else {
            System.out.println("Destinations count is incorrect");
        }

        // Entering text "io" into search field
        driver.findElement(By.xpath("//*[contains(@placeholder,'Search')]"))
              .sendKeys("io");

        // Verify count of destinations after searching for "io"
        String firstIOActualCount = "4";
        if (firstIOActualCount.equals(String.valueOf(currentCount))) {
            System.out.println("Destinations count is correct after searching for 'io'");
        }
        else 
        {
            System.out.println("Destinations count is incorrect after searching for 'io'");
        }

        // Verifying the count of elements containing 'io' in their text
        List<WebElement> searchedCount = driver.findElements(By.xpath("//p[contains(text(),'io')]"));
        String validationCount = "4";
        if (validationCount.equals(String.valueOf(searchedCount.size()))) 
        {
            System.out.println("Validation count is correct");
        } 
        else {
            System.out.println("Search functionality is not as expected");
        }
        driver.findElement(By.xpath("//*[contains(@placeholder,'Search')]")).clear();
        driver.findElement(By.xpath("//*[contains(@placeholder,'Search')]")).sendKeys("ion");
        List<WebElement>searched_count_1=driver.findElements(By.xpath("//p[contains(text(),'io')]"));
        String validation_count_1="3";
      if(validation_count_1.equals(String.valueOf(searched_count_1.size()))) {
        	for(WebElement element:searched_count_1) {
        		System.out.println(element.getText());
        	}
        } 
        else {
            System.out.println("Search functionality is not as expected");
        }

         //Close the browser window
        driver.quit();
    }
}
