package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class WikiSearchPage {

  SelenideElement
          searchContainer = $(AppiumBy.id("org.wikipedia.alpha:id/search_container")),
          searchField = $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")),
          pageHeaderImage = $(AppiumBy.id("org.wikipedia.alpha:id/view_page_header_image"));

  ElementsCollection
          searchResultList = $$(AppiumBy.id("org.wikipedia.alpha:id/search_results_list")),
          searchResultListItem = $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title"));

  public void clickOnSearchContainer() {
    searchContainer.click();
  }

  public void setSearchText(String searchText) {
    searchField.sendKeys(searchText);
  }

  public void checkSizeOfResultList() {
    searchResultList.shouldHave(CollectionCondition.sizeGreaterThan(0));
  }

  public void openSearchResultItem(String resultItem) {
    searchResultListItem.findBy(text(resultItem)).click();
  }

  public void checkImageInArticle() {
    pageHeaderImage.shouldBe(visible);
  }
}
