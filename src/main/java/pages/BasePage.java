package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

//Uses this class for base elements for all pages
public abstract class BasePage {

    @FindBy(css = "#content > h1")
    public SelenideElement header;
}
