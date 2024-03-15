package ru.netology;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class OrderCardTest {

    @Test
    void validAmountTest() {

        open("http://localhost:9999/");
        //SelenideElement form = $("[form_size_m form_theme_alfa-on-white]");
        //form.$("[data-test-id=name] input").setValue("Слава");
        //form.$("[data-test-id=phone] input").setValue("89999999999");
        //form.$("[data-test-id=agreement]").click();
        //form.$("[data-test-id=submit]").click();
        //$(".alert-success").shouldHave(Condition.exactText("  Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));


    }
}