package github;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelenideRepository {


    @BeforeAll
    static void configure() {
        Configuration.baseUrl = "https://github.com/";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void selenideTest() {
        open("selenide/selenide/");
        $("#wiki-tab").click();
        $(".markdown-body").shouldHave(text("Soft Assertion"));
        $("#wiki-body > div > ul:nth-child(3) > li:nth-child(7) > a").click();
        $(".markdown-body").shouldHave(text("3. Using JUnit5 extend test class:"));


    }

}
