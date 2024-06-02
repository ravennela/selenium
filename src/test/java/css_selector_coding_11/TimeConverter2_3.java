package css_selector_coding_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeConverter2_3 {
	public static WebDriver driver;
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://qatimeconverter.ccbp.tech/");
		WebElement hours_input=driver.findElement(By.cssSelector("input#inputHours"));
		WebElement minutes_input=driver.findElement(By.cssSelector("input[id$='Minutes']"));
		WebElement btn_convert=driver.findElement(By.cssSelector("button#convertBtn"));
		WebElement actual_result=driver.findElement(By.cssSelector("p[id^='time']"));
		hours_input.sendKeys("2");
		minutes_input.sendKeys("30");
		btn_convert.click();
		if(actual_result.getText().equals("9000")) {
			System.out.println("Conversion Successful");
		}
		else {
			System.out.println("Conversion Failed");
		}
		
		
	}

}
