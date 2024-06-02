package assesment_5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mobilepage_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\src\\Driver Versions\\chromedriver-win6428-03-24(123)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qamobilespecs.ccbp.tech/");
		List<WebElement>list_text=driver.findElements(By.xpath("//li[text()='3 GB RAM']/following-sibling::li[text()]"));
		for(WebElement text:list_text) {
			System.out.println(text.getText());
			
		}
		String[] order= {"5.80 Super Retina HD OLED Display", "Front Camera 7MP", 
					"Rear Camera 12MP + 12MP", "Apple A11 Bionic Processor", "Battery Capacity 2716mAH"};
		boolean specification_match=true;
		for (int i=0;i<order.length;i++) {
			String expected=order[i];
			String actual=list_text.get(i).getText();
			if(!expected.equals(actual)) {
				specification_match=false;
				break;
			}
			if(specification_match) {
			     System.out.println("Specifications match the expected order");
	        } else {
	            System.out.println("Mismatch found in specifications");
			}
	
		}
		WebElement act_heading=driver.findElement(By.xpath("//li[text()='3 GB RAM']//parent::ul//preceding-sibling::h1"));
		String expected_heading="Specifications:";
		if(act_heading.getText().equals(expected_heading)) {
			System.out.println("Verified Heading");
		}
		else {
			System.out.println("Mismatch Found in Heading");
		}
		driver.findElement(By.xpath("//h1[@class='details-heading']//parent::div//following::button")).click();
		driver.close();
	}

}
