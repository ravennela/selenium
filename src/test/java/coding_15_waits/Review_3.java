package coding_15_waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Review_3 {
	WebDriver driver;
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://qaarticlervw.ccbp.tech/article/");
		WebElement article_title=driver.findElement(By.xpath("//div[@class='article-info']//child::h1"));
		System.out.println(article_title.getText());
		driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.cssSelector("textarea#reviewTextArea")).sendKeys("Clear and thoughtful explanation of React's versioning approach");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.cssSelector("button#submitReviewBtn")).click();
		

	}

}
