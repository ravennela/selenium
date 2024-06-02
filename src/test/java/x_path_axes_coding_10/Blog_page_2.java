package x_path_axes_coding_10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blog_page_2 {

	public static void main(String[] args) {
		System.setProperty("webdriverdriver.chrome.driver", "C:\\src\\Driver Versions\\chromedriver-win6428-03-24(123)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://qabloglist.ccbp.tech/");
		List<WebElement>blog_titles=driver.findElements(By.xpath("//h1[text()='My fifth post']/preceding::h1[@class='blog-title']"));
		for(WebElement title:blog_titles) {
			System.out.println(title.getText());
			
		}
		List<WebElement>blog_links=driver.findElements(By.xpath("//a[text()='Home']/following::a"));
		WebElement first_links=blog_links.get(0);
		first_links.click();
		String expected_url_1="https://qabloglist.ccbp.tech/about";
		String current_url_1 =driver.getCurrentUrl();
		if(expected_url_1.equals(current_url_1)) {
			System.out.println("Navigation to About Page Successful");
		}
		WebElement second_link=blog_links.get(1);
		second_link.click();
		String expected_url_2="https://qabloglist.ccbp.tech/contact";
		String current_url_2=driver.getCurrentUrl();
		if (expected_url_2.equals(current_url_2)) {
			System.out.println("Navigation to About Page Successful");
		}
		driver.quit();
		
		

	}

}
