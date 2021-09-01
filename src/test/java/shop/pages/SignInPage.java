package shop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import shop.settings.WebDriverSettings;

public class SignInPage extends WebDriverSettings {
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "(//a[@title=\"Proceed to checkout\"])[2]")
    public WebElement proceed_button;

    @FindBy(xpath = "//li[@class=\"address_firstname address_lastname\"]")
    public WebElement address_first_last_name;

    @FindBy(xpath = "//li[@class=\"address_company\"]")
    public WebElement address_company;

    @FindBy(xpath = "//li[@class=\"address_address1 address_address2\"]")
    public WebElement address1_address2;

    @FindBy(xpath = "//li[@class=\"address_city address_state_name address_postcode\"]")
    public WebElement address_city;

    @FindBy(xpath = "//li[@class=\"address_country_name\"]")
    public WebElement address_country;

    @FindBy(xpath = "//li[@class=\"address_phone\"]")
    public WebElement address_phone;

    @FindBy(xpath = "//li[@class=\"address_phone_mobile\"]")
    public WebElement address_phone_mobile;

    @FindBy(xpath = "//button[@name=\"processAddress\"]")
    public WebElement third_step_proceed_to_checkout;

    @FindBy(xpath = "//button[@name=\"processCarrier\"]")
    public WebElement fourth_step_proceed_to_checkout;

    @FindBy(xpath = "//input[@type=\"checkbox\"]")
    public WebElement checkbox;

    @FindBy(xpath = "//a[@class=\"bankwire\"]")
    public WebElement first_bank;

    @FindBy(xpath = "//button[@class=\"button btn btn-default button-medium\"]")
    public WebElement confirm_order_button;

    public String[] test_data={
            "snowing_93_man_@gmail.com",
            "sdd93sas",
            "John Andry",
            "testcompany",
            "adress1 test93",
            "city93, Alabama 00000",
            "234234234",
            "2984892"
    };

    public SignInPage(WebDriver driver) {
        this.driver=driver;
        wait = new WebDriverWait(driver,10);
    }







}
