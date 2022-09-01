package wikitests;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static io.qameta.allure.Allure.step;

public class AndroidTests extends TestBase {

  @Test
  @Tag("android")
  @Owner("nkramar")
  @Feature("Страница с языками")
  @Story("Добавление языка к Wikipedia")
  @DisplayName("Добавление немецкого языка к Wikipedia")
  void addLanguageOnFirstScreen() {

    step("Нажать на кнопку 'add or edit languages'", ()
            -> wikiAddLanguagesPage.clickAddOrEditLanguages());

    step("Нажать на кнопку 'add language'", ()
            -> wikiAddLanguagesPage.clickAddLanguage());

    step("Выбрать немецкий язык 'German'", ()
            -> wikiAddLanguagesPage.addGermanLanguage());

    step("Проверить что немецкий язык добавлен в список языков Wikipedia", ()
            -> wikiAddLanguagesPage.checkListOfAddedLanguages("EN", "DE"));

    step("Вернуться на первый экран", ()
            -> wikiAddLanguagesPage.clickBackButton());

    step("Проверить, что список языков на первом экране состоит из 2 языков", ()
            -> wikiAddLanguagesPage.checkSizeOfLanguagesList(2));
  }

  @Test
  @Tag("android")
  @Owner("nkramar")
  @Feature("Стартовые настройки")
  @Story("Навигация по стартовым страницам")
  @DisplayName("Проверка главного текста на 4х экранах")
  void checkPrimaryTextsOnScreens() {

    step("Проверка текста на первом экране", ()
            -> wikiOnBoardingPage.shouldHavePrimaryText(wikiOnBoardingPage.textOnFirstScreen));

    step("Нажимаем на кнопку 'continue'", ()
            -> wikiOnBoardingPage.clickContinueButton());

    step("Проверка текста на втором экране", ()
            -> wikiOnBoardingPage.shouldHavePrimaryText(wikiOnBoardingPage.textOnSecondScreen));

    step("Нажимаем на кнопку 'continue'", ()
            -> wikiOnBoardingPage.clickContinueButton());

    step("Проверка текста на третьем экране", ()
            -> wikiOnBoardingPage.shouldHavePrimaryText(wikiOnBoardingPage.textOnThirdScreen));

    step("Нажимаем на кнопку 'continue'", ()
            -> wikiOnBoardingPage.clickContinueButton());

    step("Проверка текста на четвёртом экране", ()
            -> wikiOnBoardingPage.shouldHavePrimaryText(wikiOnBoardingPage.textOnFourthScreen));
  }

  @Test
  @Tag("android")
  @Owner("nkramar")
  @Feature("Страница поиска")
  @Story("Поиск и открытие статьи")
  @DisplayName("Поиск и открытие статьи в Wikipedia")
  void searchAndOpenArticleTest() {

    step("Переходим со страницы выбора языка на страницу поиска", Selenide::back);

    step("Вводим текст запроса в поле поиска", () -> {
      wikiSearchPage.clickOnSearchContainer();
      wikiSearchPage.setSearchText("Java"); });

    step("Проверяем, что список результатов поиска не пустой", ()
            -> wikiSearchPage.checkSizeOfResultList());

    step("Открываем статью про язык программирования Java ", ()
            -> wikiSearchPage.openSearchResultItem("Java (programming language)"));

    step("Проверяем логотип Java на открывшейся странице", ()
            -> wikiSearchPage.checkImageInArticle());
  }
}


