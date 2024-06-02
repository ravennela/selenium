package css_selector_class_1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SimpleSelector_class_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\src\\Driver Versions\\chromedriver-win6424-04-24(124)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qajobbyapp.ccbp.tech/login");
		driver.findElement(By.cssSelector("input#userNameInput")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input#passwordInput")).sendKeys("rahul@2021");
		driver.findElement(By.cssSelector("button.login-button")).click();
		String expected_url="https://qajobbyapp.ccbp.tech/";
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.urlToBe("expected_url"));
		String current_url=driver.getCurrentUrl();
		if(current_url.equals(expected_url)) {
			System.out.println("Navigation to home page is successful!");
		}
		else {
			System.out.println("Unable to find the link");
		}
		driver.findElement(By.cssSelector("button.find-jobs-button")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.jobs-list-container")));
		List<WebElement>job_list=driver.findElements(By.cssSelector("[class='jobs-list']"));
		if(job_list.size()>0) {
			System.out.println("Jobs are displayed successfully on the jobs page:"+job_list.size());
		}
		else {
			System.out.println("No Jobs found on the jobs page.");
		}		
	}

}
