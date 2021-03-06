package shop.test;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import shop.pages.HomePage;
import shop.pages.SignInPage;
import shop.pages.LoginPage;
import shop.settings.WebDriverSettings;

public class SignUp extends WebDriverSettings {

    @Test
    public void signUp()  {
        HomePage homepage = PageFactory.initElements(driver, HomePage.class);
        SignInPage signinpage=PageFactory.initElements(driver,SignInPage.class);
        LoginPage loginpage=PageFactory.initElements(driver,LoginPage.class);
        homepage.open();
        homepage.move_to_cart();
        homepage.proceed_button.click();
        signinpage.proceed_button.click();
        loginpage.fiilform(signinpage.test_data[0],signinpage.test_data[1]);
        loginpage.submitform();
        loginpage.check_name();
        Assert.assertEquals(signinpage.address_first_last_name.getText(), signinpage.test_data[2]);
        Assert.assertEquals(signinpage.address_company.getText(), signinpage.test_data[3]);
        Assert.assertEquals(signinpage.address1_address2.getText(), signinpage.test_data[4]);
        Assert.assertEquals(signinpage.address_city.getText(), signinpage.test_data[5]);
        Assert.assertEquals(signinpage.address_phone.getText(), signinpage.test_data[6]);
        Assert.assertEquals(signinpage.address_phone_mobile.getText(), signinpage.test_data[7]);
        signinpage.third_step_proceed_to_checkout.click();
        signinpage.checkbox.click();
        signinpage.fourth_step_proceed_to_checkout.click();
        signinpage.first_bank.click();
        signinpage.confirm_order_button.click();

    }
}
