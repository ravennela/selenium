package x_path_Functions_text_position_contains_9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ArrayIndex_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\src\\Driver Versions\\chromedriver-win6405-02-24\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qanumberindex.ccbp.tech/");
		driver.manage().window().maximize();
		WebElement text=driver.findElement(By.xpath("//p[contains(text(), '[ 17, 31, 77, 20, 63 ]')]"));
		
		String Expected_array="[ 17, 31, 77, 20, 63 ]";
		if(Expected_array.equals(text.getText())){
			System.out.println("Default Array Matched");
		}
		else {
			System.out.println(" Array Not Matched");
		}
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[contains(@id,'userInput')]")).sendKeys("45");
		driver.findElement(By.xpath("//button[contains(@id,'findBtn')]")).click();
		WebElement check_result=driver.findElement(By.xpath("//span[contains(@id,'indexOfNumber')]"));
		
		String Expected_text_1="-1";
		if(Expected_text_1.equals(check_result.getText())){
			System.out.println("Index matched for the number 48");
		}
		else {
			System.out.println("Index mismatched for the number 48");
		}
		driver.findElement(By.xpath("//input[contains(@id,'userInput')]")).clear();
		driver.findElement(By.xpath("//input[contains(@id,'userInput')]")).sendKeys("17");
		driver.findElement(By.xpath("//button[contains(@id,'findBtn')]")).click();
		String Expected_text_2="17";
		if(Expected_text_2.equals(check_result.getText())){
			System.out.println("Index matched for the number 17");
		}
		else {
			System.out.println("Index mismatched for the number 17");
		}
		driver.close();
		
		
	}

}
