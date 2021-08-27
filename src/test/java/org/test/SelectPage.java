package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPage extends BaseClass{

public SelectPage(){
		
		PageFactory.initElements(driver, this);
	}

	@FindBy (id="radiobutton_0")
	public WebElement icon;
	
	@FindBy (id="continue")
	public WebElement select1;
	
	public WebElement getIcon() {
		return icon;
	}
	public WebElement getSelect1() {
		return select1;
	}
}
