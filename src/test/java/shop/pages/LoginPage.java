package shop.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class LoginPage {
    private WebDriver driver;
    private WebDriverWait wait;

   @FindBy
   By row=By.className("row");

   @FindBy(id = "email")
            private WebElement email;

   @FindBy(id = "passwd")
            private WebElement password;

   @FindBy(id = "SubmitLogin")
            private WebElement submitnutton;

   @FindBy(xpath = "//a[@class=\"account\"]")
            private WebElement customer_name;

   @FindBy(id = "email_create")
            private WebElement email_create_field;


    @FindBy(id = "SubmitCreate")
             private WebElement submit_button_create;

    @FindBy(id = "customer_firstname")
            private WebElement customer_first_name;

    @FindBy(xpath = "//input[@id=\"id_gender2\"]")
            private WebElement gender_checkbox;

    @FindBy(id = "customer_lastname")
             private WebElement customer_lastname;

    @FindBy(id = "passwd")
             private WebElement customer_password;

    @FindBy(id = "days")
             private WebElement days;

    @FindBy(id = "months")
            private WebElement months;

    @FindBy(id = "years")
            private WebElement years;

    @FindBy(id = "company")
            private WebElement company;

    @FindBy(id = "address1")
            private WebElement address;

    @FindBy(id = "city")
            private WebElement city;

    @FindBy(id = "postcode")
            private WebElement postcode;

    @FindBy(id = "id_country")
            private WebElement country;

    @FindBy(id = "phone")
            private WebElement phone;

    @FindBy(id = "submitAccount")
            private WebElement register_button;

    @FindBy(id = "id_state")
            private WebElement state;



    Random rand = new Random();
    int a = rand.nextInt(300)+1;


    public LoginPage(WebDriver driver) {
        this.driver=driver;
        wait = new WebDriverWait(driver,10);
    }


    public void open(){

        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    public void started(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(row));
    }


    public void fiilform(String email_form, String passwd_form){

        email.sendKeys(email_form);
        password.sendKeys(passwd_form);
    }

    public void submitform(){
        submitnutton.click();
    }

    public void check_name(){

        Assert.assertEquals(customer_name.getText(), "John Andry");
    }

    public void fill_email_field() {
        String customer_email="snowiing_"+ a +"_man_"+"@gmail.com";
        email_create_field.sendKeys(customer_email);
        submit_button_create.click();
    }
    public void fill_fields(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer_firstname")));
        gender_checkbox.click();
        String firstname = "John";
        String lastname="Andry";
        customer_first_name.sendKeys(firstname);
        customer_lastname.sendKeys(lastname);
        String password=("sdd"+ a +"sas");
        customer_password.sendKeys(password);
        Select dropdown_days=new Select(days);
        dropdown_days.selectByValue("2");
        Select dropdown_month=new Select(months);
        dropdown_month.selectByValue("1");
        Select dropdown_years=new Select(years);
        dropdown_years.selectByValue("2020");
        company.sendKeys("testcompany");
        address.sendKeys("Dnipro");
        city.sendKeys("Test City");
        postcode.sendKeys("00000");
        Select dropdown_country=new Select(country);
        dropdown_country.selectByValue("21");
        phone.sendKeys("2389273");
        Select dropdown_state = new Select(state);
        dropdown_state.selectByValue("1");
        register_button.click();
    }

}
