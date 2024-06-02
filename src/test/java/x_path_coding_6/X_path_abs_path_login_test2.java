package x_path_coding_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path_abs_path_login_test2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\src\\Driver Versions\\chromedriver-win6405-02-24\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qaebank.ccbp.tech/ebank/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div/div/div/div/form/div[1]/input")).sendKeys("142420");
		driver.findElement(By.xpath("/html/body/div/div/div/div/form/div[2]/input")).sendKeys("231225");
		driver.findElement(By.xpath("/html/body/div/div/div/div/form/button")).click();
		driver.close();
		
	}

}
