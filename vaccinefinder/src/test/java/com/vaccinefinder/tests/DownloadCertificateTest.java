package com.vaccinefinder.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vaccinefinder.base.Base;
import com.vaccinefinder.pages.DownloadCertificatePage;
import com.vaccinefinder.utilities.WaitUtility;

public class DownloadCertificateTest extends Base {
	DownloadCertificatePage downloadcertificatepage;
	WaitUtility waitutility;
	
	@Test
	public void cancelDownloadCertifictePopUp() throws InterruptedException
	{
		downloadcertificatepage=new DownloadCertificatePage(driver);
		downloadcertificatepage.clickOnPopCancelButton();
		boolean cancelPopup =downloadcertificatepage.searchCancelButtonIsDisplayed();
		Assert.assertFalse(cancelPopup, "Cancel Button is present");
		
	}

}
