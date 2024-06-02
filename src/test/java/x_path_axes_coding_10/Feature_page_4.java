package x_path_axes_coding_10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Feature_page_4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\src\\Driver Versions\\chromedriver-win6428-03-24(123)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qafeaturesect.ccbp.tech/");
		WebElement inter=driver.findElement(By.xpath("//span[@class='interaction']"));
		System.out.println(inter.getText());
		WebElement sentence=driver.findElement(By.xpath("//span[@class='interaction']/parent::p"));
		System.out.println(sentence.getText());
		List<WebElement>following_text=driver.findElements(By.xpath("//h1[text()='Interaction']/ancestor::div[2]/following-sibling::div//p[@class='vr-features-card-description']"));
		for(WebElement text_1:following_text ) {
			text_1.getText();
		}
		List<WebElement>above_text=driver.findElements(By.xpath("(//p[@class='vr-features-card-description'])[6]/ancestor::div[2]/preceding-sibling::div//p"));
		for(WebElement text_2:above_text) {
			text_2.getText();
		}
		driver.close();
	}

}
