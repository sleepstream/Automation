package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

import static testResources.TestProperties.getTestProperty;

//Uses this class for element on Admin page
public class AdminPage extends BasePage {

    @FindBy(css = ".compose-button.compose-button_white.compose-button_short.js-shortcut")
    private SelenideElement createLetter;

    @FindBy(css = "div.inputContainer--nsqFu > input.container--H9L5q")
    private ElementsCollection inputFields;

    @FindBy(css = "#dashboard > div:nth-child(2) > div > div > ul:nth-child(2) > li:nth-child(1) > ul > li:nth-child(1)")
    private SelenideElement addButtonBlogEntries;

    @FindBy(css = ".cke_editable")
    private SelenideElement bodyField;

    @FindBy(css = ".button2.button2_base")
    private SelenideElement sendButton;

    @Step("Click on add letter button")
    public void clickOnAddButtonBlogEntries() {
        createLetter.click();
    }

    @Step("Fill letter and send")
    public void fillLetterAndSend() {
        inputFields.get(0).setValue(getTestProperty("userName")+getTestProperty("domain"));
        inputFields.get(1).setValue("test");
        bodyField.setValue("test Letter body");
        sendButton.click();
    }
}
