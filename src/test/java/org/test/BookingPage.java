package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage extends BaseClass{

public BookingPage() {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy (id="first_name")
	public WebElement firstname;
	@FindBy (id="last_name")
	public WebElement lastname;
	@FindBy (id="address")
	public WebElement address;
	@FindBy (id="cc_num")
	public WebElement cardnumber;
	@FindBy (id="cc_type")
	public WebElement cardtype;
	@FindBy (id="cc_exp_month")
	public WebElement cardexpmonth;
	@FindBy (id="cc_exp_year")
	public WebElement cardexpyear;
	@FindBy (id="cc_cvv")
	public WebElement cardcvv;
	@FindBy (id="book_now")
	public WebElement book;
	
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCardnumber() {
		return cardnumber;
	}
	public WebElement getCardtype() {
		return cardtype;
	}
	public WebElement getCardexpmonth() {
		return cardexpmonth;
	}
	public WebElement getCardexpyear() {
		return cardexpyear;
	}
	public WebElement getCardcvv() {
		return cardcvv;
	}
	public WebElement getBook() {
		return book;
	}

	
	
}
