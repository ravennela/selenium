package x_path_coding_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_Absolute_path_login_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\src\\Driver Versions\\chromedriver-win6405-02-24\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qaebank.ccbp.tech/ebank/login");
		driver.findElement(By.xpath("/html/body/div/div/div/div/form/div[1]/input")).sendKeys("142420");
		System.out.println("Username entered");
		driver.close();

	}

}
