package com.vaccinefinder.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vaccinefinder.utilities.WaitUtility;

public class DownloadCertificatePage {
	WebDriver driver;
	WaitUtility waitutility;
	
	@FindBy(xpath="//a[text()='Download Certificate']")
	WebElement downloadcertifictebutton;
	@FindBy(xpath = "//button[text()='Cancel']")
	WebElement cancelPopupbutton;
	@FindBy (xpath="//button[text()='Refresh']")
	private WebElement refreshbutton;
	
	public DownloadCertificatePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void clickOnDownloadCertificate()
	{
		downloadcertifictebutton.click();
	}
	public void clickOnPopCancelButton()
	{
		
		waitutility=new WaitUtility(driver);
		clickOnDownloadCertificate();
		waitutility.waitForElementToBeClickable(cancelPopupbutton, 10);
		cancelPopupbutton.click();
	}
	
	public boolean searchCancelButtonIsDisplayed()
    {
		try
		{
   	 boolean isDisplayedCancelButton = cancelPopupbutton.isDisplayed();
   	 return isDisplayedCancelButton;
		}
		catch (Exception e) {
			return false;
		}
		
    }
	public void refreshPage()
	{
		driver.get(null);
	}
}
