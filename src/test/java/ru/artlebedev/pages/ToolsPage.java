package ru.artlebedev.pages;

import org.openqa.selenium.By;
import ru.artlebedev.components.MenuBlock;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.testng.Assert.assertTrue;

public class ToolsPage extends BasePage<ToolsPage> {
    private static final By MATRIX_LINK = By.cssSelector("a.item-matrix");

    public ToolsPage checkToolsPageUrl(){
        assertTrue(getWebDriver().getCurrentUrl().contains("/tools/"));
        return this;
    }

    public MatrixPage clickOnMatrixLink(){
        $(MATRIX_LINK).click();
        return page(MatrixPage.class);
    }


}
