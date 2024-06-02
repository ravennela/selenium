package alert_handling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Codingpractice_webalert_14_2 {
	public static WebDriver driver;

	public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.get("https://qaupasswd.ccbp.tech/");
			WebElement old_pass=driver.findElement(By.cssSelector("input#oldPassword"));
			WebElement new_pass=driver.findElement(By.cssSelector("input#newPassword"));
			WebElement renter_pass=driver.findElement(By.cssSelector("input#reEnterPassword"));
			WebElement button=driver.findElement(By.cssSelector("button.btn"));
			old_pass.sendKeys("admin");
			button.click();
			Alert web_alert=driver.switchTo().alert();
			System.out.println(web_alert.getText());
			web_alert.accept();
			new_pass.clear();
			new_pass.sendKeys("admin1234");
			renter_pass.sendKeys("admin");
			button.click();
			System.out.println(web_alert.getText());
			web_alert.accept();
			
			

	}

}
