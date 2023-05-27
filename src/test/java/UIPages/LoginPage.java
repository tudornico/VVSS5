package UIPages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://magento.softwaretestingboard.com/customer/account/login")
public class LoginPage extends PageObject {
    public void doLogin(){
        $("email").sendKeys("johndoe@unEmail.com");
        $("pass").sendKeys("#Daria2002");
        $("send2").click();
    }

    public String accountPageIsVisible(){
        //My Account
        return $("#page-title-wrapper").getText();
    }
}
