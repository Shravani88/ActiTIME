package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage {
	@FindBy(id="logoutLink")
	private WebElement logout;

	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement TasksTab;
	
	@FindBy(id="addTaskButtonId")
	private WebElement newbtn;
	
	@FindBy(xpath="(//div[@class='dropdownButton'])[5]")
	private WebElement SelectCustomerDropDown;
	
	@FindBy(xpath="//div[text()='- New Customer -']")
	private WebElement NewCustomerMenu;
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name']")
	private WebElement EnterCustomerName;
	
	@FindBy(xpath="//input[@placeholder='Enter Project Name']")
	private WebElement EnterProjectName;
	
	@FindBy(xpath="(//input[@placeholder='Enter task name'])[1]")
	private WebElement EnterTaskName;
	
	@FindBy(xpath="(//div[text()='Create Tasks']")
	private WebElement CreateTaskBtn;
	
	@FindBy(xpath="(//div[text()='Create Account']")
	private WebElement Verify;

	public EnterTimeTrackPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}

	public void clickLogout() {
		 logout.click();
	}

	public WebElement getTasksTab() {
		return TasksTab;
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getNewbtn() {
		return newbtn;
	}

	public WebElement getSelectCustomerDropDown() {
		return SelectCustomerDropDown;
	}

	public WebElement getNewCustomerMenu() {
		return NewCustomerMenu;
	}

	public WebElement getEnterCustomerName() {
		return EnterCustomerName;
	}

	public WebElement getEnterProjectName() {
		return EnterProjectName;
	}

	public WebElement getEnterTaskName() {
		return EnterTaskName;
	}

	public WebElement getCreateTaskBtn() {
		return CreateTaskBtn;
	}
	public WebElement getVerify() {
		return Verify;
	}

}
