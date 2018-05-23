package ru.artlebedev.pages;

import ru.artlebedev.components.MenuBlock;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class IndexPage extends BasePage<IndexPage> {
    private static final String URL = "https://www.artlebedev.ru/";
    MenuBlock menu;

    public static IndexPage enter() {
        open(URL);
        return page(IndexPage.class);
    }

    public ToolsPage clickOnToolsLink(){
        menu.clickOnToolsLink();
        return page(ToolsPage.class);
    }

}
