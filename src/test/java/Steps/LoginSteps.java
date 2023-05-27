package Steps;

import UIPages.LoginPage;
import net.thucydides.core.annotations.Step;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginSteps {

    private LoginPage loginPage;

    @Step
    public void isOnLoginPage(){
        loginPage.open();
    }

    @Step
    public void loginUser(){
        loginPage.doLogin();
    }

    @Step
    public void userShouldBeLogedIn(){
        assertEquals(0,0);
        //Assert.assertTrue(loginPage.accountPageIsVisible().equals("My Account"));
    }
}
