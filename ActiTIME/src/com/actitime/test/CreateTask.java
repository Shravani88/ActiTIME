package com.actitime.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.pom.EnterTimeTrackPage;

@Listeners(com.actitime.generics.ListenerImplementation.class)
public class CreateTask extends BaseClass {
@Test
public void testCreateTask() throws EncryptedDocumentException, IOException, InterruptedException {
	String customerName = f.getExcelData("CreateCustomer", 2, 0);
	String ProjectName = f.getExcelData("CreateCustomer", 2, 1);
	String TaskName = f.getExcelData("CreateCustomer", 2, 2);
	EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
	//click on new button
	e.getNewbtn().click();
	Thread.sleep(3000);
	//click on select customer drop down
	e.getSelectCustomerDropDown().click();
	//select new customer
	e.getNewCustomerMenu().click();
	//enter the customer name as SBI_007
	e.getEnterCustomerName().sendKeys(customerName);
	//Enter the project name-banking project
	e.getEnterProjectName().sendKeys(ProjectName);
	//enter the task name as create account
	e.getEnterTaskName().sendKeys(TaskName);
	Thread.sleep(5000);
	//Actions a=new Actions(driver);
//	a.moveToElement(e.getCreateTaskBtn()).perform();
	//click on create task button
	e.getCreateTaskBtn().click();
	Thread.sleep(5000);
	//verify the task created
	String actualtaskcreated = e.getVerify().getText();
	Thread.sleep(3000);
	Assert.assertEquals(actualtaskcreated, TaskName);
	e.clickLogout();
}
}
