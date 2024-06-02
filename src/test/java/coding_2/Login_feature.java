package coding_2;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Login_feature {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\src\\Driver Versions\\chromedriver-win6405-02-24\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulnxttrendz.ccbp.tech/login");
		driver.findElement(By.className("username-input-field")).sendKeys("rahul");
		driver.findElement(By.id("password")).sendKeys("rahul@2021");
		//driver.findElement(By.cssSelector("button[type='submit']")).click();(or)
		driver.findElement(By.className("login-button")).click();
		driver.manage().window().maximize();
		String expected_url="https://rahulnxttrendz.ccbp.tech/";
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlToBe(expected_url));
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String current_url= driver.getCurrentUrl();
		if (current_url.equals(expected_url)) {
			System.out.println("This is passed test case");
		}
		else {
			System.out.println("This is Failed test case");
		}
	
		driver.close();
	}

}



