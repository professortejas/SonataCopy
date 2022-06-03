package com.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic_utilities.BaseClass;
import generic_utilities.WebDriverLibrary;
import object_repository.ProblemsPage;

public class AutomationScript extends BaseClass {

	@Test
	public void testScriptTest() {

		String date="31";
		String month="January";
		String year="2023";
		String email="aaa";
		String index="21:30";


		ProblemsPage pp=new ProblemsPage(driver);
		pp.getToiletCheckBox().click();
		pp.getNextButton().click();

		pp.getReplaceCheckBox().click();
		pp.getNextButton().click();

		pp.getLeakInAPipeCheckBox().click();
		pp.getNextButton().click();

		pp.getSkipButton().click();

		pp.getDateRadioButton().click();
		pp.getNextButton().click();

		//		WebDriverLibrary.selectDate(driver,date, month, year);
		
			for (int i = 0; i <=100; i++) {
				try {
					
					WebElement a = driver.findElement(By.xpath("//strong[text()='"+month +" "+year+"']"));
					if(a.getText().contains(month) && a.getText().contains(year) ) {
						WebElement z = driver.findElement(By.xpath("//strong[text()='"+ month +" "+ year +"']/parent::div/parent::div/table/tbody/tr//td/button[text()='"+ date +"']"));
						z.click();
						break;
					}else {
						throw new Exception();
					}
					
				} catch (Exception e) {
					
					driver.findElement(By.xpath("//button[@aria-label='Move forward to switch to the next month.']")).click();
				}
				
			}

			pp.getNextButton().click();

			pp.getDropDown().click();

			WebDriverLibrary.getOptions(driver, pp.getDropDown(), index);
			pp.getDropDown().click();


			pp.getNextButton().click();

			pp.getEmailTF().sendKeys(email);
		}
	}

