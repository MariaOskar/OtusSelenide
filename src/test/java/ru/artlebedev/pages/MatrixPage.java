package ru.artlebedev.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import ru.artlebedev.components.MenuBlock;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.testng.Assert.assertTrue;

public class MatrixPage extends BasePage<MatrixPage> {
    private static final String QUERY = "потолок молоток";
    private static final By INPUT_ELEMENT = By.cssSelector(".matrix-form input[name=Word]");
    private static final By SUBMIT_BUTTON_ELEMENT = By.cssSelector(".matrix-form button[type=submit]");
    private static final By RESULT_COLUMNS_ELEMENTS = By.cssSelector(".als-text-container .als-columns .col-self-tablet-12");

    MenuBlock menu;


    public MatrixPage checkMatrixPageUrl(){
        assertTrue(getWebDriver().getCurrentUrl().contains("/matrix/"));
        return this;
    }

    public MatrixPage checkResultColumnsContent(){
        assertTrue(getResultColumns().get(0).$$(By.tagName("BR")).size()==12);
        assertTrue(getResultColumns().get(1).$$(By.tagName("BR")).size()==12);
        return this;
    }

    public MatrixPage checkResultColumnsVisibility(){
        getResultColumns().get(0).shouldBe(Condition.visible);
        getResultColumns().get(1).shouldBe(Condition.visible);
        return this;
    }

    public MatrixPage clickOnSubmitButton(){
        getSubmitButtonElement().click();
        return this;
    }

    public MatrixPage clearQueryInput(){
        getInputElement().clear();
        return this;
    }

    public MatrixPage putQueryToInput(){
        getInputElement().sendKeys(QUERY);
        return this;
    }

    public MatrixPage focusOnInput(){
        getInputElement().click();
        return this;
    }

    private SelenideElement getInputElement(){
        return $(INPUT_ELEMENT);
    }

    private SelenideElement getSubmitButtonElement(){
        return $(SUBMIT_BUTTON_ELEMENT);
    }

    private ElementsCollection getResultColumns(){
        return $$(RESULT_COLUMNS_ELEMENTS);
    }

}
