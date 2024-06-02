package assesment_10;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FitnessExcersise_2 {
	public static WebDriver driver;
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://qafitnesslib.ccbp.tech/");
		Wait<WebDriver>wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofMillis(500));
		

	}

}
