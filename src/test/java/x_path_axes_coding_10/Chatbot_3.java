package x_path_axes_coding_10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chatbot_3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\src\\Driver Versions\\chromedriver-win6428-03-24(123)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qachatbot.ccbp.tech/");
		WebElement text_box= driver.findElement(By.xpath("/html/body/div/div[3]/input"));
		WebElement text_click= driver.findElement(By.xpath("/html/body/div/div[3]/input"));
		text_box.sendKeys("Hi");
		text_click.click();
		text_box.sendKeys("Good Morning");
		text_click.click();
		text_box.sendKeys("Help!!");
		text_click.click();
		List<WebElement>user_chat=driver.findElements(By.xpath("//div[@id='chatContainer']/descendant::span[@class='msg-to-chatbot']"));
		for(WebElement chat:user_chat) {
			chat.getText();
		}
	}

}
