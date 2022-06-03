package generic_utilities;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverLibrary {

	public static WebDriver launchBrowser(WebDriver driver) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		return driver;
	}
	
	public static void click(WebElement ele) {
		ele.click();
	}
	
	public static void timeouts(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	public static void selectDate(WebDriver driver,String date, String month, String year) {
//		driver.findElement(By.xpath("//strong[text()='"+month+" +\""+year+"\"']"));
		driver.findElement(By.xpath("//button[@class='CalendarDay_button CalendarDay_button_1' and text()=\""+date+"\"]")).click();
		
	}
	
	public static void select(WebDriver driver,WebElement element,String index) {
		Select select = new Select(element);
		select.selectByVisibleText(index);
		
	}
	
	public static void getOptions(WebDriver driver,WebElement ele,String value) {
		Select select = new Select(ele);
		List<WebElement>l= select.getOptions();
		System.out.println(l.size());
		for (WebElement time : l) {
			if(time.getText().contains(value)) {
				time.click();
				break;
			}
		}
		
		
	}
}
