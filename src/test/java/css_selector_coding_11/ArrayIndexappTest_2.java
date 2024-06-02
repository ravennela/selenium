package css_selector_coding_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayIndexappTest_2 {
	public static WebDriver driver;
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://qanumberindex.ccbp.tech/");
		String array_text=driver.findElement(By.cssSelector("p[class*=default-array]")).getText();
		String expected_array="[ 17, 31, 77, 20, 63 ]";
		if(array_text.equals(expected_array)) {
			System.out.println("Default Array Matched");
		}
		else {
			System.out.println("Mismatch in Default Array");
		}
		WebElement text_box=driver.findElement(By.cssSelector("input#userInput"));
		WebElement button=driver.findElement(By.cssSelector("button#findBtn"));
		text_box.sendKeys("48");
		String actual_result_1=driver.findElement(By.cssSelector("span#indexOfNumber")).getText();
		String expected_result_1="-1";
		if(actual_result_1.equals(expected_result_1)) {
			System.out.println("Index matched for the number 48");
		}
		else {
			System.out.println("Index mismatched for the number 48");
		}
		text_box.clear();
		
		
		

	}

}
