package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_utilities.WebDriverLibrary;

public class ProblemsPage {

	@FindBy(xpath = "//div[text()='Toilet']/parent::label/div/div")
	private WebElement toiletCheckBox;
	
	@FindBy(xpath = "//button[text()='Next']")
	private WebElement nextButton;
	
	@FindBy(xpath = "//div[text()='Replace']/parent::label/div/div")
	private WebElement replaceCheckBox;
	
	@FindBy(xpath = "//select[@class='select__selectBoxInput____HQJD select__select']")
	private WebElement dropDown;
	
	@FindBy(xpath = "//select[@class='select__selectBoxInput____HQJD select__select']/option")
	private WebElement selectTime;
	
	@FindBy(xpath = "//input[@placeholder='Email address']")
	private WebElement emailTF;
	
	
	
	public WebElement getEmailTF() {
		return emailTF;
	}

	public WebElement getSelectTime() {
		return selectTime;
	}

	public WebElement getDropDown() {
		return dropDown;
	}

	public ProblemsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getToiletCheckBox() {
		return toiletCheckBox;
	}

	public WebElement getNextButton() {
		return nextButton;
	}

	public WebElement getReplaceCheckBox() {
		return replaceCheckBox;
	}

	public WebElement getLeakInAPipeCheckBox() {
		return leakInAPipeCheckBox;
	}

	public WebElement getSkipButton() {
		return skipButton;
	}

	public WebElement getDateRadioButton() {
		return dateRadioButton;
	}

	
	@FindBy(xpath = "//div[text()='Leak in a pipe']/parent::label/div/div")
	private WebElement leakInAPipeCheckBox;
	
	@FindBy(xpath = "//button[text()='Skip']")
	private WebElement skipButton;
	
	@FindBy (xpath = "//div[text()='On a specific date']/parent::label/div/div")
	private WebElement dateRadioButton;
	
	public void selectTimes(WebDriver driver,WebElement ele, String num) {
		WebDriverLibrary.select(driver, getDropDown(),num);
	}
}
