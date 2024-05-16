package com.B33_GR08_vytrack.pages;

import com.B33_GR08_vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US06_EditcarInfoPage extends BasePage{

    public US06_EditcarInfoPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class='title title-level-1'])[1]")
    public WebElement fleetButton;

    @FindBy(xpath = "//span[.='Vehicles']" )
    public WebElement vehiclesButton;

    @FindBy(xpath = "(//div[@class='dropdown']//*[text()='...'])[5]")
    public WebElement editCarInfoDots;
    //(//div[@class='dropdown']//*[text()='...'])[5]

    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu__action-cell launchers-dropdown-menu detach dropdown-menu__floating']//*[@class='launcher-item']//a")
    public List<WebElement>deleteEditView;


    // //ul[@class='dropdown-menu dropdown-menuaction-cell launchers-dropdown-menu detach dropdown-menufloating']//*[@class='launcher-item']//a
}
