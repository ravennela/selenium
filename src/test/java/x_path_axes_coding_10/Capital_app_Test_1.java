package x_path_axes_coding_10;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capital_app_Test_1 {

public static void main(String[]args) {
	System.setProperty("webdriver.chrome.driver", "C:\\src\\Driver Versions\\chromedriver-win6428-03-24(123)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://qacapitalsapp.ccbp.tech/");
	List<WebElement>dropdown= driver.findElements(By.xpath("//select[@class = 'capital-select']/child::option"));
	ArrayList<String>dropdown_list= new ArrayList();
	String order_dropdown="New Delhi, London, Paris, Kathmandu, Helsinki";
	String[]cities= order_dropdown.split(",//s*");
	for(WebElement option:dropdown) {
		String text=option.getText();
		dropdown_list.add(text);
	}
	boolean mismatchFound=false;
	int i;
	for(i=0;i<cities.length;i++) {
		String expectedCities=cities[i].trim();
		String actualCities=dropdown_list.get(i).trim();
		if(!expectedCities.equalsIgnoreCase(actualCities)) {
			System.out.println("Mismatch found");
			mismatchFound=true;
			break;
		}	
	}
	if(!mismatchFound) {
		System.out.println("All  are found");
	}
	
	
}

}
