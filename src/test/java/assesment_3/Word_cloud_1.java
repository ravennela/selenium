package assesment_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Word_cloud_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\src\\\\Driver Versions\\chromedriver-win6405-02-24\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://qawordcloud.ccbp.tech/");
		driver.findElement(By.xpath("/html/body/div/div[2]/div/input")).sendKeys("light");
		driver.findElement(By.xpath("/html/body/div/div[2]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div/div[2]/div/input")).clear();
		driver.findElement(By.xpath("/html/body/div/div[2]/div/input")).sendKeys("flight");
		driver.findElement(By.xpath("/html/body/div/div[2]/div/button")).click();
		driver.close();
	}

}
