package com.vaccinefinder.utilities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.WebElement;

public class GeneralUtility {

	public boolean is_Displayed(WebElement element) {
		return element.isDisplayed();
	}

	public String getTextOffElement(WebElement element) {
		return element.getText();
	}

	public List<String> getTextOfElements(List<WebElement> element) {
		List<String> list = new ArrayList<String>();
		for (WebElement e : element) {
			list.add(e.getText());
		}
		return list;
	}
	public static String getTimeStamp()
	{
		String timeStamp;
		return timeStamp = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date());
	}
	
}
