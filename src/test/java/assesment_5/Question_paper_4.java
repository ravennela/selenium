package assesment_5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_paper_4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\src\\Driver Versions\\chromedriver-win6428-03-24(123)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qaquestion.ccbp.tech/");
		WebElement question=driver.findElement(By.xpath("//form[@id='questionsForm']//child::h1"));
		WebElement button=driver.findElement(By.xpath("//form[@id='questionsForm']//child::button[@id='submitBtn']"));
		WebElement message=driver.findElement(By.xpath("//form[@id='questionsForm']//child::p[@id='resultMsg']"));
		List<WebElement> radio_btn=driver.findElements(By.xpath("//form[@id='questionsForm']//descendant::input[@type='radio']"));
		List<WebElement> option=driver.findElements(By.xpath("//form[@id='questionsForm']//descendant::label"));
		String expected_question="What is the capital of India?";
		String actual_question=question.getText();
		if(expected_question.equals(actual_question)) {
			System.out.println("Question Checked");
		}
		else {
			System.out.println("Mismatch Found in Question");
		}
		String actual_message=message.getText();
		String expected_message="Please select the City!";
		if(expected_message.equals(actual_message)) {
			System.out.println("Missing Option Case Checked");
		}
		else {
			System.out.println("Error Occured for Missing Option Case");
		}
		/*int radio_btn_count=radio_btn.size();
		boolean actual_click=true;
		for(int i=0;i<radio_btn_count;i++) {
			radio_btn.get(i).click();
			if(!actual_message.equals("Wrong Answer!")) {
				actual_click=false;
				break;
			}
			if(actual_click) {
				System.out.println(message);
			}
			else {
				System.out.println("The correct option for the question is "+radio_btn.get(i).getText()+"The result message on selecting the "
						+ "correct option should be"+message);
			}
		}*/
		for (WebElement radioButton : radio_btn) {
            radioButton.click();
            button.click();
            String resultMessage = message.getText();
            int selectedIndex = radio_btn.indexOf(radioButton);
            String selectedOption = option.get(selectedIndex).getText();

            if (!resultMessage.equals("Wrong Answer!")) {
                System.out.println("The correct option for the question is: " + selectedOption);
                System.out.println("The result message on selecting the correct option should be: " + resultMessage);
            } else {
                System.out.println("The option selected (" + radioButton.getText() + ") is wrong.");
            }
        }


	}

}
