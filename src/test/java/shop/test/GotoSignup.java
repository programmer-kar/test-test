package shop.test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import shop.settings.WebDriverSettings;
import shop.pages.HomePage;

public class GotoSignup extends WebDriverSettings{

    @Test
    public void go_to_signup_from_home_page() {

        HomePage homepage = PageFactory.initElements(driver, HomePage.class);
        homepage.open();
        homepage.move_to_cart();
        Assert.assertEquals(homepage.cart_title.getText(), "Faded Short Sleeve T-shirts");
        homepage.proceed_button.click();
    }

    @Test
    public void go_to_signup_from_shopping_cart() {
        HomePage homepage = PageFactory.initElements(driver, HomePage.class);
        homepage.open();
        homepage.move_to_cart();
        homepage.continue_button.click();

        Actions action=new Actions(driver);
        action.moveToElement(homepage.shopping_cart).build().perform();
        Assert.assertEquals(homepage.cart_block_product_name.getText(),"Faded Shor...");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("button_order_cart")));
        homepage.checkout_button.click();

    }


}



