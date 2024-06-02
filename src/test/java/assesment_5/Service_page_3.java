package assesment_5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Service_page_3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\src\\Driver Versions\\chromedriver-win6428-03-24(123)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qaservicesect.ccbp.tech/");
		List<WebElement>card_header=driver.findElements(By.xpath("(//h1[@class='services-card-title'])[3]//ancestor::div//preceding::h1[@class='services-card-title']"));
		List<WebElement>card_description =driver.findElements(By.xpath("(//h1[@class='services-card-title'])[3]//ancestor::div//preceding::p[@class='services-card-description']"));
		WebElement section_header=driver.findElement(By.xpath("(//h1[@class='services-card-title'])[3]//ancestor::div[2]//preceding::div[5]//child::h1[@class='services-section-heading']"));
		WebElement section_text=driver.findElement(By.xpath("(//h1[@class='services-card-title'])[3]//ancestor::div[2]//preceding::div[5]//child::p[@class='services-section-description']"));
		String[] expected_card_header={"Fast and Free Delivery","100% Money back guarantee"};
		boolean card_header_match=true;
		for(int i=0;i<expected_card_header.length;i++) {
			String single_card =expected_card_header[i];
			String actual_card_header=card_header.get(i).getText();
			if(!single_card.equals(actual_card_header)) {
				card_header_match=false;
				break;
			}
			if(card_header_match) {
				System.out.println("Titles Checked");
			}
			else {
				System.out.println("Mismatch Found in Titles");
			}
			
		}
		String[]expected_card_text= {"Fast, free, and convenient delivery choices on millions of items.", "This is probably the most popular guarantee in the world."};
		boolean card_description_match=true;
		for(int j=0;j<expected_card_text.length;j++) {
			String single_card_text=expected_card_text[j];
			String actual_card_text=card_description.get(j).getText();
			if(!single_card_text.equals(actual_card_text)) {
				card_description_match=false;
				break;
			}
			if(card_description_match) {
				System.out.println("Descriptions Checked");
			}
			else {
				System.out.println("Mismatch Found in Descriptions");
			}
		}
		boolean condition1=true;
		if(!section_header.getText().equals("Our Services")) {
			condition1=false;
		}
		boolean condition2=true;
		if(!section_text.getText().equals("Most online stores offer lower prices. Online shopping makes price comparison simpler and quicker. "
									+ "It is very convenient to shop from where you are located. "
									+ "It saves you the cost of driving to stores, as well as parking fees.")) {
			condition2=false;	
		}
		if(condition1==condition2) {
			System.out.println("Section Header Checked");
		}
		else {
			System.out.println("Mismatch Found in Section Header");
		}
		

	}

}
