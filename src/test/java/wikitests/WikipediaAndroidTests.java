package wikitests;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static io.qameta.allure.Allure.step;

public class WikipediaAndroidTests extends TestBase {


  @Disabled
  @Description("Тест работает на эмуляторе, на browserstack нет")
  @Owner("nkramar")
  @Feature("Страницы регистрации")
  @Story("Навигация по страницам регистрации")
  @CsvSource(value = {
          "1, The Free Encyclopedia …in over 300 languages",
          "2, New ways to explore",
          "3, Reading lists with sync",
          "4, Send anonymous data"
  })
  @ParameterizedTest(name = "Проверка текста на странице регистрации {0}")
  public void checkOnBoardingTexts(int pageNumber, String pageText) {

    step("Переключение на следующий экран", ()
            -> wikiOnBoardingPage.clickOnNextPage(pageNumber));
    step("Проверка текста на экране", ()
            -> wikiOnBoardingPage.shouldHavePrimaryText(pageText));
  }

  @Tag("android")
  @Test
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
            -> wikiAddLanguagesPage.checkListOfAddedLanguages());

    step("Вернуться на первый экран", ()
            -> wikiAddLanguagesPage.clickBackButton());

    step("Проверить, что список языков на первом экране состоит из 2 языков", ()
            -> wikiAddLanguagesPage.checkSizeOfLanguagesList());
  }

  @Tag("android")
  @Test
  @Owner("nkramar")
  @Feature("Страницы регистрации")
  @Story("Навигация по страницам регистрации")
  @DisplayName("Проверка главного текста на 4х экранах")
  void checkPrimaryTextsOnScreens() {

    step("Проверка текста на первом экране", () -> {
      wikiOnBoardingPage.shouldHavePrimaryText(wikiOnBoardingPage.textOnFirstScreen); });

    step("Нажимаем на кнопку 'continue'", () -> wikiOnBoardingPage.clickContinueButton());

    step("Проверка текста на втором экране", () -> {
      wikiOnBoardingPage.shouldHavePrimaryText(wikiOnBoardingPage.textOnSecondScreen); });

    step("Нажимаем на кнопку 'continue'", () -> wikiOnBoardingPage.clickContinueButton());

    step("Проверка текста на третьем экране", () -> {
      wikiOnBoardingPage.shouldHavePrimaryText(wikiOnBoardingPage.textOnThirdScreen); });

    step("Нажимаем на кнопку 'continue'", () -> wikiOnBoardingPage.clickContinueButton());

    step("Проверка текста на четвёртом экране", () -> {
      wikiOnBoardingPage.shouldHavePrimaryText(wikiOnBoardingPage.textOnFourthScreen); });
  }

  @Tag("android")
  @Test
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


