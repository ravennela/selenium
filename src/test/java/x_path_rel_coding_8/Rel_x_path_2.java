package x_path_rel_coding_8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rel_x_path_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\src\\Driver Versions\\chromedriver-win6405-02-24\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qakeycode.ccbp.tech/");
		driver.findElement(By.xpath("//*[@id='userInput']")).sendKeys("hello");
		List<WebElement>key_code=driver.findElements(By.xpath("//*[@class='mt-1 keycode-item']"));
		if(key_code.size()>0) {
			System.out.println("Found Five Key Codes");
		}
		else {
			System.out.println("Mismatch in Key Code Count");
		}
		driver.findElement(By.xpath("//*[@id='userInput']")).clear();
		driver.findElement(By.xpath("//*[@id='userInput']")).sendKeys("world");
		List<WebElement>key_code_1=driver.findElements(By.xpath("//*[@class='mt-1 keycode-item']"));
		if(key_code_1.size()>0) {
			System.out.println("Found Ten Key Codes");
		}
		else {
			System.out.println("Mismatch in Key Code Count");
		}
		
	}

}	
