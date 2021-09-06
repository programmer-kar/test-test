package shop.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//a[text()=\"Women\"]")
    private WebElement women;

    @FindBy(xpath = "//a[text()=\"T-shirts\"]")
    private WebElement t_shirts;

    @FindBy(xpath = "//a[text()=\"Blouses\"]")
    private WebElement Blouses;

    @FindBy(xpath = "//a[text()=\"Casual Dresses\"]")
    private WebElement casual_dresses;

    @FindBy(xpath = "//a[text()=\"Evening Dresses\"]")
    private WebElement evening_dresses;

    @FindBy(xpath = "//a[text()=\"Summer Dresses\"]")
    private WebElement summer_dresses;

    @FindBy(xpath = "//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[1]/span")
    private WebElement first_cart_price;

    @FindBy(xpath = "//*[@id=\"homefeatured\"]/li[2]/div/div[2]/div[1]/span")
    private WebElement second_cart_price;

    @FindBy(xpath = "//*[@id=\"homefeatured\"]/li[3]/div/div[2]/div[1]/span")
    private WebElement third_cart_price;

    @FindBy(xpath = "//*[@id=\"homefeatured\"]/li[4]/div/div[2]/div[1]/span")
    private WebElement fourth_cart_price;

    @FindBy(xpath = "//*[@id=\"homefeatured\"]/li[5]/div/div[2]/div[1]/span")
    private WebElement fifth_cart_price;

    @FindBy(xpath = "//*[@id=\"homefeatured\"]/li[6]/div/div[2]/div[1]/span")
    private WebElement sixth_cart_price;

    @FindBy(xpath = "//*[@id=\"homefeatured\"]/li[7]/div/div[2]/div[1]/span")
    private WebElement seventh_cart_price;

    @FindBy(xpath = "(//div[@class=\"product-container\"])[1]")
    public WebElement first_cart;

    @FindBy(xpath = "//a[@data-id-product=\"1\"]")
    public WebElement first_cart_button;

    @FindBy(className = "icon-ok")
    public WebElement popup_shopping_cart;

    @FindBy(id = "layer_cart_product_title")
    public WebElement cart_title;

    @FindBy(xpath = "//a[@title=\"Proceed to checkout\"]")
    public WebElement proceed_button;

    @FindBy(xpath = "//span[@title=\"Continue shopping\"]")
    public WebElement continue_button;

    @FindBy(xpath = "//a[@title=\"View my shopping cart\"]")
    public WebElement shopping_cart;

    @FindBy(css = ".cart_block_product_name")
    public WebElement cart_block_product_name;

    @FindBy(id = "button_order_cart")
    public WebElement checkout_button;


    public String[] prices={"$16.51","$27.00","$26.00","$50.99","$28.98","$30.50","$16.40"};

    public String[] top_navigation_links={
            "http://automationpractice.com/index.php?id_category=5&controller=category",
            "http://automationpractice.com/index.php?id_category=7&controller=category",
            "http://automationpractice.com/index.php?id_category=9&controller=category",
            "http://automationpractice.com/index.php?id_category=10&controller=category",
            "http://automationpractice.com/index.php?id_category=11&controller=category"
    };

    public HomePage(WebDriver driver) {
        this.driver=driver;
        wait = new WebDriverWait(driver,10);
    }


    public void open_women(){
        Actions action = new Actions(driver); action.moveToElement(women).build().perform();

    }
    public void open(){

        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().fullscreen();
    }

    public String t_shirts_link() {

        return  t_shirts.getAttribute("href");
    }

    public String blouses_link() {

        return Blouses.getAttribute("href");
    }

    public String casual_dresseslink() {
        return casual_dresses.getAttribute("href");

    }
    public String evening_dresseslink(){

        return evening_dresses.getAttribute("href");
    }

    public String summer_dresseslink(){

        return summer_dresses.getAttribute("href");
    }

    public String first_cart_price() {

        return first_cart_price.getText();
    }
    public String second_cart_price(){
        return second_cart_price.getText();
    }
    public String third_cart_price(){
        return third_cart_price.getText();
    }
    public String fourth_cart_price(){
        return fourth_cart_price.getText();
    }
    public String fifth_cart_price(){
        return fifth_cart_price.getText();
    }
    public String sixth_cart_price(){
        return sixth_cart_price.getText();
    }
    public String seventh_cart_price(){
        return seventh_cart_price.getText();
    }

    public void move_to_cart() {
        Actions action=new Actions(driver);
        action.moveToElement(first_cart).build().perform();
        first_cart_button.click();
        wait.until(ExpectedConditions.visibilityOf(popup_shopping_cart));
        Assert.assertEquals(cart_title.getText(), "Faded Short Sleeve T-shirts");
    }
}