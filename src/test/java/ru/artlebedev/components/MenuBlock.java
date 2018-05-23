package ru.artlebedev.components;

import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MenuBlock  extends ElementsContainer {
    private static final By ROOT_ELEMENT = By.cssSelector("div.main-menu menu");
    private static final By MENU_ITEMS = By.cssSelector("li");

    public void clickOnToolsLink(){
        getRootElement().$$(MENU_ITEMS).get(1).click();
    }

    private SelenideElement getRootElement(){
        return $(ROOT_ELEMENT);
    }
}
