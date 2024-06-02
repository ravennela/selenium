package coding_1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FlipkartTitletest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\src\\Driver Versions\\chromedriver-win6405-02-24\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://grafana.hvpnl.in/");
		String Url=driver.getCurrentUrl();
		System.out.println(Url);
		String title=driver.getTitle();
		System.out.println(title);
		driver.quit();
	}

}
