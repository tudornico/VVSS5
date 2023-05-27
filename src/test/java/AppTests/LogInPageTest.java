package AppTests;

import Steps.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LogInPageTest {
    @Steps
    LoginSteps loginSteps;
    @Managed(driver = "chrome")
    WebDriver browser;

    @Test
    public void loginTest() {
        loginSteps.isOnLoginPage();
        loginSteps.loginUser();
        loginSteps.userShouldBeLogedIn();
    }
}
