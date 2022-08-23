package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class WikiAddLanguagesPage {
  SelenideElement
          addOrEditLanguagesBtn = $(AppiumBy.id("org.wikipedia.alpha:id/addLangContainer")),
          addLanguageBtn = $$(AppiumBy.id("org.wikipedia.alpha:id/wiki_language_title")).last(),
          addGerman = $$(AppiumBy.id("org.wikipedia.alpha:id/language_subtitle")).findBy(text("German")),
          backButton = $(AppiumBy.className("android.widget.ImageButton")),
          languagesList = $(AppiumBy.id("org.wikipedia.alpha:id/languagesList"));

  ElementsCollection wikiLanguagesListOnFirstScreen = $$(AppiumBy.id("org.wikipedia.alpha:id/wiki_language_title"));

  public void clickAddOrEditLanguages() {
    addOrEditLanguagesBtn.click();
  }

  public void clickAddLanguage() {
    addLanguageBtn.click();
  }

  public void addGermanLanguage() {
    addGerman.shouldBe(visible).click();
  }

  public void clickBackButton() {
    backButton.click();
  }

  public void checkListOfAddedLanguages() {
    wikiLanguagesListOnFirstScreen.shouldHave(texts("English", "Deutsch", "ADD LANGUAGE"));
  }

  public void checkSizeOfLanguagesList() {
    languagesList.$$(AppiumBy.id("org.wikipedia.alpha:id/option_label")).shouldHave(size(2));
  }
}
