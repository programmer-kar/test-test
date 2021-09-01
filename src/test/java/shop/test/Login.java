package shop.test;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import shop.pages.HomePage;
import shop.pages.SignInPage;
import shop.settings.WebDriverSettings;
import shop.pages.LoginPage;


public class Login extends WebDriverSettings {

    @Test
        public void login(){
        LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
        SignInPage signinpage=PageFactory.initElements(driver,SignInPage.class);
        loginpage.open();
        loginpage.started();
        loginpage.fiilform(signinpage.test_data[0], signinpage.test_data[1]);
        loginpage.submitform();
        loginpage.check_name();
    }

    @Test
    public void authentication(){
        LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
        loginpage.open();
        loginpage.fill_email_field();
        loginpage.fill_fields();
        loginpage.check_name();
    }

}
