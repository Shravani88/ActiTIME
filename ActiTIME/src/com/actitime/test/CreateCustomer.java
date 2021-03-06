package com.actitime.test;

import static org.testng.Assert.fail;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.TaskListPage;
@Listeners(com.actitime.generics.ListenerImplementation.class)
public class CreateCustomer extends BaseClass {
	@Test
	public void testCreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		String ExpectedcustomerName = f.getExcelData("CreateCustomer", 1, 0);
		String customerdescription = f.getExcelData("CreateCustomer", 1, 1);
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		//Click on Task Tab
		e.getTasksTab().click();
		TaskListPage t=new TaskListPage(driver);
		//Click on Add New Button
		t.getAddNewBtn().click();
		//select New Customer in the Menu
		t.getNewCustomerMenu().click();
		//.Enter the customer Name
		t.getEnterCustomerNametbx().sendKeys(ExpectedcustomerName);
		//Enter the Customer Description
		t.getCustomerDescriptiontbx().sendKeys(customerdescription);
		//Click on Select Customer DropDown
		t.getCopyProjectDropDown().click();
		//Select our company in the drop drown
		t.getOurCompanyMenu().click();
	    Assert.fail();
		//Click on Create Customer button
		t.getCreateCustomerBtn().click();
		//Verify the Customer is successfully create or not
		Thread.sleep(5000);
		String ActualCustomerCreated = t.getVerifyCustomerText().getText();
		Assert.assertEquals(ActualCustomerCreated, ExpectedcustomerName);
		
		}

}
