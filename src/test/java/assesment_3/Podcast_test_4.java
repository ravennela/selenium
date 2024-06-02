package assesment_3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Podcast_test_4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\src\\Driver Versions\\chromedriver-win6428-03-24(123)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qapodcastpage.ccbp.tech/");
		driver.findElement(By.xpath("//*[@onclick='puri()']")).click();
		List<WebElement>podcast_puri=driver.findElements(By.xpath("//*[contains(@class,'podcast-episode-container')]"));
		if(podcast_puri.size()==4) {
			System.out.println("All Four Episodes Found");
			}
		else {
			System.out.println("All"+podcast_puri.size()+"Episodes are found");
		}
		driver.findElement(By.xpath("//button[@class='button']")).click();
		
		

	}

}
