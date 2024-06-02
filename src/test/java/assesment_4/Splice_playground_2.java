package assesment_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Splice_playground_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\src\\Driver Versions\\chromedriver-win6428-03-24(123)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qaspliceplygr.ccbp.tech/");
		driver.findElement(By.xpath("//input[starts-with(@id,'startIndexInput')]")).sendKeys("2");
		driver.findElement(By.xpath("//input[starts-with(@id,'deleteCountInput')]")).sendKeys("0");
		driver.findElement(By.xpath("//input[starts-with(@id,'itemToAddInput')]")).sendKeys("pen");
		driver.findElement(By.xpath("//button[text()='Splice']")).click();
		String Expected_array="[1,7,\"pen\",3,1,0,20,77]";
		WebElement Current_array=driver.findElement(By.xpath("//span[starts-with(@id,'updatedArray')]"));
		if(Expected_array.equals(Current_array.getText())) {
			System.out.println("Expected array"+Current_array.getText());
		}
		else {
			System.out.println("Array not updated as expected");
		}
		driver.close();
	}

}
