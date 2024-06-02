	package assesment_5;
	
	import java.util.Random;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class Addition_game_2 {
	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\src\\Driver Versions\\chromedriver-win6428-03-24(123)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			try {
				driver.get("https://qaadditiongame.ccbp.tech/");
				WebElement first_num=driver.findElement(By.xpath("//input[@id='userInput']//preceding-sibling::span[4]"));
				WebElement second_num=driver.findElement(By.xpath("//input[@id='userInput']//preceding-sibling::span[2]"));
				String first_num_text=first_num.getText();
				String second_num_text=second_num.getText();
				int firstnum=Integer.parseInt(first_num_text);
				int secondnum=Integer.parseInt(second_num_text);
				int sum=firstnum+secondnum;
				String value_1=String.valueOf(sum);
				driver.findElement(By.xpath("//input[@id='userInput']")).sendKeys(value_1);
				WebElement check_btn=driver.findElement(By.xpath("//input[@id='userInput']//following::button[1]"));
				WebElement reset_btn=driver.findElement(By.xpath("//input[@id='userInput']//following::button[2]"));
				check_btn.click();
				WebElement result=driver.findElement(By.xpath("//input[@id='userInput']//following-sibling::p[@id='gameResult']"));
				String sucess_result="Congratulations! You got it right.";
				boolean condition1=false;
				
				if(!result.getText().equals(sucess_result)) {
					System.out.println("Success Case Checked");
					condition1=true;
				}
				else {
					System.out.println("Error at Success Case");	
				}
				reset_btn.click();
				
				int sub=firstnum-secondnum;
				String value_2=String.valueOf(sub);
				driver.findElement(By.xpath("//input[@id='userInput']")).sendKeys(value_2);
				check_btn.click();
				
				boolean condition2=false;
				
				if(!result.getText().equals("Please Try Again!")) {
					System.out.println("Failure Case Checked");
					condition1=true;
				}
				else {
					System.out.println("Error at Failure Case");
				}
				if(condition1==condition2) {
					System.out.println("Addition Game Working as Expected.");
				}
				else {
					System.out.println("Unexpected Behaviour");
				}
				
				}
			finally {
				driver.close();
			}
			
			
			
	
		}
	
	}
