package com.vaccinefinder.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vaccinefinder.utilities.GeneralUtility;
import com.vaccinefinder.utilities.PageUtility;


public class CovidCasesPage {
	WebDriver driver;
	GeneralUtility generalutility;
	PageUtility pageutility;
	
	@FindBy (xpath = "//a[text()='Covid Cases']")
	private WebElement covidcaselink;
	@FindBy(xpath="//div[@class='col-md-9']")
	private WebElement piechart;
	@FindBy(xpath = "//select[@class='form-control mt-1 btn-sm' and @name='selectedState']")
	private WebElement statedropdown;
	@FindBy(xpath="//select[@name='selectedDistrict']")
	private WebElement districtdropdown;
	@FindBy (xpath = "//h4[contains(text(),'State - ')]")
	private WebElement selectedstatename;
	@FindBy (xpath = "//h4[contains(text(),'District - ')]")
	private WebElement selecteddistrictname;
	
		
	public CovidCasesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnCovidCasesPage()
	{
		covidcaselink.click();
	}
	public boolean visibiltyOfPieChart()
	{
		generalutility=new GeneralUtility();
		return generalutility.is_Displayed(piechart);
	}
	public void selectStateFromDropDown(String state,String district)
	{
		pageutility = new PageUtility(driver);
		pageutility.select_ByVisibleText(statedropdown,state);
		pageutility.select_ByVisibleText(districtdropdown, district);
	} 
	public String getSelectedStateName()
	{
		generalutility=new GeneralUtility();
		String statename=generalutility.getTextOffElement(selectedstatename);
		return statename;
	}
	public String getSelectedDistrictName()
	{
		generalutility=new GeneralUtility();
		String districtname=generalutility.getTextOffElement(selecteddistrictname);
		return districtname;
	}
	
}
