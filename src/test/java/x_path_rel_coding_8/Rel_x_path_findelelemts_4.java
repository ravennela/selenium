 package x_path_rel_coding_8;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Rel_x_path_findelelemts_4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\src\\Driver Versions\\chromedriver-win6405-02-24\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qatunes.ccbp.tech/");
		driver.findElement(By.xpath("//*[@id='genre']")).click();
		Select individual= new Select(driver.findElement(By.xpath("//*[@id='genre']")));
		individual.selectByValue("pop");
		driver.findElement(By.xpath("//*[@id='getButton']")).click();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='song-title']")));
		List<WebElement>Genere_drop=driver.findElements(By.xpath("//*[@class='song-title']"));
		if(Genere_drop.size()>0) {
			System.out.println(Genere_drop.size()+"Songs Displayed");
		}
		else {
			System.out.println("No Song in this Genere");
		}
		
		individual.selectByIndex(1);
		driver.findElement(By.xpath("//*[@id='getButton']")).click();
		WebDriverWait wait1= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='song-title']")));
		List<WebElement>Rock_drp=driver.findElements(By.xpath("//*[@class='song-title']"));
		if (Rock_drp.size()>0) {
			System.out.println(Rock_drp.size()+"Songs Displayed");
		}
		else {
			System.out.println("No Song in this Genere");
		}
		driver.close();
	}

}
