package pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;


public class WikiOnBoardingPage {
  SelenideElement
          primaryTextView = $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView")),
          onBoardingPageIndicator = $(AppiumBy.id("org.wikipedia.alpha:id/view_onboarding_page_indicator")),
          continueButton = $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button"));

  public final String
          textOnFirstScreen = "The Free Encyclopedia …in over 300 languages",
          textOnSecondScreen = "New ways to explore",
          textOnThirdScreen = "Reading lists with sync",
          textOnFourthScreen = "Send anonymous data";


  public WikiOnBoardingPage shouldHavePrimaryText(String value) {
    primaryTextView.shouldHave(text(value));
    return this;
  }

  public WikiOnBoardingPage clickOnNextPage(int pageNumber) {
    onBoardingPageIndicator.find(".android.widget.LinearLayout", pageNumber).click();
    return this;
  }

  public void clickContinueButton() {
    continueButton.click();
  }
}