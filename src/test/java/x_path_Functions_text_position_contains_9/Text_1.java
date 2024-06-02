package x_path_Functions_text_position_contains_9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Text_1 {

	public static void main(String[] args) {
		try {	
			System.setProperty("webdriver.chrome.driver","C:\\src\\Driver Versions\\chromedriver-win6405-02-24\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://qatabs.ccbp.tech/");
			driver.manage().window().maximize();
			//part1 about checking
			driver.findElement(By.xpath("//button[starts-with(@id,'aboutButton')]")).click();
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(("//div[@id='aboutTab']"))));
			WebElement abouttext= driver.findElement(By.xpath("//p[@id='aboutTabContent']"));
			String Expected_text="Varanasi is one of the oldest living cities in the world. Its Prominence in Hindu mythology is virtually unrevealed. Mark Twain, the English author and literature, who was enthralled by the legend and sanctity of Benaras, once wrote, \"Benaras is older than history, older than tradition, older even than legend and looks twice as old as all of them put together\".";
			if(Expected_text.equals(abouttext.getText())) {
				System.out.println("About Contnent Matched");
			}
			else {
				System.out.println("About Contnent Mimatched");
			}
			//part2 time to visit
			driver.findElement(By.xpath("//button[starts-with(@id,'timeToVisitButton')]")).click();
			WebDriverWait visit_wait= new WebDriverWait(driver,Duration.ofSeconds(10));
			visit_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='timeToVisitTab']")));
			WebElement current_visit_text=driver.findElement(By.xpath("//p[startswith(@id,'timeToVisitTab')]"));
			String expected_visit_text="October to March is the best time to visit Varanasi because most of the fairs here are held during this time of the year. Festivities begin with Diwali and continue to Dev Diwali celebrated on the 15th day from Diwali. In between, there is also Annakut. During this time, the ghats are lit with lights and diyas. Earthen lamps adorn the staircase of the ghats and are also afloat in the river. Firecrackers burn through the night, and it's a sight no one should miss.";
			if (current_visit_text.equals(expected_visit_text)) {
				System.out.println("Time to Visit Content Matched");
			}
			else {
				System.out.println("Mismatch in the 'Time to Visit' Content");
			}
			//part3 Attractions
			driver.findElement(By.xpath("//button[starts-with(@id,'attractionsButton')]")).click();
			WebDriverWait attractions_wait= new WebDriverWait(driver,Duration.ofSeconds(10));
			attractions_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='timeToVisitTab']")));
			WebElement attractions_text=driver.findElement(By.xpath("//p[startswith(@id,aboutTabContent')]"));
			String expected_attractions_text="When visiting Varanasi, one comes across plenty of ghats, but among them, Dashashwamedh Ghat is said to be one of the oldest and most important. This ghat, leading to the Ganges, is located close to the famous old Vishwanath temple in Kashi (today’s Banaras). Another famous attraction is River Ganges which is the holiest river by the Hindus and many more.";
			if(attractions_text.equals(expected_attractions_text)) {
				System.out.println("Time to Visit Content Matched");
			}
			else {
				System.out.println("Time to Visit Content Not Matched");
			}
			driver.close();
			
			
		}
		catch(Exception e) {
			System.out.println("An exception occurred: " + e.getMessage());
		}

	}

}
	