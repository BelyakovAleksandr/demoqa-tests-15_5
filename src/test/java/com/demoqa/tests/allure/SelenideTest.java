package com.demoqa.tests.allure;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class SelenideTest {
    @Test
    public void testSelenide() {

        SelenideLogger.addListener("allure", new AllureSelenide());

        open("https://github.com/");

        $("[name = q]").setValue("anastasia-razumova/demoqa-tests-15").pressEnter();
        $(linkText("anastasia-razumova/demoqa-tests-15")).click();
        $(partialLinkText("Issues")).shouldHave(text("Issues"));
    }
}
