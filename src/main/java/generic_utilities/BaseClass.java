package generic_utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

public static WebDriver driver;

	
	@BeforeClass
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.starofservice.in/dir/telangana/hyderabad/hyderabad/plumbing#/form/plumbing");
		
	}
	
	
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();

	}
}
