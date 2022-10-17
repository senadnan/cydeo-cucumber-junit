package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTrackLoginPage {

    public VyTrackLoginPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='prependedInput']")
    public WebElement inputUsername;

    @FindBy (xpath = "//input[@id='prependedInput2']")
    public WebElement inputPassword;

     @FindBy(id = "_submit")
    public WebElement submitBtn;

}
