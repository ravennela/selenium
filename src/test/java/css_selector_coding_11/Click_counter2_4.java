package css_selector_coding_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_counter2_4 {
	public static WebDriver driver; 
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://qaclickcounter.ccbp.tech/");
		WebElement button=driver.findElement(By.cssSelector("button.button"));
		WebElement span=driver.findElement(By.cssSelector("span.counter-value"));
		int clickCount=0;
		for(int i=1;i<=100;i++) {
			button.click();
			clickCount++;
		}
		String clickCount_str=Integer.toString(clickCount);
		if(span.getText().equals(clickCount_str)) {
			System.out.println("Click Counter App: Working as expected");
		}
		else {
			System.out.println("Mismatch in count");
		}

	}

}
