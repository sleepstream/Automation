package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.visible;

public class LoginPage {

    @FindBy(css = "input#mailbox\\:login")
    private SelenideElement usernameField;

    @FindBy(css ="#mailbox\\:submit")
    private SelenideElement passwordEnterButton;

    @FindBy(css = "input#mailbox\\:password")
    private SelenideElement passwordField;

    @FindBy(css = "#mailbox\\:domain")
    private SelenideElement selectDomainList;

    @FindBy(css = "#mailbox\\:submit")
    private SelenideElement logInButton;

    @Step("Login with userName= {userName} and password = {password}")
    public void loginWithUserNameAndPassword(String userName, String domain, String password) {
        usernameField.setValue(userName);
        selectDomainList.selectOption(domain);
        passwordEnterButton.click();
        passwordField.setValue(password);
        logInButton.click();
    }
}
