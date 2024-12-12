package uk.co.library.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utilities.Utility;

public class ResultPage extends Utility {

    @FindBy(id = "resultText")
    private WebElement resultText;

    // Constructor
    public ResultPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Methods
    public boolean verifyTheResults(String expected) {
        return resultText.getText().contains(expected);
    }
}

