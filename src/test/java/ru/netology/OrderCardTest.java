package ru.netology;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class OrderCardTest {
    private WebDriver driver;
    @BeforeAll
    public static void setupAll() {
        WebDriverManager.chromedriver().setup();
    }



    @Test
    void validAmountTest () throws InterruptedException {
        driver.get("http://localhost:9999/");




    }
}