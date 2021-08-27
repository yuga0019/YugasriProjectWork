package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BaseClass{

public SearchPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnumber() {
		return roomnumber;
	}

	public WebElement getDatein() {
		return datein;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSelect() {
		return select;
	}

	@FindBy (id = "location")
	public WebElement location;
	
	@FindBy (id = "hotels")
	public WebElement hotels;
	
	@FindBy (id = "room_type")
	public WebElement roomtype;
	
	@FindBy (id = "room_nos")
	public WebElement roomnumber;
	
	@FindBy (id = "datepick_in")
	public WebElement datein;
	
	@FindBy (id = "datepick_out")
	public WebElement dateout;
	
	@FindBy (id = "adult_room")
	public WebElement adult;
	
	@FindBy (id = "child_room")
	public WebElement child;
	
	@FindBy (id = "Submit")
	public WebElement select;
	
	
}
