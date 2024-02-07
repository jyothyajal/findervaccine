package com.vaccinefinder.tests;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;

import com.vaccinefinder.utilities.ExcelReader;
import com.vaccinefinder.base.Base;
import com.vaccinefinder.pages.CovidCasesPage;

public class CovidCasesTest extends Base {
	CovidCasesPage covidcasespage;
	ExcelReader excelreader = new ExcelReader();
	SoftAssert softassert=new SoftAssert();

	@Test
	public void verifyPieChartLoading()
	{
		covidcasespage =new CovidCasesPage(driver);
		covidcasespage.clickOnCovidCasesPage();
		Assert.assertTrue(covidcasespage.visibiltyOfPieChart(), "Pie Chart is not dispalyed");
	}
	@Test
	public void validateStateSelectionFromDropDown()
	{
		covidcasespage =new CovidCasesPage(driver);
		covidcasespage.clickOnCovidCasesPage();
		covidcasespage.selectStateFromDropDown("Manipur", "Chandel");
		
		String expectedstatename="State - Manipur";
		String expecteddistrictname="District - Chandel";
		String actualstatename=covidcasespage.getSelectedStateName();
		String actualdistrictname=covidcasespage.getSelectedDistrictName();
		softassert.assertEquals(expectedstatename,actualstatename,"No state selection was done");
		softassert.assertEquals(expecteddistrictname,actualdistrictname,"Show Message Button Weight is no" );
		softassert.assertAll();
		
	}
	
}
