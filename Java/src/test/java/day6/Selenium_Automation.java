package day6;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class Selenium_Automation {
    public static ChromeDriver driver = null;

    public static void main(String args[]) {
        driver = new ChromeDriver();
//        String[] accounts = {"standard_user", "locked_out_user", "problem_user", "performance_glitch_user"};
//        for (String username : accounts) {
//            login(username, "secret_sauce");
//        }
        Account account = new Account();
        account.setUsername("standard_user");
        account.setPassword("secret_sauce");
        login(account);

        List<WebElement> listOfElements = driver.findElements(By.xpath("//*[contains(@class,'btn_inventory')]"));
        for (WebElement element:listOfElements)
        {
            element.click();
        }
    }
    public static void login (String username, String password)
    {
        driver.get("https://www.saucedemo.com/");
        WebElement input_username = driver.findElement(By.id("user-name"));
        input_username.sendKeys(username);
        WebElement input_password = driver.findElement(By.id("password"));
        input_password.sendKeys(password);
        WebElement button_login = driver.findElement(By.id("login-button"));
        button_login.click();
    }

    public static void login(Account account)
    {
        driver.get("https://www.saucedemo.com/");
        WebElement input_username = driver.findElement(By.id("user-name"));
        input_username.sendKeys(account.getUsername());
        WebElement input_password = driver.findElement(By.id("password"));
        input_password.sendKeys(account.getPassword());
        WebElement button_login = driver.findElement(By.id("login-button"));
        button_login.click();
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("inventory"));
    }
}
