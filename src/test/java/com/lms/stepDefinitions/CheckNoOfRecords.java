package com.lms.stepDefinitions;

import org.testng.Assert;

import com.lms.driverfactory.DriverFactory;
import com.lms.pageObjects.ManageBatchPageObject;

import io.cucumber.java.en.Then;

public class CheckNoOfRecords {

	ManageBatchPageObject managebatch =new ManageBatchPageObject(DriverFactory.getDriver());

	@Then("Verify that number of records \\(rows of data in the table) displayed on the page are {int}")
	public void verify_that_number_of_records_rows_of_data_in_the_table_displayed_on_the_page_are(Integer total) {

		int actualrows=managebatch.CheckNoOfRows();
		Assert.assertEquals(actualrows, total);
	}

}
