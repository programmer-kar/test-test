package shop.test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import shop.settings.WebDriverSettings;
import shop.pages.HomePage;

public class TopNavigation extends WebDriverSettings {

    @Test
    public void topnavigation(){
        HomePage homepage = PageFactory.initElements(driver, HomePage.class);
        homepage.open();
        homepage.open_women();
        Assert.assertEquals(homepage.t_shirts_link(), homepage.top_navigation_links[0]);
        Assert.assertEquals(homepage.blouses_link(), homepage.top_navigation_links[1]);
        Assert.assertEquals(homepage.casual_dresseslink(), homepage.top_navigation_links[2]);
        Assert.assertEquals(homepage.evening_dresseslink(), homepage.top_navigation_links[3]);
        Assert.assertEquals(homepage.summer_dresseslink(), homepage.top_navigation_links[4]);
    }

}
