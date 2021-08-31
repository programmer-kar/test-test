package shop.test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import shop.settings.WebDriverSettings;
import shop.pages.HomePage;

public class Price extends WebDriverSettings {
    @Test
    public void price(){
        HomePage homepage = PageFactory.initElements(driver, HomePage.class);
        homepage.open();
        Assert.assertEquals(homepage.first_cart_price(), homepage.prices[0]);
        Assert.assertEquals(homepage.second_cart_price(), homepage.prices[1]);
        Assert.assertEquals(homepage.third_cart_price(), homepage.prices[2]);
        Assert.assertEquals(homepage.fourth_cart_price(), homepage.prices[3]);
        Assert.assertEquals(homepage.fifth_cart_price(),homepage.prices[4]);
        Assert.assertEquals(homepage.sixth_cart_price(), homepage.prices[5]);
        Assert.assertEquals(homepage.seventh_cart_price(), homepage.prices[6]);
    }

}
