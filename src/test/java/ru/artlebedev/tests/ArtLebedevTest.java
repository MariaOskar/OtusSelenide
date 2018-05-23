package ru.artlebedev.tests;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ru.artlebedev.pages.IndexPage;

public class ArtLebedevTest {
    @BeforeTest
    public void beforeTest() {
        Configuration.browser = "chrome";
        WebDriverManager.chromedriver().setup();
    }
    @Test
    public void test(){
        IndexPage
                .enter()
                .clickOnToolsLink()
                .checkToolsPageUrl()
                .clickOnMatrixLink()
                .checkMatrixPageUrl()
                .focusOnInput()
                .clearQueryInput()
                .putQueryToInput()
                .clickOnSubmitButton()
                .checkResultColumnsVisibility()
                .checkResultColumnsContent()
        ;
    }

}
