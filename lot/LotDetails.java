package com.Pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LotDetails {

	public WebDriver driver;
	@FindBy(xpath = "//select[@aria-required='true']")
	private WebElement Title;
	@FindBy(id = "_passengerdata_WAR_lotairwaysportlet_person_adult_1_name")
	private WebElement FirstName;
	@FindBy(id = "_passengerdata_WAR_lotairwaysportlet_person_adult_1_surname")
	private WebElement LastName;
	@FindBy(id = "_passengerdata_WAR_lotairwaysportlet_person_adult_1_date_birth_day")
	private WebElement Day;
	@FindBy(id = "_passengerdata_WAR_lotairwaysportlet_person_adult_1_date_birth_month")
	private WebElement Month;
	@FindBy(id = "_passengerdata_WAR_lotairwaysportlet_person_adult_1_date_birth_year")
	private WebElement Year;
	@FindBy(id = "_passengerdata_WAR_lotairwaysportlet_person_adult_1_email")
	private WebElement Email;
	@FindBy(id = "_passengerdata_WAR_lotairwaysportlet_person_adult_1_prefix")
	private WebElement Code;
	@FindBy(id = "_passengerdata_WAR_lotairwaysportlet_person_adult_1_phone")
	private WebElement MobileNumber;
	@FindBy(id = "_passengerdata_WAR_lotairwaysportlet_termsUseCheckboxCheckbox")
	private WebElement Accept;
	@FindBy(xpath = "(//button[@type='button'])[13]")
	private WebElement ContinueBtn;
	@FindBy(xpath = "//button[@onclick='accept();']")
	private WebElement CheckBtn;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getTitle() {
		return Title;
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getDay() {
		return Day;
	}

	public WebElement getMonth() {
		return Month;
	}

	public WebElement getYear() {
		return Year;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getCode() {
		return Code;
	}

	public WebElement getMobileNumber() {
		return MobileNumber;
	}

	public WebElement getAccept() {
		return Accept;
	}

	public WebElement getContinueBtn() {
		return ContinueBtn;
	}

	public WebElement getCheckBtn() {
		return CheckBtn;
	}

	public LotDetails(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

}
