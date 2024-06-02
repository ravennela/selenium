package assesment_1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearFunction {

	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver","C:\\src\\Driver Versions\\chromedriver-win6405-02-24\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://qasearchpage.ccbp.tech/");
		driver.manage().window().maximize();
		driver.findElement(By.id("searchInput")).sendKeys("India");
		driver.findElement(By.id("searchInput")).clear();
		driver.close();
		

	}

}
