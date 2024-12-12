package uk.co.library.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utilities.Utility;

public class HomePage extends Utility {

    @FindBy(id = "jobTitle")
     WebElement jobTitle;

    @FindBy(id = "location")
    WebElement location;

    @FindBy(id = "distance")
     WebElement distanceDropDown;

    @FindBy(linkText = "More Search Options")
    WebElement moreSearchOptionsLink;

    @FindBy(id = "salaryMin")
    WebElement salaryMin;

    @FindBy(id = "salaryMax")
    WebElement salaryMax;

    @FindBy(id = "salaryType")
    WebElement salaryTypeDropDown;

    @FindBy(id = "jobType")
    WebElement jobTypeDropDown;

    @FindBy(xpath = "//button[text()='Find Jobs']")
    WebElement findJobsBtn;

    //Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Methods
    public void enterJobTitle(String jobTitle) {
        this.jobTitle.sendKeys(jobTitle);
    }

    public void enterLocation(String location) {
        this.location.sendKeys(location);
    }

    public void selectDistance(String distance) {
        this.distanceDropDown.sendKeys(distance);
    }

    public void clickOnMoreSearchOptionLink() {
        this.moreSearchOptionsLink.click();
    }

    public void enterMinSalary(String minSalary) {
        this.salaryMin.sendKeys(minSalary);
    }

    public void enterMaxSalary(String maxSalary) {
        this.salaryMax.sendKeys(maxSalary);
    }

    public void selectSalaryType(String sType) {
        this.salaryTypeDropDown.sendKeys(sType);
    }

    public void selectJobType(String jobType) {
        this.jobTypeDropDown.sendKeys(jobType);
    }

    public void clickOnFindJobsButton() {
        this.findJobsBtn.click();

    }
}