package coding_15_waits;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Recipe_fluent_2 {
	public static WebDriver driver;
	public static void main(String[] args) {
		/*WebDriver driver=new ChromeDriver();
		driver.get("https://qarecipepage.ccbp.tech/");
		Wait<WebDriver>wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofMillis(500));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("ul#categoryList")));
		List<WebElement>recipe_categories=driver.findElements(By.xpath("//li"));
		for(WebElement recipe:recipe_categories) {
			recipe.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#recipeList")));
			List<WebElement>recipe_list=driver.findElements(By.xpath("//div[@id='recipeList']//child::li"));
			for(WebElement receipe_items:recipe_list) {
				receipe_items.click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='recipe']")));
				WebElement recipe_heading_locate=driver.findElement(By.xpath("//div[@id='recipe']//child::h3"));
				System.out.println(recipe_heading_locate.getText());
				List<WebElement>ingredient=driver.findElements(By.xpath("//div[@id='recipe']/descendant::ul/li"));
				for(WebElement ingredient_list:ingredient) {
					System.out.println(ingredient_list.getText());
					
				}
				
			}
		}*/
		 // Launch Chrome Browser
        WebDriver driver = new ChromeDriver();

        // Navigate to the Recipe page
        driver.get("https://qarecipepage.ccbp.tech/");

        // Declare a Fluent Wait for a maximum of '5' Seconds and polling every '500' milliseconds
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofMillis(500));

        // Find the Recipe Category List elements
        List<WebElement> categoryList = driver.findElements(By.cssSelector("li"));

        for (WebElement category : categoryList) {

            // Click the Recipe Category
            category.click();

            // Wait until the Recipe List is visible
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#recipeList li")));

            // Find the Recipe List elements
            List<WebElement> recipeList = driver.findElements(By.cssSelector("div#recipeList li"));

            for (WebElement recipe : recipeList) {

                // Click the Recipe
                recipe.click();

                // Wait until the Recipe is visible
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#recipe>h3")));

                // Print the Recipe Name
                WebElement recipeEle = driver.findElement(By.cssSelector("div#recipe>h3"));
                System.out.println(recipeEle.getText());

                // Print the Recipe Ingredients
                List<WebElement> ingredientsList = driver.findElements(By.cssSelector("div#recipe>ul>li"));
                for (WebElement ingredient : ingredientsList) {
                    System.out.println(ingredient.getText());
                }
            }
        }

        // Quit the WebDriver instance
        driver.quit();
    }
		

	}


