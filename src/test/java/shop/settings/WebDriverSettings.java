package shop.settings;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverSettings {
    public WebDriver driver;
    public WebDriverWait wait;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver(); //берем Webdriver, инициализируем его в переменную драйвер и иницализируем его как хромедрайвер
        wait=new WebDriverWait(driver,10);
    }


    @After
    public void close() {
        //driver.quit();
    }










}
