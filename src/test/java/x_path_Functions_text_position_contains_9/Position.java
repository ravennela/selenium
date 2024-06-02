package x_path_Functions_text_position_contains_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Position {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\src\\Driver Versions\\chromedriver-win6405-02-24\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qatimeconverter.ccbp.tech/");
		driver.findElement(By.xpath("//*[contains(@class,'time-input')][1]")).sendKeys("2");
		driver.findElement(By.xpath("//*[contains(@class,'time-input')][2]")).sendKeys("30");
		driver.findElement(By.xpath("//*[contains(@id,'convertBtn')]")).click();
		String validating_result="9000";
		WebElement result=driver.findElement(By.xpath("//p[starts-with(@id,'timeInSeconds')]"));
		if(validating_result.equals(result.getText())) {
			System.out.println("Conversion Successful");
		}
		else {
			System.out.println("Conversion Failed");
		}
		driver.findElement(By.xpath("//*[contains(@class,'time-input')][1]")).clear();
		driver.findElement(By.xpath("//*[contains(@class,'time-input')][2]")).clear();
		driver.findElement(By.xpath("//*[contains(@id,'convertBtn')]")).click();
		
		}

}
