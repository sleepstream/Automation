import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.SelenideBase;
import pages.AdminPage;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.*;
import static testResources.TestProperties.getTestProperty;

public class LoginUI extends SelenideBase {

    private LoginPage loginPage;
    private AdminPage mailPage;

    @BeforeMethod
    void beforeMethod() {
        setUpChromeDriverWithDefaultOptions();
        open(getTestProperty("baseUrl"));
        loginPage = page(LoginPage.class);
        mailPage = page(AdminPage.class);
    }

    @AfterMethod
    void afterMethod() {
        driver.close();
    }

    @Test
    void loginPageTest() {
        //login to web page
        loginPage.loginWithUserNameAndPassword(getTestProperty("userName"), getTestProperty("domain"), getTestProperty("password"));

        mailPage.clickOnAddButtonBlogEntries();
        mailPage.fillLetterAndSend();
    }
}
