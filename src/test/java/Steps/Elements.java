package Steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Elements {

    @FindBy(how = How.XPATH, xpath = "//div[text()='Adrese Teslim']']")
    private WebElement BTN_ADRESE_TESLİM;
}
