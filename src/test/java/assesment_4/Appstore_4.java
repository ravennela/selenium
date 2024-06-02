package assesment_4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Appstore_4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\src\\Driver Versions\\chromedriver-win6428-03-24(123)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qaappstore.ccbp.tech");
		//task-1 Test the apps count in each tab.
		//testcase 1a
		driver.findElement(By.xpath("//button[text()='Social']")).click();
		String social_app_count_ideal="10";
		List<WebElement>social_app_count_actual=driver.findElements(By.xpath("//li[@class='app-item']"));
		if(social_app_count_ideal.equals(String.valueOf(social_app_count_actual))) {
			System.out.println("Social apps count is correct");
		}
		else {
			System.out.println("Social apps count is incorrect");
		}
		//testcase 1b
		driver.findElement(By.xpath("//button[text()='Games']")).click();
		String games_count_ideal="10";
		List<WebElement>game_count_actual=driver.findElements(By.xpath("//li[@class='app-item']"));
		if(games_count_ideal.equals(String.valueOf(game_count_actual))){
			System.out.println("Games count is correct");
		}
		else {
			System.out.println("Gamescount is incorrect");
		}
		//testcase 1c
		driver.findElement(By.xpath("//button[text()='News']")).click();
		//testcase 1d
		driver.findElement(By.xpath("//button[text()='Food']")).click();

	}

}
