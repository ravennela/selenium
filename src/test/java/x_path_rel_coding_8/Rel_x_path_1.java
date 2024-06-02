package x_path_rel_coding_8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rel_x_path_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\src\\Driver Versions\\chromedriver-win6428-03-24(123)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qabloglist.ccbp.tech/");
		List<WebElement>blog=driver.findElements(By.xpath("//*[@class=\"blog-item\"]"));
		if(blog.size()>0) {
			System.out.println(blog.size()+"Blog Items Found");
		}
		else {
			System.out.println("Mismatch in Blog Item Count");
		}
		List<WebElement>blog_title=driver.findElements(By.xpath("//*[@class=\"blog-title\"]"));
		if(blog_title.size()>0) {
			System.out.println(blog_title.size()+"Blog Title Found");
		}
		else {
			System.out.println("Mismatch in Blog Title Found");
		}
		List<WebElement>blog_description=driver.findElements(By.xpath("//*[@class=\"blog-description\"]"));
		if(blog_description.size()>0) {
			System.out.println(blog_description.size()+"Blog Description Found");
		}
		else {
			System.out.println("Mismatch in Blog Description Count");
		}
		driver.close();
	}

}
