package css_selector_coding_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabs_test2_1 {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver(); 
		driver.get("https://qatabs.ccbp.tech/");
		driver.findElement(By.cssSelector("button#aboutButton")).click();
		String about_text=driver.findElement(By.cssSelector("p[id^='about']")).getText();
		String expected_aboutText="Varanasi is one of the oldest living cities in the world. Its Prominence in Hindu mythology is virtually unrevealed."
				+ " Mark Twain, the English author and literature, who was enthralled by the legend and sanctity of Benaras, once wrote,"
				+ "Benaras is older than history, older than tradition, older even than legend and looks twice as old as all of them put together";
		if(about_text.equals(expected_aboutText)) {
			System.out.println("About Content Matched");
		}
		else {
			System.out.println("Mismatch in the 'About' Content");	
		}
		driver.findElement(By.cssSelector("button#timeToVisitButton")).click();
		String timeToVisit=driver.findElement(By.cssSelector("p[id^='aboutTabContent']")).getText();
		String expected_timeToVisit="October to March is the best time to visit Varanasi because most of the fairs here are held during this time of the year."
				+ " Festivities begin with Diwali and continue to Dev Diwali celebrated on the 15th day from Diwali. In between, there is also Annakut. "
				+ "During this time, the ghats are lit with lights and diyas. Earthen lamps adorn the staircase of the ghats and are also afloat in the river. "
				+ "Firecrackers burn through the night, and it's a sight no one should miss.";
		if(timeToVisit.equals(expected_timeToVisit)) {
			System.out.println("Time to Visit Content Matched");
		}
		else {
			System.out.println("Time to Visit' Content");
		}
		driver.findElement(By.cssSelector("button[id^=attractionsButton]")).click();
		String attraction_text=driver.findElement(By.cssSelector("p[id^='attractions']")).getText();
		String expected_attracion_text="When visiting Varanasi, one comes across plenty of ghats, but among them, Dashashwamedh Ghat is said to be one of the oldest and most important. "
				+ "This ghat, leading to the Ganges, is located close to the famous old Vishwanath temple in Kashi (today’s Banaras)."
				+ " Another famous attraction is River Ganges which is the holiest river by the Hindus and many more.";
		if(attraction_text.equals(expected_attracion_text)) {
			System.out.println("Attractions Content Matched");
		}
		else {
			System.out.println("Mismatch in the 'Attractions' Content");
		}
		driver.close();
	}
}
