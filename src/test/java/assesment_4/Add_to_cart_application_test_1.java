package assesment_4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_to_cart_application_test_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\src\\Driver Versions\\chromedriver-win6428-03-24(123)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qacartpage.ccbp.tech/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Pencil");
		WebElement click= driver.findElement(By.xpath("(//*[contains(text(),'Add')])[2]"));
		click.click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mobile");
		click.click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Shoes");
		click.click();
		List<WebElement>cart_item=driver.findElements(By.xpath("//li[starts-with(@id,'cart-item')]"));
		if (cart_item.size()==3) {
			System.out.println("Cart items count is correct");
		}
		else {
			System.out.println("Cart items count is not correct");
		}
		//verifing the order of the items.
		boolean orderMathces=true;
		String[]expected_order= {"Pencil","Mobile","Shoes"};
		for(int i=0;i<=expected_order.length;i++) {
			String item_text=cart_item.get(i).getText();
			if(!item_text.equals(expected_order[i])) {
				orderMathces=false;
				break;
			}
			if (orderMathces) {
	            System.out.println("Items are in the correct order");
	        } else {
	            System.out.println("Items are not in the correct order");
	        }
			
		}
		driver.quit();
		
		
			
	}

}
